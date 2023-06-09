/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.subClasses.TipoDeGastos;
import com.tp.persistencia.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
/**
 *
 * @author Julio
 */

public class TipoDeGastosDao implements ITipoDeGastosDao{
    
    public ArrayList<TipoDeGastos> listarTiposDeGasto() throws Exception {
    ArrayList<TipoDeGastos> tiposDeGasto = new ArrayList<>();

    try {
        String sql = "SELECT * FROM tipodegastos";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            int id = rs.getInt("id");
            String descricao = rs.getString("descricao");

            TipoDeGastos tipoDeGasto = new TipoDeGastos(id, descricao);
            tiposDeGasto.add(tipoDeGasto);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new Exception("Erro ao listar os tipos de gasto: " + e.getMessage());
    }

    return tiposDeGasto;
}

    
    public int encontrarIdTipoDeGastoPorDescricao(String descricao) {
    int idTipoDeGasto = -1; // Valor padrão caso a descrição não seja encontrada

    try {
        ITipoDeGastosDao tipoDeGastosDao = new TipoDeGastosDao();
        // Obtenha a lista de tipos de gastos do banco de dados
        ArrayList<TipoDeGastos> tiposDeGasto = tipoDeGastosDao.listaDeTipoDeGasto();

        // Procure o TipoDeGasto com a descrição correspondente
        for (TipoDeGastos tipoDeGasto : tiposDeGasto) {
            if (tipoDeGasto.getDescricao().equalsIgnoreCase(descricao)) {
                idTipoDeGasto = tipoDeGasto.getId();
                break;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

        return idTipoDeGasto;
    }

    
    
    private Connection conexao = null;
    public TipoDeGastosDao() throws Exception{
        conexao = ConexaoBanco.getConexao();
    }
    
    public TipoDeGastos getTipoDeGastosById(int id) throws Exception {
        TipoDeGastos tipoDeGastos = null;
        try {
            String sql = "SELECT * FROM tipodegastos WHERE id = ?";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
            // Recupera as informações do ResultSet
                String descricao = resultSet.getString("descricao");

            // Instancia o objeto TipoDeGastos
                tipoDeGastos = new TipoDeGastos(descricao);
            }
        } catch (SQLException erro) {
            throw new Exception("SQL ERRO:" + erro.getMessage());
        } catch (Exception erro) {
            throw erro;
        }
        return tipoDeGastos;
    }


    @Override
    public void createTipoDeGasto(TipoDeGastos isTipoDeGastos) throws Exception {
        try{
            String sql = "insert into tipodegastos(descricao) values(?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, isTipoDeGastos.getDescricao());
            preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
        }catch(SQLException erro){
            throw new Exception("SQL ERRO:" + erro.getMessage());
        }catch(Exception erro){
            throw erro;
        }

    }

    @Override
    public ArrayList<TipoDeGastos> listaDeTipoDeGasto() throws Exception {
        ArrayList<TipoDeGastos>listaDeTipoDeGastos = new ArrayList<TipoDeGastos>();
        String sql = "Select * From tipodegastos";
        try{
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
            TipoDeGastos isTipoDeGastos = new TipoDeGastos();
            isTipoDeGastos.setId(rs.getInt("id"));
            isTipoDeGastos.setDescricao(rs.getString("descricao"));
            listaDeTipoDeGastos.add(isTipoDeGastos);
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("isProblem in listaDeTipoDeGastos()_TipoDeGastosDao");
        }
        return listaDeTipoDeGastos;
    }

    @Override
    public ArrayList<TipoDeGastos> deletarTipoDeGasto(int idT) throws Exception {
        ArrayList<TipoDeGastos> listaDeTipoDeGastos = new ArrayList<>();
    String sql = "DELETE FROM tipodegastos WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setInt(1, idT);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao excluir o tipo de gasto: " + e.getMessage());
    }
    listaDeTipoDeGastos = listaDeTipoDeGasto();
    return listaDeTipoDeGastos;
    }

    @Override
    public ArrayList<TipoDeGastos> alterarTipoDeGasto(TipoDeGastos gastos) throws Exception {
            ArrayList<TipoDeGastos>alterarTipoDeGastos = new ArrayList<TipoDeGastos>();
       String sql = "UPDATE tipodegastos SET descricao = ? WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setString(1, gastos.getDescricao());
        preparedStatement.setInt(2, gastos.getId());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao alterar o tipo de gasto: " + e.getMessage());
    }
       return alterarTipoDeGastos;
    }

    @Override
    public boolean descricaoJaExiste(String descricao) {
        String query = "SELECT COUNT(*) FROM tipodegastos WHERE descricao = ?";
        try (Connection conn = ConexaoBanco.getConexao();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, descricao);
            ResultSet rs = stmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            return count > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao verificar se a descrição existe: " + e.getMessage());
        } catch (Exception ex) {
        Logger.getLogger(TipoDeGastosDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
    }

    @Override
    public ArrayList<String> listarDescricoesTipoDeGastos() throws Exception {
    ArrayList<String> descricoes = new ArrayList<>();
    String sql = "SELECT descricao FROM tipodegastos";
    try (Statement statement = conexao.createStatement();
         ResultSet resultSet = statement.executeQuery(sql)) {
        while (resultSet.next()) {
            String descricao = resultSet.getString("descricao");
            descricoes.add(descricao);
        }
    } catch (SQLException e) {
        throw new Exception("Erro ao listar as descrições dos tipos de gastos: " + e.getMessage());
    }
    return descricoes;
}

    
}

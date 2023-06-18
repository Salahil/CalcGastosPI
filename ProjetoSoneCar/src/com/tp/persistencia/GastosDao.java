/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.subClasses.Gastos;
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
 *
 * @author Julio
 */
public class GastosDao implements IGastosDao {

    private Connection conexao = null;
    public GastosDao()throws Exception{
        conexao = ConexaoBanco.getConexao();
    }
    TipoDeGastosDao tipoDeGastosDao = new TipoDeGastosDao();
    

    @Override
    public Gastos getGasto(int id) throws Exception {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Gastos gastos = null;

    try {
        con = ConexaoBanco.getConexao();
        String query = "SELECT * FROM gastos WHERE id = ?";
        ps = con.prepareStatement(query);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        if (rs.next()) {
            // Ler os valores do ResultSet e criar um objeto Gastos
            int gastoId = rs.getInt("id");
            float valor = rs.getFloat("valor");
            // Recupere outros atributos do gasto aqui

            gastos = new Gastos();
            gastos.setId(gastoId);
            gastos.setValor(valor);
            // Defina outros atributos do gasto aqui
        }
    } finally {
        // Feche as conexões e os recursos
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (con != null) {
            con.close();
        }
    }

    return gastos;
}

    
    @Override
    public void createGasto(Gastos isGastos) throws Exception {
        try {
        String sql = "INSERT INTO gastos (valor, data, Tipodegastos) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setFloat(1, isGastos.getValor());

        // Converter java.util.Date para java.sql.Date
        java.util.Date utilDate = isGastos.getDateDataDeRegistroDeGasto();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        //preparedStatement.setString(6, isVeiculo.getMarca().getDescricao());

        preparedStatement.setDate(2, sqlDate);
        preparedStatement.setString(3, isGastos.toStringIDTipodegasto());
        preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
    } catch (SQLException erro) {
        throw new Exception("SQL ERRO:" + erro.getMessage());
    } catch (Exception erro) {
        throw erro;
    }
    }

    @Override
    public ArrayList<Gastos> alterarGastos(Gastos gastos) throws Exception {
        ArrayList<Gastos> alterarGastos = new ArrayList<Gastos>();
    String sql = "UPDATE gastos SET valor = ?, data = ? WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setFloat(1, gastos.getValor());

        // Converter java.util.Date para java.sql.Date
        java.util.Date utilDate = gastos.getDateDataDeRegistroDeGasto();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        preparedStatement.setDate(2, sqlDate);
        preparedStatement.setInt(3, gastos.getId());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao alterar o Valor: " + e.getMessage());
    }
    return alterarGastos;
    }

    @Override
    public ArrayList<Gastos> excluirGastos(int id) throws Exception {
        ArrayList<Gastos> listaDeGastos = new ArrayList<Gastos>();
    String sql = "DELETE FROM gastos WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao excluir a marca: " + e.getMessage());
    }
    listaDeGastos = listarGastos(id); // Atualiza a lista de marcas após a exclusão
    return listaDeGastos;
    }

    @Override
    public ArrayList<Gastos> listarGastos(int id) throws Exception {
        ArrayList<Gastos> listagemGastos = new ArrayList<Gastos>();
    String sql = "SELECT * FROM gastos";
    try {
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            Gastos isGastos = new Gastos();
            isGastos.setId(rs.getInt("id"));
            isGastos.setDateDataDeRegistroDeGasto(rs.getDate("data"));
            isGastos.setValor(rs.getFloat("valor"));

            // Aqui você pode adicionar o código para obter e definir o objeto TipoDeGastos
            // Exemplo:
            int tipoDeGastosId = rs.getInt("Tipodegastos");
            TipoDeGastos tipoDeGastos = tipoDeGastosDao.getTipoDeGastosById(tipoDeGastosId);
            isGastos.setDescricao(tipoDeGastos);


            listagemGastos.add(isGastos);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Problem in listarGastos()_GastosDao");
    }
    return listagemGastos;
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

}
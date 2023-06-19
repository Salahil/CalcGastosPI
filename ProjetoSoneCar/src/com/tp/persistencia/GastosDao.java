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
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Julio
 */
public class GastosDao implements IGastosDao {
    
   public ArrayList<Gastos> listarGastosPorTipo(String tipoDeGastosDescricao) throws Exception {
    ArrayList<Gastos> listaGastos = new ArrayList<>();

    String sql = "SELECT * FROM gastos WHERE tipodegastos = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setString(1, tipoDeGastosDescricao);
        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            Gastos gastos = new Gastos();
            gastos.setId(rs.getInt("id"));
            gastos.setValor(rs.getFloat("valor"));
            gastos.setDateDataDeRegistroDeGasto(rs.getDate("data"));
            gastos.setTipoDeGastos(new TipoDeGastos(rs.getString("tipodegastos")));
            listaGastos.add(gastos);
        }
    } catch (SQLException e) {
        throw new Exception("Erro ao listar gastos por tipo: " + e.getMessage());
    }

    return listaGastos;
}




    private Connection conexao = null;
    public GastosDao()throws Exception{
        conexao = ConexaoBanco.getConexao();
    }
      
    @Override
    public void createGasto(Gastos isGastos) throws Exception {
        try {
        String sql = "INSERT INTO gastos (valor, data, tipodegastos) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setFloat(1, isGastos.getValor());

        // Converter java.util.Date para java.sql.Date
        java.util.Date utilDate = isGastos.getDateDataDeRegistroDeGasto();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        //preparedStatement.setString(6, isVeiculo.getMarca().getDescricao());

        preparedStatement.setDate(2, sqlDate);
        preparedStatement.setString(3, isGastos.getTipoDeGastos().toStringDescricao());
        preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
    } catch (SQLException erro) {
        throw new Exception("SQL ERRO:" + erro.getMessage());
    } catch (Exception erro) {
        throw erro;
    }
    }

    @Override
    public ArrayList<Gastos> alterarGastos(Gastos gastos) throws Exception {
    String sql = "UPDATE gastos SET valor = ?, data = ?, tipodegastos = ? WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setFloat(1, gastos.getValor());
        preparedStatement.setDate(2, new java.sql.Date(gastos.getDateDataDeRegistroDeGasto().getTime()));
        preparedStatement.setString(3, gastos.getTipoDeGastos().getDescricao());
        preparedStatement.setInt(4, gastos.getId());
       
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao alterar os gastos: " + e.getMessage());
    }
        return null;
    }


    @Override
    public ArrayList<Gastos> excluirGastos(int id) throws Exception {
        ArrayList<Gastos> listaDeGastos = new ArrayList<Gastos>();
    String sql = "DELETE FROM gastos WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao excluir a gastos: " + e.getMessage());
    }
    listaDeGastos = listarGastos(id); // Atualiza a lista de marcas após a exclusão
    return listaDeGastos;
    }

    @Override
    public ArrayList<Gastos> listarGastos(int id) throws Exception {
    ArrayList<Gastos> listaDeGastos = new ArrayList<>();

    try {
        String sql = "SELECT * FROM gastos";
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            Gastos gastos = new Gastos();
            gastos.setId(rs.getInt("id"));
            gastos.setValor(rs.getFloat("valor"));
            gastos.setDateDataDeRegistroDeGasto(rs.getDate("data"));
            gastos.setTipoDeGastos(new TipoDeGastos(rs.getString("tipodegastos")));

            listaDeGastos.add(gastos);
        }
    } catch (SQLException e) {
        throw new Exception("Erro ao listar os gastos: " + e.getMessage());
    }

    return listaDeGastos;
}
    @Override
    public ArrayList<TipoDeGastos> listarTiposDeGastos() throws Exception {
    ArrayList<TipoDeGastos> listaDeTipos = new ArrayList<>();

    try {
        String sql = "SELECT * FROM tiposdegastos";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            TipoDeGastos tipo = new TipoDeGastos();
            tipo.setId(resultSet.getInt("id"));
            tipo.setDescricao(resultSet.getString("descricao"));

            listaDeTipos.add(tipo);
        }
    } catch (SQLException e) {
        throw new Exception("Erro ao listar os tipos de gastos: " + e.getMessage());
    }

    return listaDeTipos;
}

    @Override
    public ArrayList<Gastos> listarGastos() {
    ArrayList<Gastos> listaDeGastos = new ArrayList<>();

    try {
        String sql = "SELECT * FROM gastos";
        Statement statement = conexao.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Gastos gastos = new Gastos();
            gastos.setId(resultSet.getInt("id"));
            gastos.setValor(resultSet.getFloat("valor"));
            gastos.setDateDataDeRegistroDeGasto(resultSet.getDate("data"));
            gastos.setTipoDeGastos(new TipoDeGastos(resultSet.getString("tipodegastos")));

            listaDeGastos.add(gastos);
        }
    } catch (SQLException e) {
        try {
            throw new Exception("Erro ao listar os gastos: " + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(GastosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    return listaDeGastos;
}


}




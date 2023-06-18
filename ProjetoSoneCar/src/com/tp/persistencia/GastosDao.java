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
       // preparedStatement.setString(3, isGastos.get());
        preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
    } catch (SQLException erro) {
        throw new Exception("SQL ERRO:" + erro.getMessage());
    } catch (Exception erro) {
        throw erro;
    }
    }

    @Override
    public ArrayList<Gastos> alterarGastos(Gastos gastos) throws Exception {
        ArrayList<Gastos>alterarGastos = new ArrayList<Gastos>();
        String sql = "UPDATE gastos SET valor = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setFloat(1, gastos.getValor());
            preparedStatement.setInt(2, gastos.getId());
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
        ArrayList<Gastos>listaDeMarca = new ArrayList<Gastos>();
        String sql = "Select * From gastos";
        try{
            Statement statement = conexao.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                Gastos isGastos = new Gastos();
                isGastos.setId(rs.getInt("id"));
                isGastos.setDateDataDeRegistroDeGasto(rs.getDate("data"));
                isGastos.setValor(rs.getFloat("descricao"));
                listaDeMarca.add(isGastos);
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("isProblem in listaDeMarca()_MarcaDao");
        }
        return listaDeMarca;
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
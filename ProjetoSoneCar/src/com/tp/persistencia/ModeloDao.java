/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.Marca;
import com.tp.modelos.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergy
 */
public class ModeloDao implements IModeloDao
{
private Connection conexao = null;
public ModeloDao() throws Exception{
    conexao = ConexaoBanco.getConexao();
}
    @Override
    public void createModelo(Modelo isModelo) throws Exception {
      try{
        String sql = "insert into modelo(descricao, url) values(?,?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, isModelo.getDescricao());
        preparedStatement.setString(2, isModelo.getUrl());
        preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
    }catch(SQLException erro){
        throw new Exception("SQL ERRO:" + erro.getMessage());
    }catch(Exception erro){
        throw erro;
    }
    }

    @Override
    public ArrayList<Modelo> listaDeModelo() throws Exception {
        ArrayList<Modelo>listaDeModelo = new ArrayList<Modelo>();
        String sql = "Select * From modelo";
     try{
       Statement statement = conexao.createStatement();
       ResultSet rs = statement.executeQuery(sql);
       while (rs.next()){
        Modelo isModelo = new Modelo();
        isModelo.setId(rs.getInt("id"));
        isModelo.setDescricao(rs.getString("descricao"));
        isModelo.setUrl(rs.getString("url"));
        listaDeModelo.add(isModelo);
    }
     }catch(SQLException e){
         e.printStackTrace();
         System.out.println("isProblem in listaDeModelo()_ModeloDao");
     }
       return listaDeModelo;
    }
    @Override
    public ArrayList<Modelo> deleteModelo(int id) throws Exception {
       ArrayList<Modelo> listaDeModelo = new ArrayList<>();
    String sql = "DELETE FROM modelo WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao excluir a modelo: " + e.getMessage());
    }
    listaDeModelo = listaDeModelo(); // Atualiza a lista de modelo após a exclusão
    return listaDeModelo;
}

    @Override
    public ArrayList<Modelo> alterarModelo(Modelo modelo) throws Exception {
        ArrayList<Modelo>alterarModelo = new ArrayList<Modelo>();
       String sql = "UPDATE modelo SET descricao = ? WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setString(1, modelo.getDescricao());
        preparedStatement.setInt(2, modelo.getId());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao alterar a modelo: " + e.getMessage());
    }
       return alterarModelo;
    }

    @Override
    public boolean descricaoJaExiste(String descricao,String url) {
    String query = "SELECT COUNT(*) FROM modelo WHERE descricao = ? OR url = ?";
    try (Connection conn = ConexaoBanco.getConexao();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, descricao);
        stmt.setString(2, url);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        return count > 0;
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao verificar se a descrição ou a URL existem: " + e.getMessage());
    } catch (Exception ex) {
        Logger.getLogger(ModeloDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

    
}

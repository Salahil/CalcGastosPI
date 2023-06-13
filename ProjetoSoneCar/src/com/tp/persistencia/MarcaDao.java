/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author sergy
 */
public class MarcaDao implements IMarcaDao {
private Connection conexao = null;
public MarcaDao() throws Exception{
    conexao = ConexaoBanco.getConexao();
}
    @Override
    public void createMarca(Marca isMarca) throws Exception {
        try{
        String sql = "insert into marca(descricao) values(?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, isMarca.getDescricao());
        preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
    }catch(SQLException erro){
        throw new Exception("SQL ERRO:" + erro.getMessage());
    }catch(Exception erro){
        throw erro;
    }
    
    }

    @Override
    public ArrayList<Marca> listaDeMarca() throws Exception {
        ArrayList<Marca>listaDeMarca = new ArrayList<Marca>();
        String sql = "Select * From marca";
     try{
       Statement statement = conexao.createStatement();
       ResultSet rs = statement.executeQuery(sql);
       while (rs.next()){
        Marca isMarca = new Marca();
        isMarca.setId(rs.getInt("id"));
        isMarca.setDescricao(rs.getString("descricao"));
        listaDeMarca.add(isMarca);
    }
     }catch(SQLException e){
         e.printStackTrace();
         System.out.println("isProblem in listaDeMarca()_MarcaDao");
     }
       return listaDeMarca;
    }

    @Override
    public ArrayList<Marca> deleteMarca() throws Exception {
        ArrayList<Marca>deleteMarca = new ArrayList<Marca>();
       String sql = "delete from marca where(id = ?)";
       try{
           Statement statement = conexao.createStatement();
       ResultSet rs = statement.executeQuery(sql);
       }catch(SQLException e){
           e.printStackTrace();
       }
      
      return deleteMarca;
    }

    @Override
    public ArrayList<Marca> alterarMarca() throws Exception {
        ArrayList<Marca>alterarMarca = new ArrayList<Marca>();
        String sql = "update consultor set nome ='?', email = '?' where(idconsultor = )";
    try{
           Statement statement = conexao.createStatement();
       ResultSet rs = statement.executeQuery(sql);
       }catch(SQLException p){
           p.printStackTrace();
       }
       return alterarMarca;
    }
}
    


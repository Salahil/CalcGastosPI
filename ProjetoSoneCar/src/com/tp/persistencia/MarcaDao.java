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
import java.lang.String;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sergy
 */
public class MarcaDao implements IMarcaDao {
private Connection conexao = null;
public MarcaDao() throws Exception{
    conexao = ConexaoBanco.getConexao();
//    conexao = ConexaoBanco.getConexao();
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
    public ArrayList<Marca> deleteMarca(int id) throws Exception {
    ArrayList<Marca> listaDeMarcas = new ArrayList<>();
    String sql = "DELETE FROM marca WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao excluir a marca: " + e.getMessage());
    }
    listaDeMarcas = listaDeMarca(); // Atualiza a lista de marcas após a exclusão
    return listaDeMarcas;
}

    @Override
    public ArrayList<Marca> alterarMarca(Marca marca) throws Exception {
        ArrayList<Marca>alterarMarca = new ArrayList<Marca>();
       String sql = "UPDATE marca SET descricao = ? WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setString(1, marca.getDescricao());
        preparedStatement.setInt(2, marca.getId());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao alterar a marca: " + e.getMessage());
    }
       return alterarMarca;
    }

    @Override
public boolean descricaoJaExiste(String descricao) {
        String query = "SELECT COUNT(*) FROM marcas WHERE descricao = ?";
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
        Logger.getLogger(MarcaDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
    
}

    
}
    


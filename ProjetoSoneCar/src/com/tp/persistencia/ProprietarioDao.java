/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import com.tp.enumeracao.CategoriaDeCNH;
import com.tp.ferramentas.auxiliar.BuscarEnumFromString;
import com.tp.modelos.Proprietario;
import com.tp.modelos.subClasses.CNH;
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
public class ProprietarioDao implements IProprietarioDao {
private Connection conexao = null;
public ProprietarioDao() throws Exception{
    conexao = ConexaoBanco.getConexao();
//    conexao = ConexaoBanco.getConexao();
}
    @Override
    public void createProprietario(Proprietario isProprietario) throws Exception{
        try{
        String sql = "insert into proprietario(cpf, nome, Telefone_1, Telefone_2, Email_1, Email_2, DocumentoCNH, cnhCategoria) values(?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, isProprietario.getCPF());
        preparedStatement.setString(2, isProprietario.getNomeCompleto());
        preparedStatement.setString(3, isProprietario.getEmail_1());
        preparedStatement.setString(4, isProprietario.getEmail_2());
        preparedStatement.setInt(5, isProprietario.getTelefone1());
        preparedStatement.setInt(6, isProprietario.getTelefone2());
        preparedStatement.setInt(7, isProprietario.getNumeroCNH());
        preparedStatement.setString(8, isProprietario.getCategoria().toString());
        preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
    }catch(SQLException erro){
        throw new Exception("SQL ERRO:" + erro.getMessage());
    }catch(Exception erro){
        throw erro;
    }
    
    }

    @Override
    public ArrayList<Proprietario> listaProprietario() throws Exception {
        ArrayList<Proprietario>listaProprietarios = new ArrayList<Proprietario>();
        
        String sql = "Select * From proprietario";
     try{
         
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
       while (rs.next()){
        Proprietario isProprietario = new Proprietario();
        isProprietario.setCPF(rs.getNString("cpf"));
        isProprietario.setNomeCompleto(rs.getString("nome"));
        isProprietario.setTelefone1(rs.getInt("telefone_1"));
        isProprietario.setTelefone2(rs.getInt("telefone_2"));
        isProprietario.setEmail_1(rs.getString("email_1"));
        isProprietario.setEmail_2(rs.getString("email_2"));
        //isProprietario.setDocumentoCNH(new CNH(rs.getString("numeroDocumentoCNH"), rs.getString("CategoriaDocumentoCNH")));
        isProprietario.setNumeroCNH(rs.getInt("cnh"));
        isProprietario.setCategoria(BuscarEnumFromString.fromString(CategoriaDeCNH.class, rs.getString(isProprietario.toStringCNHCategoria())));
        
        listaProprietarios.add(isProprietario);
    }
     }catch(SQLException e){
         e.printStackTrace();
         System.out.println("isProblem in listaDeTipoDeGasto()_TipoDeGastoDao");
     }
       return listaProprietarios;
    }

    @Override
    public ArrayList<Proprietario> excluirProprietario(String CPF) throws Exception {
        ArrayList<Proprietario> listaProprietarios = new ArrayList<>();
    String sql = "DELETE FROM proprietario WHERE id = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setString(1, CPF);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao excluir o proprietario: " + e.getMessage());
    }
    listaProprietarios = listaProprietario(); 
    return listaProprietarios;
    }

    @Override
    public ArrayList<Proprietario> alterarProprietario(Proprietario proprietario) throws Exception {
        ArrayList<Proprietario>alterarTipoDeGasto = new ArrayList<Proprietario>();
       String sql = "UPDATE proprietario SET Email_1 = '?', email_2 = '?', telefone_1 = '?', telefone_2 = '?', documentocnh = '?' WHERE CPF = ?";
        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
            preparedStatement.setString(1, proprietario.getEmail_1());
            preparedStatement.setString(2, proprietario.getEmail_2());
            preparedStatement.setInt(3, proprietario.getTelefone1());
            preparedStatement.setInt(4, proprietario.getTelefone2());
            preparedStatement.setString(5,proprietario.toStringCNH());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new Exception("Erro ao alterar o proprietario: " + e.getMessage());
        }
        return alterarTipoDeGasto;
    }

    @Override
    public boolean proprietarioJaExiste(String CPF, CNH cnh) throws Exception {
        String query = "SELECT COUNT(*) FROM proprietario WHERE CPF = ? OR DocumentoCNH = ?";
        try (Connection conn = ConexaoBanco.getConexao();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, CPF);
            stmt.setString(2, cnh.toString());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            int count = rs.getInt(1);
            return count > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao verificar se o proprietario existe: " + e.getMessage());
        } catch (Exception ex) {
        Logger.getLogger(ProprietarioDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
    }
}
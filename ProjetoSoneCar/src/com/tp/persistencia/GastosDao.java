/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.subClasses.Gastos;
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
        try{
            String sql = "insert into gastos (descricao) values(?)";
            PreparedStatement preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setFloat(1, isGastos.getValor());
            preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
        }catch(SQLException erro){
            throw new Exception("SQL ERRO:" + erro.getMessage());
        }catch(Exception erro){
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
}
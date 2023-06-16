/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;


import com.tp.enumeracao.CategoriaDeCarro;
import com.tp.enumeracao.TipoDeCombustivel;
import com.tp.modelos.Marca;
import com.tp.modelos.Modelo;
import com.tp.modelos.Veiculo;
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
public class VeiculoDao implements IVeiculoDao{
    private Connection conexao = null;
public VeiculoDao() throws Exception{
    conexao = ConexaoBanco.getConexao();
}

    @Override
    public void createVeiculo(Veiculo isVeiculo) throws Exception {
       try {
    String sql = "INSERT INTO veiculo (marca, modelo, combustivel, quilometragemAtual, categoriaDoCarro, url) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement preparedStatement = conexao.prepareStatement(sql);
    preparedStatement.setString(1, isVeiculo.getMarca().getDescricao());
    preparedStatement.setString(2, isVeiculo.getModelo().getDescricao());
    preparedStatement.setString(3, isVeiculo.getTipoDeCombustivel().toString());
    preparedStatement.setFloat(4, isVeiculo.getQuilometragemAtual());
    preparedStatement.setString(5, isVeiculo.getCategoria().toString());
    preparedStatement.setString(6, isVeiculo.getUrl());
    preparedStatement.executeUpdate(); // Executa a atualização no banco de dados
} catch (SQLException erro) {
    throw new Exception("SQL ERRO:" + erro.getMessage());
} catch (Exception erro) {
    throw erro;
}
    }

    @Override
    public ArrayList<Veiculo> listaDeVeiculo() throws Exception {
     
    ArrayList<Veiculo> listaDeVeiculo = new ArrayList<Veiculo>();
    String sql = "SELECT * FROM veiculo";
    try {
        Statement statement = conexao.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            Veiculo isVeiculo = new Veiculo();
            isVeiculo.setPlaca(rs.getString("placa"));
            isVeiculo.setMarca(new Marca(rs.getString("marca")));
            isVeiculo.setModelo(new Modelo(rs.getString("modelo")));
            isVeiculo.setTipoDeCombustivel(TipoDeCombustivel.valueOf(rs.getString("combustivel")));
            isVeiculo.setQuilometragemAtual(rs.getFloat("quilometragemAtual"));
            isVeiculo.setCategoria(CategoriaDeCarro.valueOf(rs.getString("categoriaDoCarro")));
            isVeiculo.setUrl(rs.getString("url"));
            listaDeVeiculo.add(isVeiculo);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Problem in listaDeVeiculo() - VeiculoDao");
    }
    return listaDeVeiculo;
}


    @Override
    public ArrayList<Veiculo> deleteVeiculo(String placa) throws Exception {
    ArrayList<Veiculo> listaDeVeiculo = new ArrayList<>();
    String sql = "DELETE FROM veiculo WHERE placa = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
        preparedStatement.setString(1, placa);
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao excluir a Veiculo: " + e.getMessage());
    }
    listaDeVeiculo = listaDeVeiculo(); // Atualiza a lista de Veiculo após a exclusão
    return listaDeVeiculo;
    }
    @Override
    public ArrayList<Veiculo> alterarVeiculo(Veiculo veiculo) throws Exception {
        ArrayList<Veiculo>alterarVeiculo = new ArrayList<Veiculo>();
       String sql = "UPDATE veiculo SET descricao = ? WHERE placa = ?";
    try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
         preparedStatement.setString(1, veiculo.getMarca().getDescricao()); 
        preparedStatement.setString(2, veiculo.getModelo().toStringDescricao());
        preparedStatement.setString(3, veiculo.getTipoDeCombustivel().toString());
        preparedStatement.setFloat(4, veiculo.getQuilometragemAtual());
        preparedStatement.setString(5, veiculo.getCategoria().toString());
        preparedStatement.setString(6, veiculo.getUrl());
        preparedStatement.setString(7, veiculo.getPlaca());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao alterar a marca: " + e.getMessage());
    }
       return alterarVeiculo;
    }

    @Override
    public boolean placaJaExiste(String placa, String url) {
    String query = "SELECT COUNT(*) FROM veiculo WHERE placa = ? OR url = ?";
    try (Connection conn = ConexaoBanco.getConexao();
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setString(1, placa);
        stmt.setString(2, url);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        return count > 0;
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao verificar se o veículo existe: " + e.getMessage());
    }   catch (Exception ex) {
            Logger.getLogger(VeiculoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}


    
}

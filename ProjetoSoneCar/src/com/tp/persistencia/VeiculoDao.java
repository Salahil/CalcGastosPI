/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;


import com.tp.enumeracao.CategoriaDeCarro;
import com.tp.enumeracao.TipoDeCombustivel;
import com.tp.modelos.Proprietario;
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
        String sql = "INSERT INTO veiculo (placa, marca_descricao, modelo_descricao, combustivel, quilometragem_atual, categoria_Do_Carro, url, cpf_proprietario) values(?,?,?,?,?,?,?,?)";
                     

        PreparedStatement preparedStatement = conexao.prepareStatement(sql);
        preparedStatement.setString(1, isVeiculo.getPlaca());
        preparedStatement.setString(2, isVeiculo.getMarca().getDescricao());
        preparedStatement.setString(3, isVeiculo.getModelo().getDescricao());
        preparedStatement.setString(4, isVeiculo.getTipoDeCombustivel().name());
        preparedStatement.setFloat(5, isVeiculo.getQuilometragemAtual());
        preparedStatement.setString(6, isVeiculo.getCategoria().toString());
        preparedStatement.setString(7, isVeiculo.getUrl());
        preparedStatement.setString(8, isVeiculo.getProprietario().getCPF());

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
            isVeiculo.setMarca(new Marca(rs.getString("marca_descricao")));
            isVeiculo.setModelo(new Modelo(rs.getString("modelo_descricao")));
            isVeiculo.setTipoDeCombustivel(TipoDeCombustivel.valueOf(rs.getString("combustivel")));
            isVeiculo.setQuilometragemAtual(rs.getFloat("quilometragem_atual"));
            isVeiculo.setCategoria(CategoriaDeCarro.valueOf(rs.getString("categoria_do_carro")));
            isVeiculo.setUrl(rs.getString("url"));
            isVeiculo.setProprietario(new Proprietario(rs.getString("cpf_proprietario")));
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
        preparedStatement.setDouble(4, veiculo.getQuilometragemAtual());
        preparedStatement.setString(5, veiculo.getCategoria().toString());
        preparedStatement.setString(6, veiculo.getUrl());
        preparedStatement.setString(7, veiculo.getPlaca());
        preparedStatement.setString(8, veiculo.getProprietario().toStringCPF());
        preparedStatement.executeUpdate();
    } catch (SQLException e) {
        throw new Exception("Erro ao alterar a Veiculo: " + e.getMessage());
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

    @Override
    public ArrayList<Marca> listarMarcas() throws Exception {
       ArrayList<Marca> marcas = new ArrayList<>();

        String sql = "SELECT * FROM marca";

        try (PreparedStatement statement = conexao.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String descricao = resultSet.getString("descricao");

                Marca marca = new Marca(descricao);
                marcas.add(marca);
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao listar marcas: " + e.getMessage());
        }

        return marcas;
    }

    @Override
    public ArrayList<Modelo> listarModelos() throws Exception {
       ArrayList<Modelo> modelos = new ArrayList<>();

        String sql = "SELECT * FROM modelo";

        try (PreparedStatement statement = conexao.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String descricao = resultSet.getString("descricao");

                Modelo modelo = new Modelo(descricao);
                modelos.add(modelo);
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao listar modelos: " + e.getMessage());
        }

        return modelos;
    }

    @Override
    public ArrayList<Proprietario> listarProprietarios() throws Exception {
       ArrayList<Proprietario> proprietarios = new ArrayList<>();

        String sql = "SELECT cpf FROM proprietario";

        try (PreparedStatement statement = conexao.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String cpf = resultSet.getString("cpf");

                Proprietario proprietario = new Proprietario(cpf);
                proprietarios.add(proprietario);
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao listar proprietários: " + e.getMessage());
        }

        return proprietarios;
    }
}

    
      

    

    


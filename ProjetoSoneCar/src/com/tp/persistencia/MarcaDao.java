/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author sergy
 */
public class MarcaDao implements IMarcaDao<Marca>{

    private ConexaoBanco conexao;
    
    public MarcaDao()
    {
        this.conexao = new ConexaoBanco();
    }
    
    @Override
    public void inserir(Marca marca) {
        //string com a consulta que será executada no banco
        String sql = "INSERT INTO MARCA (DESCRICAO) VALUES (?)";
        
        try
        {
            //tenta realizar a conexão, se retornar verdadeiro entra no IF
            if(this.conexao.conectar())
            {
                //prepara a sentença com a consulta da string
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //subtitui as interrograções da consulta, pelo valor específico
                sentenca.setString(1,marca.getDescricao()); //subsitui a primeira ocorrência da interrogação pelo atributo nome
                
                
                sentenca.execute(); //executa o comando no banco
                sentenca.close(); //fecha a sentença
                this.conexao.getConnection().close(); //fecha a conexão com o banco
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(Marca marca) {
        String sql = "UPDATE ESCOLA SET DESCRICAO = ? WHERE IDMARCA = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setString(1,marca.getDescricao());
               
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public void excluir() {
        String sql = "DELETE FROM MARCA";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
   
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }
    
    public void excluirID(int id) {
        String sql = "DELETE FROM MARCA WHERE IDMARCA = ?";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                sentenca.setInt(1, id);
                
                sentenca.execute();
                sentenca.close();
                this.conexao.getConnection().close();
            }
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<Marca> consultar() {
        
        ArrayList<Marca> listaMarca = new ArrayList<Marca>();
        String sql = "SELECT * FROM MARCA ORDER BY IDMARCA";
        
        try
        {
            if(this.conexao.conectar())
            {
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                //recebe o resultado da consulta
                ResultSet resultadoSentenca = sentenca.executeQuery();

                //percorrer cada linha do resultado
                while(resultadoSentenca.next()) 
                {
                    //resgata o valor de cada linha, selecionando pelo nome de cada coluna da tabela MARCA
                    Marca marca = new Marca();
                    marca.setId(resultadoSentenca.getInt("IDMARCA"));
                    marca.setDescricao(resultadoSentenca.getString("DESCRICAO"));
                    
                   
                    //adiciona cada tupla na listaMarca que será retornada para a janela Marca
                    listaMarca.add(marca);
                }

                sentenca.close();
                this.conexao.getConnection().close();
            }
            
            return listaMarca;
        }
        catch(SQLException ex)
        {
           throw new RuntimeException(ex);
        }
    }

}


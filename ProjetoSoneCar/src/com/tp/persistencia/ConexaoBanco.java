/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexaoBanco {
    private static Connection conexao = null;
    private ConexaoBanco(){}
    public static Connection getConexao() throws Exception{
        try{
            if(conexao == null){
                String driver = "org.postgresql.Driver";
                String url = "jdbc:postgresql://localhost:5432/SoneCar";
                String user = "postgres";
                String password = "aluno"; 
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password); 
            }
        }
        catch(ClassNotFoundException erro){
            
            throw new Exception("Drive: "+erro.getMessage());
        } 
        catch(SQLException erro){
            //Erro no banco de dados: usuario, senha ou banco de dados 
            throw new Exception("Banco: " + erro.getMessage());
        }
        return conexao;
    }
}

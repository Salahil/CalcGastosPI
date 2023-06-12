/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author sergy
 */
public class ConexaoBanco {
    /*public static void main(String[] args) {
        try{
Statement s;
String usuario = "postgres";
String senha = "postgres";
String url = "jdbc:postgresql://localhost:5432/SoneCar";

Class.forName("org.postgresql.Driver");

Connection c = DriverManager.getConnection(url, usuario, senha);
s = c.createStatement();

s.executeQuery("INSERT INTO marca VALUES ('Honda')");

c.close();

}catch(Exception E){
System.out.println("\n" + E);
}
    }}*/
    private String servidor;
    private String banco;
    private String usuario;
    private String senha;
    private Connection conexao;
    
    public ConexaoBanco()
    {
        this.servidor = "localhost";
        this.banco = "RegistroMerenda";
        this.usuario = "aluno";
        this.senha = "aluno";
    }
    
    public boolean conectar(){
        try
        {
            this.conexao = DriverManager.getConnection("jdbc:postgreesql://"+this.servidor+"/"+this.banco,this.usuario,this.senha);
            return true;
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
    }

    public Connection getConnection() throws SQLException {
       Connection conexao = DriverManager.getConnection("jdbc:postgreesql://localhost:5432/SoneCar","aluno","aluno" ); 
        return conexao;
    }

 
}


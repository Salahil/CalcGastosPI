/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos;

/**
 *
 * @author aluno
 */
public class Modelo {
    int id;
    String descriçao;
    
    // gets e sets pra caracas:

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }
    
    // Budegagem de construtor:
    
    public Modelo(){
    }
    
    public Modelo(String desc){
        // tem que colocar os comandos que criam a id da marca
        
        // bota aqui
        this.descriçao = desc;
    }
}

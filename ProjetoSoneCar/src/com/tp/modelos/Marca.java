/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos;


//comi o cu de quem tá lendo!

/**
 *
 * @author aluno
 */
public class Marca {
    int id;
    String descricao;
    
    // gets e sets bobão:

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    // construtor bunitim e construtor feinho
    
    public Marca(){
    }
    
    public Marca(String desc){
        // tem que colocar os comandos que criam a id da marca
        
        // bota aqui
        this.descricao = desc;
    }
    
    //ToString sacaninha:

    @Override
    public String toString() {
        return "Marca{" + "id=" + id + ", descricao=" + descricao + '}';
    }
    public String toStringDescricao(){
        return ("" + descricao);
    }
    
    public String toStringID(){
        return ("" + id);
    }
}

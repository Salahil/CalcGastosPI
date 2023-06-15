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
    String descricao;
    String url;
    
    public String getUrl() {
        return url;
    }

    // gets e sets pra caracas:
    public void setUrl(String url) {
        this.url = url;
    }

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
    
    // Budegagem de construtor:
    
    public Modelo(){
    }
    
    public Modelo(String desc){
        // tem que colocar os comandos que criam a id da marca
        
        // bota aqui
        this.descricao = desc;
    }
    
    //Marotagem de toString:

    @Override
    public String toString() {
        return "Modelo{" + "id=" + id + ", descricao=" + descricao + ", url=" + url + '}';
    }

    
    
    public String toStringDescricao(){
        return (descricao);
    }
    
    public String toStringId(){
        return ("" + id);
    }
    public String toStringUrl(){
        return (url);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos.subClasses;

/**
 *
 * @author Julio
 */
public class TipoDeGastos {
    private int id;
    private String descricao;

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
    
     public TipoDeGastos(){
        
    }
    public TipoDeGastos(String desc){
        this.descricao = desc;
    }
    

    @Override
    public String toString() {
        return "TipoDeGastos{" + "id=" + id + ", descricao=" + descricao + '}';
    }

    public String toStringDescricao() {
        return(descricao);
    }
    
    public String toStringID(){
        return ("" + id);
    }
  
}

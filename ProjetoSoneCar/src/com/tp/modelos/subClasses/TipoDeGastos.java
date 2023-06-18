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
    private Gastos valor = new Gastos();

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

    public Gastos getValor() {
        return valor;
    }

    public void setValor(Gastos valor) {
        this.valor = valor;
    }

    public TipoDeGastos(String descricao) {
        this.descricao = descricao;
    }
    
    public TipoDeGastos(){
        
    }
    
}

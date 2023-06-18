/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos.subClasses;
import java.util.Date;
/**
 *
 * @author Julio
 */
public class Gastos {
    private float valor;
    private Date dateDataDeRegistroDeGasto;
    private int id;
    private TipoDeGastos descricao = new TipoDeGastos();
    
    // paranaue dos get e set:

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDateDataDeRegistroDeGasto() {
        return dateDataDeRegistroDeGasto;
    }

    public void setDateDataDeRegistroDeGasto(Date dateDataDeRegistroDeGasto) {
        this.dateDataDeRegistroDeGasto = dateDataDeRegistroDeGasto;
    }

//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String toStringTipoDeGasto() {
        return (descricao.getDescricao() + ";" + descricao.getId());
    }
    
    public String toStringIDTipodegasto(){
        return "" + descricao.getId();
    }
    
    public String toStringDescricaoTipodegasto(){
        return descricao.getDescricao();
    }
    
    public void setDescricao(TipoDeGastos tipoDeGastos) {
    this.descricao = tipoDeGastos;
    }


//    public int getIdT() {
//        return idT;
//    }
//
//    public void setIdT(int idT) {
//        this.idT = idT;
//    }
    
    
    // parafernalha de tranqueiras de construtor
    
    public Gastos(){
    }
    
    public Gastos(float val, Date data/*, String descricao*/){
        this.valor = val;
        this.dateDataDeRegistroDeGasto = data;
//        this.descricao = descricao;
        // botar aqui o codigo que gera a id desse troço
        
        // bota aqui^^^^
    }
    public Gastos(float val, Date data, String desc){
        this.valor = val;
        this.dateDataDeRegistroDeGasto = data;
        TipoDeGastos Tpg = new TipoDeGastos(desc);
        this.descricao = Tpg;
    }
    
    
}

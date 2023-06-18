/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos.subClasses;
import java.util.Date;
import com.tp.modelos.subClasses.TipoDeGastos;
/**
 *
 * @author Julio
 */
public class Gastos {
     float valor;
     Date dateDataDeRegistroDeGasto;
     int id;
     TipoDeGastos tipoDeGastos = new TipoDeGastos();
    
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoDeGastos getTipoDeGastos() {
        return tipoDeGastos;
    }

    public void setTipoDeGastos(TipoDeGastos tipoDeGastos) {
        this.tipoDeGastos = tipoDeGastos;
    }

    @Override
    public String toString() {
        return "Gastos{" + "valor=" + valor + ", dateDataDeRegistroDeGasto=" + dateDataDeRegistroDeGasto + ", id=" + id + ", tipoDeGastos=" + tipoDeGastos + '}';
    }

   
    
}

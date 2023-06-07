/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos;
import com.tp.modelos.Marca;
import com.tp.modelos.Modelo;
/**
 *
 * @author aluno
 */
public class Veiculo {
    String placa;
    String tipoDeCombustivel;
    float quilometragemAtual;
    String categoria;
    Marca marca = new Marca();
    Modelo modelo = new Modelo();
    
    // Gets e Sets... pq a gente precisa né!

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public float getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public void setQuilometragemAtual(float quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    // baguiera de construtor:
    
    public Veiculo(){
    }
    
    public Veiculo(String placa, String combust, float kms, String cat, Marca marca, Modelo modelo){
        this.placa = placa;
        this.tipoDeCombustivel = combust;
        this.quilometragemAtual = kms;
        this.categoria = cat;
        this.marca = marca;
        this.modelo = modelo;
    }
}
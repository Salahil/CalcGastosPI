/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos;
import com.tp.enumeracao.CategoriaDeCarro;
import com.tp.enumeracao.TipoDeCombustivel;
import com.tp.modelos.Marca;
import com.tp.modelos.Modelo;
/**
 *
 * @author aluno
 */
public class Veiculo {
    String placa;
    TipoDeCombustivel tipoDeCombustivel;
    float quilometragemAtual;
    CategoriaDeCarro categoria;
    Marca marca = new Marca();
    Modelo modelo = new Modelo();
    String url;
    
    public String getUrl() {
        return url;
    }

    // Gets e Sets... pq a gente precisa né!
    public void setUrl(String url) {
        this.url = url;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoDeCombustivel getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(TipoDeCombustivel tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public float getQuilometragemAtual() {
        return quilometragemAtual;
    }

    public void setQuilometragemAtual(float quilometragemAtual) {
        this.quilometragemAtual = quilometragemAtual;
    }

    public CategoriaDeCarro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeCarro categoria) {
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
    
    public Veiculo(String placa, TipoDeCombustivel combust, float kms, CategoriaDeCarro cat, Marca marca, Modelo modelo,String url){
        this.placa = placa;
        this.tipoDeCombustivel = combust;
        this.quilometragemAtual = kms;
        this.categoria = cat;
        this.marca = marca;
        this.modelo = modelo;
        this.url = url;
    }
    
    // Objetos das classes
    
    Modelo Mo = new Modelo();
    Marca Ma = new Marca();
    
    // Bagulheira de toString:
    
    @Override
    public String toString() {
        return "" + placa + ";" + tipoDeCombustivel + ";" + quilometragemAtual + ";" + categoria + ";" + url + ";" + Mo.toStringDescricao() + ";" + Ma.toStringDescricao();
    }
    
    public String toStringPlaca(){
        return ("" + placa);
    }
    
    public String toStringTipoDeCombustivel(){
        return ("" + tipoDeCombustivel);
    }
    
    public String toStringKmAtual(){
        return ("" + quilometragemAtual);
    }
    
    public String toStringCategoria(){
        return ("" + categoria);
    }
    public String toStringUrl(){
        return (url);
    }
    public String toStringModeloDoVeiculo(){
        return Mo.toStringDescricao();
    }
    public String toStringMarcaDoVeiculo(){
        return Ma.toStringDescricao();
    }
    //Marca e Modelo já tem seus próprios métodos toString, usa o deles:
    // marca.toStringDescricao()
    // modelo.toStringDescricao()
}


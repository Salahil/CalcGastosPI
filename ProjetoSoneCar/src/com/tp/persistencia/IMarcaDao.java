/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.persistencia;

import java.util.ArrayList;

/**
 *
 * @author sergy
 */
public interface IMarcaDao<ObjetoMarca> {
    
    public void inserir(ObjetoMarca objt);
    
    public void alterar(ObjetoMarca objt);
    
    public void excluir();
    
    public ArrayList<ObjetoMarca> consultar();
}

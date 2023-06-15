/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.Modelo;
import java.util.ArrayList;

/**
 *
 * @author sergy
 */
public interface IModeloDao {
    void createModelo(Modelo isModelo)throws Exception;
    ArrayList<Modelo>listaDeModelo()throws Exception;
    ArrayList<Modelo>deleteModelo(int id)throws Exception;
    ArrayList<Modelo>alterarModelo(Modelo modelo)throws Exception;
    boolean descricaoJaExiste(String descricao,String url);
}

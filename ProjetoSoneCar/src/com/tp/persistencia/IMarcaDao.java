/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.Marca;
import java.util.ArrayList;

/**
 *
 * @author sergy
 */
public interface IMarcaDao{
    void createMarca(Marca isMarca)throws Exception;
    ArrayList<Marca>listaDeMarca()throws Exception;
    ArrayList<Marca>deleteMarca(int id)throws Exception;
    ArrayList<Marca>alterarMarca(Marca marca)throws Exception;
    boolean descricaoJaExiste(String descricao);

}

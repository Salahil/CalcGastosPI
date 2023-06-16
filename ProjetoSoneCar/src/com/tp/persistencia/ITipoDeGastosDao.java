/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.subClasses.Gastos;
import java.util.ArrayList;

/**
 *
 * @author Julio
 */
public interface ITipoDeGastosDao {
    void createTipoDeGasto(Gastos isGastos)throws Exception;
    ArrayList<Gastos>listaDeTipoDeGasto()throws Exception;
    ArrayList<Gastos>deletarTipoDeGasto(int idT)throws Exception;
    ArrayList<Gastos>alterarTipoDeGasto(Gastos gastos)throws Exception;
    boolean descricaoJaExiste(String descricao);
}

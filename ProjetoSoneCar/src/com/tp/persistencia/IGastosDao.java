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
public interface IGastosDao {
    void createGasto(Gastos isGasto)throws Exception;
    ArrayList<Gastos>alterarGastos(Gastos gastos)throws Exception;
    ArrayList<Gastos>excluirGastos(int id)throws Exception;
    ArrayList<Gastos>listarGastos(int id) throws Exception;
    public Gastos getGasto(int id) throws Exception;
}

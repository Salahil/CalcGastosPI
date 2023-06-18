/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.ferramentas.contabil;

import com.tp.modelos.subClasses.Gastos;
import com.tp.persistencia.GastosDao;

public class PegarGastoDoBancoDeDados {
    private GastosDao gastosDao;

    public PegarGastoDoBancoDeDados() throws Exception {
        gastosDao = new GastosDao();
    }

    public Gastos buscarGastoPorId(int id) {
        try {
            return gastosDao.getGasto(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

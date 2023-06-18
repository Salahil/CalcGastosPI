/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.subClasses.TipoDeGastos;
import java.util.ArrayList;

/**
 *
 * @author Julio
 */
public interface ITipoDeGastosDao {
    void createTipoDeGasto(TipoDeGastos isTipoDeGastos) throws Exception;
    ArrayList<TipoDeGastos> listaDeTipoDeGasto() throws Exception;
    ArrayList<TipoDeGastos> deletarTipoDeGasto(int id) throws Exception;
    ArrayList<TipoDeGastos> alterarTipoDeGasto(TipoDeGastos tipoDeGastos) throws Exception;
    boolean descricaoJaExiste(String descricao);
    ArrayList<String> listarDescricoesTipoDeGastos() throws Exception;
}

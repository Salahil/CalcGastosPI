/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.persistencia;

import com.tp.modelos.Marca;
import com.tp.modelos.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author sergy
 */
public interface IVeiculoDao {
     void createVeiculo(Veiculo isVeiculo)throws Exception;
    ArrayList<Veiculo>listaDeVeiculo()throws Exception;
    ArrayList<Veiculo>deleteVeiculo(String placa)throws Exception;
    ArrayList<Veiculo>alterarVeiculo(Veiculo veiculo)throws Exception;
     boolean placaJaExiste(String placa,String url);
}


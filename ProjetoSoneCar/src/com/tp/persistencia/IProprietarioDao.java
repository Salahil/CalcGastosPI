/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tp.persistencia;                                                    

import com.tp.modelos.Proprietario;
import com.tp.modelos.subClasses.CNH;
import java.util.ArrayList;                                                     
    /**
    *
    * @author Julio
    */
public interface IProprietarioDao {                                             
    void createProprietario (Proprietario isProprietario)throws Exception;                      
    ArrayList<Proprietario>listaProprietario()throws Exception;                 
    ArrayList<Proprietario>excluirProprietario(String CPF)throws Exception;     
    ArrayList<Proprietario>alterarProprietario(Proprietario proprietario)throws Exception;
    boolean proprietarioJaExiste(String CPF, CNH cnh)throws Exception;                                   
}
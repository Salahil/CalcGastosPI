/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos.subClasses;

import com.tp.enumeracao.CategoriaDeCNH;

/**
 *
 * @author Julio
 */
public class CNH {
    private int numeroDocumentoCNH;
    private CategoriaDeCNH categoria;
    
    // Budegagem de gets e sets que vai quê né?

    public int getNumeroDocumentoCNH() {
        return numeroDocumentoCNH;
    }

    public void setNumeroDocumentoCNH(int numeroDocumentoCNH) {
        this.numeroDocumentoCNH = numeroDocumentoCNH;
    }

    public CategoriaDeCNH getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeCNH categoria) {
        this.categoria = categoria;
    }
    
    // Constriutor feinho e construtor bunitin
    
    public CNH(){
    }; // feinho
    
    public CNH(int num, CategoriaDeCNH cat){
        this.numeroDocumentoCNH = num;
        this.categoria = cat;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.modelos.subClasses;

/**
 *
 * @author Julio
 */
public class CNH {
    private int numeroDocumentoCNH;
    private char categoria;
    
    // Budegagem de gets e sets que vai quê né?

    public int getNumeroDocumentoCNH() {
        return numeroDocumentoCNH;
    }

    public void setNumeroDocumentoCNH(int numeroDocumentoCNH) {
        this.numeroDocumentoCNH = numeroDocumentoCNH;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    // Constriutor feinho e construtor bunitin
    
    public CNH(){
    }; // feinho
    
    public CNH(int num, char cat){
        this.numeroDocumentoCNH = num;
        this.categoria = cat;
    }
    
}

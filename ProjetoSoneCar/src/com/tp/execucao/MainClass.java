/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tp.execucao;

import com.tp.ferramentas.graficas.GraficoBarras;
import org.jfree.data.category.DefaultCategoryDataset;
import com.tp.ferramentas.contabil.*;
import com.tp.ferramentas.auxiliar.*;
import com.tp.ferramentas.fileArranger.*;
import com.tp.ferramentas.graficas.*;
import com.tp.modelos.subClasses.Gastos;
/**
 *
 * @author Julio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        final String tituloGrafico = "Maconha!";
        final String descricaoX = "CUECÃO DE COURO";//nome de um dos textos da bagaceira
        final String descricaoY = "Erva que esses trouxa usa";//nome de outro trem da bagaceira
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();//Instanciando a data do gerador de grafico
        //aqui vem os bobão que 
        dataset.addValue(10000, "B2", "Bloodbourne");
        dataset.addValue(1300, "Sergio", "minecraft");
        dataset.addValue(9420, "Julio", "makaikinho");
        dataset.addValue(5481, "Luidy", "armas");
        dataset.addValue(8000, "Ujeverson", "massa!");
        
        GraficoBarras graf = new GraficoBarras(tituloGrafico, descricaoX, descricaoY, dataset);
        graf.exibirGraficoNaTela(800, 600);
        
        
        
       /* FileArranger cuecaoDeCouro = new FileArranger();
        cuecaoDeCouro.chooseImageFile();
        */
    }
    
}

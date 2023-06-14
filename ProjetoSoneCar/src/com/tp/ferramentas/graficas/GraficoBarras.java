/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.ferramentas.graficas;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author Julio
 */
public class GraficoBarras {
    private final String TituloGrafico;
    private final String DescricaoEixoX;
    private final String DescricaoEixoY;
    private final DefaultCategoryDataset categoryDataSet;
    private JFreeChart graficoBarras;
    
    private void cirarGrafico(){
        this.graficoBarras = ChartFactory.createBarChart(
                this.TituloGrafico,
                this.DescricaoEixoX,
                this.DescricaoEixoY,
                this.categoryDataSet,
                PlotOrientation.HORIZONTAL,
                true,
                true,
                false
        );
    }
    
    public void exibirGraficoNaTela(int largura, int altura){
        JFrame frame = new JFrame(this.TituloGrafico);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(largura,altura));
        ChartPanel panelGrafico = new ChartPanel(this.graficoBarras);
        panelGrafico.setPreferredSize(new Dimension(largura,altura));
        frame.add(panelGrafico);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void criarArquivoJPEG(String caminhoArquivo, int largura, int altura){
        File arquivoGrafico = new File(caminhoArquivo + "jpg");
        try{
            ChartUtilities.saveChartAsJPEG(
                arquivoGrafico,
                this.graficoBarras,
                largura = 800,
                altura = 640
            );
        } catch(IOException exeps){
            
        }
    }
    
    public GraficoBarras(String TituloGrafico, String DescricaoEixoX, String DescricaoEixoY, DefaultCategoryDataset categoryDataSet) {
        this.TituloGrafico = TituloGrafico;
        this.DescricaoEixoX = DescricaoEixoX;
        this.DescricaoEixoY = DescricaoEixoY;
        this.categoryDataSet = categoryDataSet;
        this.cirarGrafico();
    }
    
    
}
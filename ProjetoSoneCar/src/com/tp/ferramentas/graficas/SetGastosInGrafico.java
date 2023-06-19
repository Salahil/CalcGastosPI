package com.tp.ferramentas.graficas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.tp.ferramentas.contabil.SepararGastosPorDate;
import com.tp.modelos.subClasses.Gastos;
import java.util.Stack;
import org.jfree.data.category.DefaultCategoryDataset;
import com.tp.ferramentas.graficas.GraficoBarras;
import java.util.ArrayList;
/**
 *
 * @author Julio
 */



public class SetGastosInGrafico {

    public void gerarGraficoGastos(ArrayList<Gastos> gastosList, int mesDesejado) throws Exception {
    SepararGastosPorDate ferramenta = new SepararGastosPorDate();
    Stack<Gastos> pilhaGastos = ferramenta.organizarGastosPorData(gastosList, mesDesejado);

    // Criação do dataset para o gráfico
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    // Extrai os valores da pilha de gastos e adiciona ao dataset
    while (!pilhaGastos.isEmpty()) {
        Gastos gasto = pilhaGastos.pop();
        String data = gasto.getDateDataDeRegistroDeGasto().toString();
        float valor = gasto.getValor();
        dataset.addValue(valor, data, data);
    }

    // Criação do objeto GraficoBarras
    String tituloGrafico = "Gastos por Data";
    String descricaoEixoX = "Data";
    String descricaoEixoY = "Valor";
    GraficoBarras grafico = new GraficoBarras(tituloGrafico, descricaoEixoX, descricaoEixoY, dataset);

    // Exibe o gráfico na tela
    int largura = 800;
    int altura = 600;
    grafico.exibirGraficoNaTela(largura, altura);
}


}
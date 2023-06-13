/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.ferramentas.graficas;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class GerGrafico extends Application {

    // Dados de exemplo para gastos mensais
    private ObservableList<GastoMensal> gastosMensais = FXCollections.observableArrayList(
            new GastoMensal("Janeiro", 1000),
            new GastoMensal("Fevereiro", 1500),
            new GastoMensal("Março", 800),
            new GastoMensal("Abril", 1200),
            new GastoMensal("Maio", 900)
    );

    @Override
    public void start(Stage primaryStage) {
        // Configuração dos eixos do gráfico
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        // Criação do gráfico de barras
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        // Configuração dos dados do gráfico
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        for (GastoMensal gasto : gastosMensais) {
            series.getData().add(new XYChart.Data<>(gasto.getMes(), gasto.getValor()));
        }
        barChart.getData().add(series);

        // Configuração da cena
        Scene scene = new Scene(barChart, 400, 300);

        // Configuração do palco principal
        primaryStage.setTitle("Gastos Mensais");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Classe interna para representar os gastos mensais
    private class GastoMensal {
        private String mes;
        private double valor;

        public GastoMensal(String mes, double valor) {
            this.mes = mes;
            this.valor = valor;
        }

        public String getMes() {
            return mes;
        }

        public double getValor() {
            return valor;
        }
    }
}

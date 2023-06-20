/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.ferramentas.contabil;

/**
 *
 * @author Julio
 */
import com.tp.ferramentas.auxiliar.AnoSomaGastos;
import com.tp.modelos.subClasses.Gastos;
import com.tp.modelos.subClasses.TipoDeGastos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GastosUtils {
    public static ArrayList<AnoSomaGastos> somarGastosPorAno(ArrayList<Gastos> gastosList, TipoDeGastos tipoDeGasto) {
        // Mapa para armazenar a soma dos valores por ano
        Map<Integer, Double> somaPorAno = new HashMap<>();

        // Percorrer a lista de gastos e somar os valores por ano
        for (Gastos gasto : gastosList) {
            System.out.println("GastoUtil antes if");
            if (gasto.getTipoDeGastos().equals(tipoDeGasto)) {
                int ano = gasto.getDateDataDeRegistroDeGasto().getYear(); // Obter o ano do gasto
                double valor = gasto.getValor();
                System.out.println("GastosUtil"+ ano);
                // Verificar se o ano já existe no mapa
                if (somaPorAno.containsKey(ano)) {
                    // Se o ano já existe, somar o valor ao valor existente
                    double somaAtual = somaPorAno.get(ano);
                    somaPorAno.put(ano, somaAtual + valor);
                } else {
                    // Se o ano ainda não existe, adicionar o ano e o valor ao mapa
                    somaPorAno.put(ano, valor);
                }
            }
        }

        // Criar a lista de objetos AnoSomaGastos com os resultados
        ArrayList<AnoSomaGastos> resultado = new ArrayList<>();
        for (Map.Entry<Integer, Double> entry : somaPorAno.entrySet()) {
            int ano = entry.getKey();
            double soma = entry.getValue();
            resultado.add(new AnoSomaGastos(ano, soma));
        }

        return resultado;
    }
}


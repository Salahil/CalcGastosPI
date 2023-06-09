package com.tp.ferramentas.contabil;

import com.tp.modelos.subClasses.Gastos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Stack;

public class SepararGastosPorDate {

    /**
     *
     */
    public static SepararGastosPorDate separator = new SepararGastosPorDate();
    public Stack<Gastos> organizarGastosPorData(ArrayList<Gastos> gastosList, int mes) {
    Stack<Gastos> pilhaGastos = new Stack<>();

    try {
        // Filtra os gastos pelo mês desejado
        ArrayList<Gastos> gastosFiltrados = filtrarGastosPorMes(gastosList, mes);

        // Ordena a lista de gastos filtrados pela data de registro em ordem decrescente
        Collections.sort(gastosFiltrados, new Comparator<Gastos>() {
            @Override
            public int compare(Gastos gasto1, Gastos gasto2) {
                Date data1 = gasto1.getDateDataDeRegistroDeGasto();
                Date data2 = gasto2.getDateDataDeRegistroDeGasto();
                return data2.compareTo(data1);
            }
        });

        // Adiciona os gastos à pilha
        for (Gastos gasto : gastosFiltrados) {
            pilhaGastos.push(gasto);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return pilhaGastos;
}

    /**
     *
     * @param listaGastos
     * @param mes
     * @return
     */
    public ArrayList<Gastos> filtrarGastosPorMes(ArrayList<Gastos> listaGastos, int mes) {
    ArrayList<Gastos> gastosFiltrados = new ArrayList<>();

    for (Gastos gasto : listaGastos) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(gasto.getDateDataDeRegistroDeGasto());
        int mesGasto = calendar.get(Calendar.MONTH) + 1; // Os meses em Calendar iniciam em 0

        if (mesGasto == mes) {
            gastosFiltrados.add(gasto);
        }
    }

    return gastosFiltrados;
    }   


}

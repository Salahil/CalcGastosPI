/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tp.ferramentas.graficas;

import com.tp.modelos.subClasses.Gastos;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Stack;

/**
 *
 * @author Julio
 */

public class SetarGastosNumaTable {
    public void exibirGastosEmTable(Stack<Gastos> pilhaGastos, JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Limpa a tabela

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        while (!pilhaGastos.isEmpty()) {
            Gastos gasto = pilhaGastos.pop();
            Object[] rowData = {dateFormat.format(gasto.getDateDataDeRegistroDeGasto()), gasto.getValor()};
            model.addRow(rowData);
        }
    }
}

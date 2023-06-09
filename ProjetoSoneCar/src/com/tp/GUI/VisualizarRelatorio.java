/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tp.GUI;

import com.tp.ferramentas.auxiliar.AnoSomaGastos;
import com.tp.ferramentas.contabil.GastosUtils;
import com.tp.ferramentas.contabil.SepararGastosPorDate;
import com.tp.ferramentas.graficas.SetGastosInGrafico;
import com.tp.ferramentas.graficas.SetarGastosNumaTable;
import com.tp.modelos.subClasses.Gastos;
import com.tp.persistencia.GastosDao;
import com.tp.persistencia.TipoDeGastosDao;
import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sergy
 */
public class VisualizarRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarRelatorio
     */
    public VisualizarRelatorio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UI_1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButtonGrafico = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRelatorio = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMesDesejado = new javax.swing.JTextField();
        jButtonListarAnual = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UI_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        UI_1.setForeground(new java.awt.Color(254, 173, 0));
        UI_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UI_1.setText("RELATÓRIO");
        getContentPane().add(UI_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 1920, 80));

        jPanel7.setBackground(new java.awt.Color(40, 40, 40));

        jButtonGrafico.setBackground(new java.awt.Color(254, 173, 0));
        jButtonGrafico.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonGrafico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGrafico.setText("GRAFICO");
        jButtonGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficoActionPerformed(evt);
            }
        });

        jButtonListar.setBackground(new java.awt.Color(254, 173, 0));
        jButtonListar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonListar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListar.setText("LISTAR");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });

        jTextFieldId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jTextFieldDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DESCRIÇÃO:");

        jTableRelatorio.setBackground(new java.awt.Color(0, 0, 0));
        jTableRelatorio.setForeground(new java.awt.Color(255, 255, 255));
        jTableRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Data", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTableRelatorio);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DATA:");

        jTextFieldMesDesejado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldMesDesejado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMesDesejadoActionPerformed(evt);
            }
        });

        jButtonListarAnual.setBackground(new java.awt.Color(254, 173, 0));
        jButtonListarAnual.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonListarAnual.setForeground(new java.awt.Color(255, 255, 255));
        jButtonListarAnual.setText("LISTAR ANUAL");
        jButtonListarAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarAnualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMesDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jButtonGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMesDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jButtonListarAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1370, 680));

        Background.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tp/icones/LogoSoneCar3.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficoActionPerformed
        
        try {
    TipoDeGastosDao tgastosDao = new TipoDeGastosDao();
    GastosDao gastosDao = new GastosDao();
    SetGastosInGrafico graficGenerator = new SetGastosInGrafico();
    SepararGastosPorDate separarGastosPorDate = new SepararGastosPorDate();

    ArrayList<Gastos> gastosList;
    String tipoDeGastosDescricao = jTextFieldDescricao.getText();
    int tipoDeGastosId = tgastosDao.encontrarIdTipoDeGastoPorDescricao(tipoDeGastosDescricao);
    gastosList = separarGastosPorDate.filtrarGastosPorMes(gastosDao.listarGastosPorTipo(jTextFieldDescricao.getText()), Integer.parseInt(jTextFieldMesDesejado.getText()));
    graficGenerator.gerarGraficoGastos(gastosList, Integer.parseInt(jTextFieldMesDesejado.getText()));
} catch (Exception ex) {
    Logger.getLogger(VisualizarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_jButtonGraficoActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        try {
            SetarGastosNumaTable setarGastos = new SetarGastosNumaTable();
            SepararGastosPorDate separator = new SepararGastosPorDate();
            TipoDeGastosDao listerine = new TipoDeGastosDao();
            listerine.listarTiposDeGasto();
            GastosDao gDao = new GastosDao();
            Stack<Gastos> pilhaGastos = separator.organizarGastosPorData(gDao.listarGastosPorTipo(jTextFieldDescricao.getText()), Integer.parseInt(jTextFieldMesDesejado.getText()));
            setarGastos.exibirGastosEmTable(pilhaGastos, jTableRelatorio);
        } catch (Exception ex) {
            Logger.getLogger(VisualizarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jTextFieldMesDesejadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMesDesejadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMesDesejadoActionPerformed

    private void jButtonListarAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarAnualActionPerformed
        try {
            TipoDeGastosDao tgastoDao = new TipoDeGastosDao();
            GastosDao gDao = new GastosDao();
            ArrayList<Gastos> colgate = gDao.listarGastosPorTipo(jTextFieldDescricao.getText());
            int tipoGastoID = tgastoDao.encontrarIdTipoDeGastoPorDescricao(jTextFieldDescricao.getText());
            if (tipoGastoID >= 0) {
                ArrayList<AnoSomaGastos> somaAnual = GastosUtils.somarGastosPorAno(colgate, tgastoDao.getTipoDeGastosById(tipoGastoID));
                Stack<AnoSomaGastos> pilhaAnoSomaGastos = new Stack<>();
                for (AnoSomaGastos anoSomaGastos : somaAnual) {
                    int ano = anoSomaGastos.getAno();
                    double soma = anoSomaGastos.getSoma();
                        
                    pilhaAnoSomaGastos.push(new AnoSomaGastos(ano, soma));
                }
                    
                SetarGastosNumaTable exibGasto = new SetarGastosNumaTable();
                exibGasto.exibirGastosEmTableAnual(pilhaAnoSomaGastos, jTableRelatorio);
            } else {
                System.out.println("deu ruim");
            }
        } catch (Exception ex) {
            Logger.getLogger(VisualizarRelatorio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButtonListarAnualActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel UI_1;
    private javax.swing.JButton jButtonGrafico;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JButton jButtonListarAnual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableRelatorio;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldMesDesejado;
    // End of variables declaration//GEN-END:variables
}

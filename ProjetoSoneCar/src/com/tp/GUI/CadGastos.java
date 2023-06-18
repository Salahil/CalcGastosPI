/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tp.GUI;

import com.tp.persistencia.GastosDao;
import com.tp.persistencia.IGastosDao;
import com.tp.persistencia.TipoDeGastosDao;
import com.tp.persistencia.ITipoDeGastosDao;
import com.tp.modelos.subClasses.*;

import java.awt.Dimension;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author sergy
 */
public class CadGastos extends javax.swing.JFrame {
    
    private IGastosDao gastosBD;
    private ITipoDeGastosDao tipoDeGastoBD;

    private DefaultTableModel tableModel;


    /**
     * Creates new form CadGastos
     */
    public CadGastos() throws Exception {
       initComponents();

        gastosBD = new GastosDao();
        tipoDeGastoBD = new TipoDeGastosDao();

        tableModel = (DefaultTableModel) jTableTabelaDeGasto.getModel();
        atualizarGrid(tipoDeGastoBD.listaDeTipoDeGasto());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxGasto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        UI_1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaDeGasto = new javax.swing.JTable();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(40, 40, 40));

        jTextFieldValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        jTextFieldId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("GASTO:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VALOR:");

        jComboBoxGasto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxGasto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATA:");

        jTextFieldData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxGasto, 0, 162, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jTextFieldValor))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jComboBoxGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 135, -1, 280));

        UI_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        UI_1.setForeground(new java.awt.Color(254, 173, 0));
        UI_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UI_1.setText("CADASTRO DE GASTO");
        getContentPane().add(UI_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 80));

        jPanel8.setBackground(new java.awt.Color(40, 40, 40));

        jButtonIncluir.setBackground(new java.awt.Color(254, 173, 0));
        jButtonIncluir.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonIncluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIncluir.setText("INCLUIR");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(254, 173, 0));
        jButtonAlterar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(254, 173, 0));
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 420, 310));

        jTableTabelaDeGasto.setBackground(new java.awt.Color(40, 40, 40));
        jTableTabelaDeGasto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTableTabelaDeGasto.setForeground(new java.awt.Color(255, 255, 255));
        jTableTabelaDeGasto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DATA", "VALOR", "GASTO"
            }
        ));
        jTableTabelaDeGasto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaDeGastoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaDeGasto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1340, 560));

        Background.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tp/icones/LogoSoneCar3.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        try {
            float valor = Float.parseFloat(jTextFieldValor.getText());
            String tipoDeGasto = jComboBoxGasto.getSelectedItem().toString();
            LocalDate gastosDate = LocalDate.now();

            // Crie um objeto Gastos com os dados inseridos
            Gastos gastos = new Gastos();
            gastos.setValor(valor);
            // Recupere o tipoDeGasto do banco de dados usando tipoDeGastoBD e atribua-o ao objeto gastos
            // gastos.setTipoDeGasto(tipoDeGastoBD.getTipoDeGasto(tipoDeGasto));
            Date date = Date.from(gastosDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            // Salve o objeto gastos no banco de dados usando gastosBD
            gastosBD.createGasto(gastos);

            // Exiba uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Gastos cadastrados com sucesso.");

            // Atualize a tabela
            atualizarGrid(tipoDeGastoBD.listaDeTipoDeGasto());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor inválido. Insira um número válido.");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            int id = Integer.parseInt(jTextFieldId.getText());
            float valor = Float.parseFloat(jTextFieldValor.getText());
            String tipoDeGasto = jComboBoxGasto.getSelectedItem().toString();
            LocalDate gastosDate = LocalDate.now();

            // Crie um objeto Gastos com os dados inseridos
            Gastos gastos = new Gastos();
            gastos.setId(id);
            gastos.setValor(valor);
            // Recupere o tipoDeGasto do banco de dados usando tipoDeGastoBD e atribua-o ao objeto gastos
            // gastos.setTipoDeGasto(tipoDeGastoBD.getTipoDeGasto(tipoDeGasto));
            Date date = Date.from(gastosDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

            // Atualize o objeto gastos no banco de dados usando gastosBD
            gastosBD.alterarGastos(gastos);

            // Exiba uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Gastos atualizados com sucesso.");

            // Atualize a tabela
            atualizarGrid(tipoDeGastoBD.listaDeTipoDeGasto());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Valor inválido. Insira um número válido.");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        
    }//GEN-LAST:event_jTextFieldValorActionPerformed
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            int id = Integer.parseInt(jTextFieldId.getText());

            // Exclua o objeto gastos do banco de dados usando gastosBD
            gastosBD.excluirGastos(id);

            // Exiba uma mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Gastos excluídos com sucesso.");

            // Limpe os campos de entrada
            jTextFieldId.setText("");
            jTextFieldValor.setText("");
            jComboBoxGasto.setSelectedIndex(0);

            // Atualize a tabela
            atualizarGrid(tipoDeGastoBD.listaDeTipoDeGasto());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Insira um número válido.");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed
        
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jTableTabelaDeGastoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaDeGastoMouseClicked
// Obtenha o índice da linha selecionada
        int rowIndex = jTableTabelaDeGasto.getSelectedRow();

        // Obtenha o valor da célula da coluna de ID
        int id = (int) jTableTabelaDeGasto.getValueAt(rowIndex, 0);

        // Use o ID para buscar os detalhes do gasto no banco de dados usando gastosBD
        Gastos gastos = null;
        try {
            gastos = gastosBD.getGasto(id);
        } catch (Exception ex) {
            Logger.getLogger(CadGastos.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Preencha os campos de entrada com os detalhes do gasto
        jTextFieldId.setText(String.valueOf(gastos.getId()));
        jTextFieldValor.setText(String.valueOf(gastos.getValor()));
        //jComboBoxGasto.setSelectedItem(gastos.getTipoDeGasto().getDescricao());
        //TODO add your handling code here:
    }//GEN-LAST:event_jTableTabelaDeGastoMouseClicked

    private void jTextFieldDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataActionPerformed

    
    private void atualizarGrid(ArrayList<TipoDeGastos> tipoDeGastos) {
        // Limpe o conteúdo da tabela
        tableModel.setRowCount(0);

        // Percorra a lista de tipoDeGastos e adicione cada um como uma nova linha na tabela
        for (TipoDeGastos tipoDeGasto : tipoDeGastos) {
            tableModel.addRow(new Object[]{
                tipoDeGasto.getId(),
                tipoDeGasto.getDescricao()
            });
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadGastos().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CadGastos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel UI_1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JComboBox<String> jComboBoxGasto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaDeGasto;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}

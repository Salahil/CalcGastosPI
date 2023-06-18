/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tp.GUI;

import com.tp.modelos.subClasses.TipoDeGastos;
import com.tp.persistencia.GastosDao;
import com.tp.persistencia.IGastosDao;
import com.tp.persistencia.ITipoDeGastosDao;
import com.tp.persistencia.TipoDeGastosDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergy
 */
public class CadTipoDeGasto extends javax.swing.JFrame {

    /**
     * Creates new form CadTipoDeGasto
     */
    public CadTipoDeGasto() throws Exception {
        initComponents();
        atualizarGrid(new TipoDeGastosDao().listaDeTipoDeGasto());
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButtonIncluirTipoDeGasto = new javax.swing.JButton();
        jButtonAlterarTipoDeGasto = new javax.swing.JButton();
        jButtonExcluirTipoDeGastos = new javax.swing.JButton();
        jButtonBuscarTipoDeGasto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGridGridGridGrid = new javax.swing.JTable();
        jButtonReturn = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UI_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        UI_1.setForeground(new java.awt.Color(254, 173, 0));
        UI_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UI_1.setText("INSERIR TIPO DE GASTO");
        getContentPane().add(UI_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, 0, 1920, 80));

        jPanel7.setBackground(new java.awt.Color(40, 40, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        jTextFieldID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldID.setText("24");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DESCRIÇAO:");

        jTextFieldDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldDescricao.setText("GASOLINA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 450, 130));

        jPanel8.setBackground(new java.awt.Color(40, 40, 40));

        jButtonIncluirTipoDeGasto.setBackground(new java.awt.Color(254, 173, 0));
        jButtonIncluirTipoDeGasto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonIncluirTipoDeGasto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIncluirTipoDeGasto.setText("INCLUIR");
        jButtonIncluirTipoDeGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirTipoDeGastoActionPerformed(evt);
            }
        });

        jButtonAlterarTipoDeGasto.setBackground(new java.awt.Color(254, 173, 0));
        jButtonAlterarTipoDeGasto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonAlterarTipoDeGasto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterarTipoDeGasto.setText("ALTERAR");
        jButtonAlterarTipoDeGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarTipoDeGastoActionPerformed(evt);
            }
        });

        jButtonExcluirTipoDeGastos.setBackground(new java.awt.Color(254, 173, 0));
        jButtonExcluirTipoDeGastos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonExcluirTipoDeGastos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluirTipoDeGastos.setText("EXCLUIR");
        jButtonExcluirTipoDeGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirTipoDeGastosActionPerformed(evt);
            }
        });

        jButtonBuscarTipoDeGasto.setBackground(new java.awt.Color(254, 173, 0));
        jButtonBuscarTipoDeGasto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonBuscarTipoDeGasto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarTipoDeGasto.setText("BUSCAR");
        jButtonBuscarTipoDeGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTipoDeGastoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIncluirTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlterarTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluirTipoDeGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonIncluirTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterarTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluirTipoDeGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscarTipoDeGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 430, 270));

        jTableGridGridGridGrid.setBackground(new java.awt.Color(40, 40, 40));
        jTableGridGridGridGrid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTableGridGridGridGrid.setForeground(new java.awt.Color(255, 255, 255));
        jTableGridGridGridGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "DESCRIÇAO"
            }
        ));
        jScrollPane1.setViewportView(jTableGridGridGridGrid);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1380, 560));

        jButtonReturn.setBackground(new java.awt.Color(254, 173, 0));
        jButtonReturn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReturn.setText("X");
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 70, -1));

        Background.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tp/icones/LogoSoneCar3.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirTipoDeGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirTipoDeGastoActionPerformed
          try {
    String descricao = jTextFieldDescricao.getText();
    ITipoDeGastosDao tipoDeGastosBD = new TipoDeGastosDao();
   
     
//    if (marcaBD.descricaoJaExiste(descricao, url)) {
//        JOptionPane.showMessageDialog(this, "A descrição já existe. Não é possível cadastrar novamente.");
//        return;
//    }
    
    atualizarGrid(tipoDeGastosBD.listaDeTipoDeGasto());
    TipoDeGastos tipoDeGastos = new TipoDeGastos(descricao);
    tipoDeGastosBD.createTipoDeGasto(tipoDeGastos);
    limparTela();
    
} catch (Exception erro) {
    JOptionPane.showMessageDialog(this,"A descrição já existe. Não é possível cadastrar novamente.");
}
    }//GEN-LAST:event_jButtonIncluirTipoDeGastoActionPerformed

    private void jButtonAlterarTipoDeGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarTipoDeGastoActionPerformed
        try {

            int id = Integer.parseInt(jTextFieldID.getText());
            String descricao = jTextFieldDescricao.getText();

            TipoDeGastos gastos = new TipoDeGastos();
            gastos.setId(id);
            gastos.setDescricao(descricao);
            
            TipoDeGastosDao tipoDeGastosDao = new TipoDeGastosDao();

            
            tipoDeGastosDao.alterarTipoDeGasto(gastos);

            ITipoDeGastosDao tgasto = new TipoDeGastosDao();
            IGastosDao gastosBD = new GastosDao();
        
            atualizarGrid(tgasto.listaDeTipoDeGasto());
            
            
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "Erro ao alterar tipo de gasto: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAlterarTipoDeGastoActionPerformed

    private void jButtonExcluirTipoDeGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirTipoDeGastosActionPerformed
        try {
    int id = Integer.parseInt(jTextFieldID.getText()); // Obtém o ID do JTextField
     ITipoDeGastosDao tipoDeGastosBD = new TipoDeGastosDao();
    tipoDeGastosBD.deletarTipoDeGasto(id);
    
    // Exibição de mensagem de sucesso ou atualização do grid, se necessário
    JOptionPane.showMessageDialog(this, "Esse Tipo de Gasto foi excluída com sucesso.");
    
     atualizarGrid(tipoDeGastosBD.listaDeTipoDeGasto());
    
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido. Insira um valor numérico.");
  } catch (Exception erro) {
    JOptionPane.showMessageDialog(this, erro.getMessage());
}    
    }//GEN-LAST:event_jButtonExcluirTipoDeGastosActionPerformed

    private void jButtonBuscarTipoDeGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTipoDeGastoActionPerformed
        try {
            String idText = jTextFieldID.getText();
    
            if (idText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Insira um ID válido.");
            return;
            }

            int id = Integer.parseInt(idText);
            ITipoDeGastosDao tgastos = new TipoDeGastosDao();
            ArrayList<TipoDeGastos> listaDeConsultores = tgastos.listaDeTipoDeGasto();
            ArrayList<TipoDeGastos> listaDeTiposDeGastosEncontrados = new ArrayList<>();

            for (TipoDeGastos gastinhos : listaDeConsultores) {
                if (gastinhos.getId() == id) {
                    listaDeTiposDeGastosEncontrados.add(gastinhos);
                }
            }

            if (!listaDeTiposDeGastosEncontrados.isEmpty()) {
                atualizarGrid(listaDeTiposDeGastosEncontrados);
            } else {
                JOptionPane.showMessageDialog(this, "Marca não encontrada.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID inválido. Insira um valor numérico.");
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonBuscarTipoDeGastoActionPerformed
 private  void limparTela(){
    jTextFieldID.setText("");
    jTextFieldDescricao.setText("");
}
    
    private void atualizarGrid(ArrayList<TipoDeGastos> listaDeGastos) {
    try {
        DefaultTableModel model = (DefaultTableModel) jTableGridGridGridGrid.getModel();
        model.setNumRows(0);
        for (int pos = 0; pos < listaDeGastos.size(); pos++) {
            TipoDeGastos tipoDeGastos = listaDeGastos.get(pos);
            String[] linha = new String[2];
            linha[0] = "" + tipoDeGastos.getId();
            linha[1] = tipoDeGastos.getDescricao();
            model.addRow(linha);
        }
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(this, erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        System.out.println("Problema em atualizarGrid()");
    }
}

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
            java.util.logging.Logger.getLogger(CadTipoDeGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadTipoDeGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadTipoDeGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadTipoDeGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadTipoDeGasto().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(CadTipoDeGasto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel UI_1;
    private javax.swing.JButton jButtonAlterarTipoDeGasto;
    private javax.swing.JButton jButtonBuscarTipoDeGasto;
    private javax.swing.JButton jButtonExcluirTipoDeGastos;
    private javax.swing.JButton jButtonIncluirTipoDeGasto;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGridGridGridGrid;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldID;
    // End of variables declaration//GEN-END:variables
}

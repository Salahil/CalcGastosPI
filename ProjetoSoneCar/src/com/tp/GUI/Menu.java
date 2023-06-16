/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tp.GUI;


/**
 *
 * @author aluno
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
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
        jButtonCadastrarVeiculo = new javax.swing.JButton();
        jButtonCadastrarModelo = new javax.swing.JButton();
        jButtonCadastrarMarca = new javax.swing.JButton();
        jButtonCadastrarGastos = new javax.swing.JButton();
        jButtonInserirGastos = new javax.swing.JButton();
        jButtonCadastrarProprietario = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UI_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        UI_1.setForeground(new java.awt.Color(254, 173, 0));
        UI_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UI_1.setText("MENU PRINCIPAL");
        add(UI_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 80));

        jPanel7.setBackground(new java.awt.Color(40, 40, 40));

        jButtonCadastrarVeiculo.setBackground(new java.awt.Color(254, 173, 0));
        jButtonCadastrarVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonCadastrarVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarVeiculo.setText("CADASTRAR VEICULO");

        jButtonCadastrarModelo.setBackground(new java.awt.Color(254, 173, 0));
        jButtonCadastrarModelo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonCadastrarModelo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarModelo.setText("CADASTRAR MODELO");
        jButtonCadastrarModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarModeloActionPerformed(evt);
            }
        });

        jButtonCadastrarMarca.setBackground(new java.awt.Color(254, 173, 0));
        jButtonCadastrarMarca.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonCadastrarMarca.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarMarca.setText("CADASTRAR MARCA");

        jButtonCadastrarGastos.setBackground(new java.awt.Color(254, 173, 0));
        jButtonCadastrarGastos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonCadastrarGastos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarGastos.setText("CADASTRAR GASTOS");

        jButtonInserirGastos.setBackground(new java.awt.Color(254, 173, 0));
        jButtonInserirGastos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonInserirGastos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInserirGastos.setText("INSERIR GASTOS");

        jButtonCadastrarProprietario.setBackground(new java.awt.Color(254, 173, 0));
        jButtonCadastrarProprietario.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonCadastrarProprietario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrarProprietario.setText("CADASTRAR PROPRIETARIO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCadastrarProprietario, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCadastrarGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInserirGastos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButtonCadastrarProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButtonCadastrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonCadastrarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonCadastrarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonCadastrarGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonInserirGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 520, 540));

        Background.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tp/icones/LogoSoneCar3.png"))); // NOI18N
        add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarModeloActionPerformed

    }//GEN-LAST:event_jButtonCadastrarModeloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel UI_1;
    private javax.swing.JButton jButtonCadastrarGastos;
    private javax.swing.JButton jButtonCadastrarMarca;
    private javax.swing.JButton jButtonCadastrarModelo;
    private javax.swing.JButton jButtonCadastrarProprietario;
    private javax.swing.JButton jButtonCadastrarVeiculo;
    private javax.swing.JButton jButtonInserirGastos;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}

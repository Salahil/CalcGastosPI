/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tp.GUI;

import com.tp.modelos.Marca;
import com.tp.persistencia.IMarcaDao;
import com.tp.persistencia.MarcaDao;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sergy
 */
public class CadMarca extends javax.swing.JFrame {
      String urlArquivo = "";
      String imagePath = "";
    /**
     * Creates new form CadastroDeMarca
     */
    public CadMarca() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDadosProjeto = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jButtonIncluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        UI_1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonBuscarMarca = new javax.swing.JButton();
        jButtonReturn = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldUrl = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableDadosProjeto.setBackground(new java.awt.Color(40, 40, 40));
        jTableDadosProjeto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTableDadosProjeto.setForeground(new java.awt.Color(255, 255, 255));
        jTableDadosProjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇAO", "URL"
            }
        ));
        jScrollPane1.setViewportView(jTableDadosProjeto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1290, 230));

        jPanel8.setBackground(new java.awt.Color(40, 40, 40));

        jButtonIncluir.setBackground(new java.awt.Color(254, 173, 0));
        jButtonIncluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonIncluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIncluir.setText("INCLUIR");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(254, 173, 0));
        jButtonAlterar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("ALTERAR");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(254, 173, 0));
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonConsultar.setBackground(new java.awt.Color(254, 173, 0));
        jButtonConsultar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultar.setText("CONSULTAR");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jButtonIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 130, 420, -1));

        UI_1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        UI_1.setForeground(new java.awt.Color(254, 173, 0));
        UI_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UI_1.setText("CADASTRO DE MARCA");
        getContentPane().add(UI_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 10, 1920, 80));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MARCA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 330, 50));

        jButtonBuscarMarca.setBackground(new java.awt.Color(254, 173, 0));
        jButtonBuscarMarca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonBuscarMarca.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarMarca.setText("BUSCAR");
        jButtonBuscarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 120, 40));

        jButtonReturn.setBackground(new java.awt.Color(254, 173, 0));
        jButtonReturn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jButtonReturn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonReturn.setText("X");
        getContentPane().add(jButtonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 10, 70, -1));
        getContentPane().add(jLabelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 240, 160));

        jPanel7.setBackground(new java.awt.Color(40, 40, 40));

        jTextFieldUrl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID:");

        jTextFieldId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("URL:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DESCRIÇAO:");

        jTextFieldDescricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDescricaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldUrl))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 200));

        Background.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tp/icones/LogoSoneCar3.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        // TODO add your handling code here:
         try {
    String descricao = jTextFieldDescricao.getText();
    String url = jTextFieldUrl.getText();

    IMarcaDao marcaBD = new MarcaDao();
   
    boolean descricaoUrlJaExiste = marcaBD.descricaoJaExiste(jTextFieldDescricao.getText(), jTextFieldUrl.getText());

    if (descricaoUrlJaExiste) {
        JOptionPane.showMessageDialog(null, "A descrição já existe. Não é possível cadastrar novamente.");
        return;
    }
    
    atualizarGrid(marcaBD.listaDeMarca());
    Marca marca = new Marca(descricao, url);
    marcaBD.createMarca(marca);
    limparTela();
    
} catch (Exception erro) {
    JOptionPane.showMessageDialog(this,"A descrição já existe. Não é possível cadastrar novamente.");
}
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonBuscarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarMarcaActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        try{
        JFileChooser fc = new JFileChooser(".\\src\\com\\tp\\ferramentas\\imagens");
        fc.setDialogTitle("Buscar Imagem");
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        IMarcaDao marcaBD = new MarcaDao();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg", "png", "jpeg", "jfif");

        fc.setFileFilter(filter);
        int retorno = fc.showOpenDialog(this);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = fc.getSelectedFile();
            urlArquivo = selectedImageFile.getPath();
            jTextFieldUrl.setText(urlArquivo);
            imagePath = selectedImageFile.getAbsolutePath();
            
            ImageIcon imagemCarro = new ImageIcon(urlArquivo);
            imagemCarro.setImage(imagemCarro.getImage().getScaledInstance(jLabelImagem.getWidth(), jLabelImagem.getHeight(), 1));
            jLabelImagem.setIcon(imagemCarro);
             atualizarGrid(marcaBD.listaDeMarca());
        }}catch (Exception erro) {
    JOptionPane.showMessageDialog(this, erro.getMessage());
}  
    }//GEN-LAST:event_jButtonBuscarMarcaActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
         try {
        int id = Integer.parseInt(jTextFieldId.getText()); // Obtém o ID do JTextField
        String descricao = jTextFieldDescricao.getText(); // Obtém a descrição do JTextField

        // Cria um objeto Marca com os dados atualizados
        Marca marca = new Marca();
        marca.setId(id);
        marca.setDescricao(descricao);

        IMarcaDao marcaBD = new MarcaDao();
        marcaBD.alterarMarca(marca);

        // Exibição de mensagem de sucesso
        JOptionPane.showMessageDialog(this, "Marca alterada com sucesso.");

        // Atualiza o grid de marcas
        atualizarGrid(marcaBD.listaDeMarca());

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido. Insira um valor numérico.");
    } catch (Exception erro) {
        JOptionPane.showMessageDialog(this, erro.getMessage());
    }  // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        try {
    int id = Integer.parseInt(jTextFieldId.getText()); // Obtém o ID do JTextField
    IMarcaDao marcaBD = new MarcaDao();
    marcaBD.deleteMarca(id);
    
    // Exibição de mensagem de sucesso ou atualização do grid, se necessário
    JOptionPane.showMessageDialog(this, "Marca excluída com sucesso.");
    
     atualizarGrid(marcaBD.listaDeMarca());
    
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido. Insira um valor numérico.");
  } catch (Exception erro) {
    JOptionPane.showMessageDialog(this, erro.getMessage());
}    
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDescricaoActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        try {
    String idText = jTextFieldId.getText();
    
    // Verifica se o campo de ID está vazio
    if (idText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Insira um ID válido.");
        return;
    }
    
    int id = Integer.parseInt(idText); // Obtém o ID do JTextField
    IMarcaDao marcaBD = new MarcaDao();
    ArrayList<Marca> listaDeConsultores = marcaBD.listaDeMarca();
    ArrayList<Marca> listaDeMarcasEncontradas = new ArrayList<>();
    
    // Verifica se a marca com o ID especificado está na lista
    for (Marca marca : listaDeConsultores) {
        if (marca.getId() == id) {
            listaDeMarcasEncontradas.add(marca);
        }
    }
    
    // Verifica se foram encontradas marcas com o ID especificado
    if (!listaDeMarcasEncontradas.isEmpty()) {
        atualizarGrid(listaDeMarcasEncontradas);
    } else {
        JOptionPane.showMessageDialog(this, "Marca não encontrada.");
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "ID inválido. Insira um valor numérico.");
} catch (Exception erro) {
    JOptionPane.showMessageDialog(this, erro.getMessage());
}
        
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private  void limparTela(){
    jTextFieldId.setText("");
    jTextFieldDescricao.setText("");
    jTextFieldUrl.setText("");
}
    private void atualizarGrid(ArrayList<Marca>listaDeConsultores){
   try {
    DefaultTableModel model =  (DefaultTableModel) jTableDadosProjeto.getModel();
    model.setNumRows(0);
    for(int pos = 0; pos < listaDeConsultores.size(); pos++){
      Marca pessoa = listaDeConsultores.get(pos);
                String[] linha = new String[3];
                linha[0]= pessoa.getId()+ "";
                linha[1]= pessoa.getDescricao();
                linha[2]= pessoa.getUrl();
                Object[] dados = {linha[0], linha[1],linha[2]};
                model.addRow(dados);
            }
            //JOptionPane.showMessageDialog(rootPane, dadosDosProfessores.toString());
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
             System.out.println("isProblem in atualizarGrid()_Menu");
        }
   
}
    
    public class CellRenderer extends DefaultTableCellRenderer{
    //o
    JLabel jLabelImagem = new JLabel();
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row,
int column){
            
            if(isSelected){
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            
            }else{
            this.setBackground(table.getBackground());
            this.setForeground(table.getForeground());
            }
            ImageIcon logo = new ImageIcon(table.getValueAt(row, column -1).toString());
            jLabelImagem.setText("");
            logo.setImage(logo.getImage().getScaledInstance(table.getRowHeight(), table.getRowHeight(), 1));
            jLabelImagem.setIcon(logo);
            jLabelImagem.setHorizontalAlignment(CENTER);
            return jLabelImagem;
        
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
            java.util.logging.Logger.getLogger(CadMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        JFrame frame = new JFrame();
        Dimension Size = new Dimension(800,600);
        frame.setSize(Size);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadMarca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel UI_1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscarMarca;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDadosProjeto;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldUrl;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author house
 */
public class TBuscaFornecedor extends javax.swing.JDialog {

    
    public JComboBox<String> getjCombobox() {
        return jCombobox;
    }

    public void setjCombobox(JComboBox<String> jCombobox) {
        this.jCombobox = jCombobox;
    }
    
    public JButton getjButtonCarregar() {
        return jButtonCarregar;
    }

    public void setjButtonCarregar(JButton jButtonCarregar) {
        this.jButtonCarregar = jButtonCarregar;
    }

    public JButton getjButtonFiltrar() {
        return jButtonFiltrar;
    }

    public void setjButtonFiltrar(JButton jButtonFiltrar) {
        this.jButtonFiltrar = jButtonFiltrar;
    }

    public JButton getjButtonSair() {
        return jButtonSair;
    }

    public void setjButtonSair(JButton jButtonSair) {
        this.jButtonSair = jButtonSair;
    }

    public JPanel getjPanDados() {
        return jPanDados;
    }

    public void setjPanDados(JPanel jPanDados) {
        this.jPanDados = jPanDados;
    }

    public JPanel getjPanFiltro() {
        return jPanFiltro;
    }

    public void setjPanFiltro(JPanel jPanFiltro) {
        this.jPanFiltro = jPanFiltro;
    }

    public JTextField getjTFFitrar() {
        return jTFFitrar;
    }

    public void setjTFFitrar(JTextField jTFFitrar) {
        this.jTFFitrar = jTFFitrar;
    }

    public JTable getjTableDados() {
        return jTableDados;
    }

    public void setjTableDados(JTable jTableDados) {
        this.jTableDados = jTableDados;
    }
    /**
     * Creates new form TemplateBuscas
     */
    public TBuscaFornecedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanBotoes = new javax.swing.JPanel();
        jButtonCarregar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jPanDados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanFiltro = new javax.swing.JPanel();
        jTFFitrar = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jCombobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca de Bairros");

        jPanTitulo.setBackground(new java.awt.Color(255, 204, 102));
        jPanTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanTitulo.setForeground(new java.awt.Color(153, 255, 0));

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Fornecedor");

        javax.swing.GroupLayout jPanTituloLayout = new javax.swing.GroupLayout(jPanTitulo);
        jPanTitulo.setLayout(jPanTituloLayout);
        jPanTituloLayout.setHorizontalGroup(
            jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanTituloLayout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanTituloLayout.setVerticalGroup(
            jPanTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanBotoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanBotoes.setEnabled(false);

        jButtonCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Down.png"))); // NOI18N
        jButtonCarregar.setText("Carregar");
        jButtonCarregar.setPreferredSize(new java.awt.Dimension(115, 35));
        jButtonCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarActionPerformed(evt);
            }
        });

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Exit.png"))); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.setPreferredSize(new java.awt.Dimension(115, 35));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanBotoesLayout = new javax.swing.GroupLayout(jPanBotoes);
        jPanBotoes.setLayout(jPanBotoesLayout);
        jPanBotoesLayout.setHorizontalGroup(
            jPanBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanBotoesLayout.setVerticalGroup(
            jPanBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanDados.setEnabled(false);

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "nome", "email", "cnpj", "status"
            }
        ));
        jScrollPane1.setViewportView(jTableDados);
        if (jTableDados.getColumnModel().getColumnCount() > 0) {
            jTableDados.getColumnModel().getColumn(0).setMaxWidth(70);
            jTableDados.getColumnModel().getColumn(1).setMaxWidth(550);
        }

        javax.swing.GroupLayout jPanDadosLayout = new javax.swing.GroupLayout(jPanDados);
        jPanDados.setLayout(jPanDadosLayout);
        jPanDadosLayout.setHorizontalGroup(
            jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanDadosLayout.setVerticalGroup(
            jPanDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );

        jPanFiltro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanFiltro.setEnabled(false);

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "nome", "email", "cnpj", "status" }));
        jCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanFiltroLayout = new javax.swing.GroupLayout(jPanFiltro);
        jPanFiltro.setLayout(jPanFiltroLayout);
        jPanFiltroLayout.setHorizontalGroup(
            jPanFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanFiltroLayout.createSequentialGroup()
                .addComponent(jTFFitrar, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanFiltroLayout.setVerticalGroup(
            jPanFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanFiltroLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFFitrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCarregarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboboxActionPerformed

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
            java.util.logging.Logger.getLogger(TemplateBuscas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemplateBuscas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemplateBuscas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemplateBuscas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TBuscaFornecedor dialog = new TBuscaFornecedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCarregar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jCombobox;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanBotoes;
    private javax.swing.JPanel jPanDados;
    private javax.swing.JPanel jPanFiltro;
    private javax.swing.JPanel jPanTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFFitrar;
    private javax.swing.JTable jTableDados;
    // End of variables declaration//GEN-END:variables
}

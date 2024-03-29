/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import dao.LojaDAO;
import dao.ProdutoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Loja;

/**
 *
 * @author Vanessa Ortiz
 */
public class LojasRecomendadas extends javax.swing.JFrame {
LojaDAO dao ;
    public LojasRecomendadas() {
         initComponents();
         dao = new LojaDAO();
        List<Loja> lista = dao.selectRecomendadas();

        DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();

        Object[] linha = new Object[modelo.getColumnCount()];

        for (Loja list : lista) {

            linha[0] = list.getL_name();

            modelo.addRow(linha);
        }
    }
private void limparTabela() {
while (tblTabela.getRowCount() > 0) {
DefaultTableModel dm = (DefaultTableModel) tblTabela.getModel();
dm.getDataVector().removeAllElements();
}
}


      
    
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblTabela = new javax.swing.JTable();
        cbxOrdenacao = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));

        tblTabela.setBackground(new java.awt.Color(204, 204, 204));
        tblTabela.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        tblTabela.setForeground(new java.awt.Color(255, 102, 0));
        tblTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lojas Recomendadas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTabela);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 480, 360));

        cbxOrdenacao.setBackground(new java.awt.Color(102, 102, 102));
        cbxOrdenacao.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        cbxOrdenacao.setForeground(new java.awt.Color(255, 102, 0));
        cbxOrdenacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Crescente", "Decrescente" }));
        cbxOrdenacao.setToolTipText("");
        cbxOrdenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrdenacaoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxOrdenacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 160, 20));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Ordenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 100, 20));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 530, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arquivo_imagem/FunoProd.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LojaTela tela = new LojaTela ();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        if (cbxOrdenacao.getSelectedIndex() == 1){
        
        DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
       
        modelo.getDataVector().removeAllElements();
            
        List<Loja> lista = dao.selectR();
        
        

        Object[] linha = new Object[modelo.getColumnCount()];

        for (Loja list : lista) {

            linha[0] = list.getL_name();

            modelo.addRow(linha);
        } 
        } else if (cbxOrdenacao.getSelectedIndex() == 2){
        
         DefaultTableModel modelo = (DefaultTableModel) tblTabela.getModel();
         modelo.getDataVector().removeAllElements();
            
        List<Loja> lista = dao.selectR2();

        
        Object[] linha = new Object[modelo.getColumnCount()];

        for (Loja list : lista) {

            linha[0] = list.getL_name();

            modelo.addRow(linha);
       
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxOrdenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrdenacaoActionPerformed
       
    }//GEN-LAST:event_cbxOrdenacaoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
        
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(LojasRecomendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojasRecomendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojasRecomendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojasRecomendadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojasRecomendadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbxOrdenacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTabela;
    // End of variables declaration//GEN-END:variables
}

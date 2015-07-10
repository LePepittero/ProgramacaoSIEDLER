package admin;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuGerenUsu = new javax.swing.JMenuItem();
        menuListarUsu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuGerenLoja = new javax.swing.JMenuItem();
        menuListarLoja = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuGerenProd = new javax.swing.JMenuItem();
        menuListarProd = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 204));

        jMenu1.setBackground(new java.awt.Color(0, 0, 204));
        jMenu1.setForeground(new java.awt.Color(0, 0, 204));
        jMenu1.setText("Usuario");

        menuGerenUsu.setText("Gerenciar");
        menuGerenUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenUsuActionPerformed(evt);
            }
        });
        jMenu1.add(menuGerenUsu);

        menuListarUsu.setText("Listar");
        menuListarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarUsuActionPerformed(evt);
            }
        });
        jMenu1.add(menuListarUsu);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 204));
        jMenu2.setText("Loja");

        menuGerenLoja.setText("Gerenciar");
        menuGerenLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenLojaActionPerformed(evt);
            }
        });
        jMenu2.add(menuGerenLoja);

        menuListarLoja.setText("Listar");
        menuListarLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarLojaActionPerformed(evt);
            }
        });
        jMenu2.add(menuListarLoja);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 0, 204));
        jMenu3.setForeground(new java.awt.Color(0, 0, 204));
        jMenu3.setText("Produto");

        menuGerenProd.setText("Gerenciar");
        menuGerenProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenProdActionPerformed(evt);
            }
        });
        jMenu3.add(menuGerenProd);

        menuListarProd.setText("Listar");
        menuListarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarProdActionPerformed(evt);
            }
        });
        jMenu3.add(menuListarProd);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGerenLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenLojaActionPerformed
        lojaManter tela = new lojaManter();
        
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuGerenLojaActionPerformed

    private void menuGerenUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenUsuActionPerformed
        usuarioManter tela = new usuarioManter();
        
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuGerenUsuActionPerformed

    private void menuListarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarUsuActionPerformed
        usuarioListar tela = new usuarioListar();
        
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarUsuActionPerformed

    private void menuListarLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarLojaActionPerformed
        lojaListar tela = new lojaListar();
        
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarLojaActionPerformed

    private void menuGerenProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenProdActionPerformed
         produtoManter tela = new produtoManter();
        
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuGerenProdActionPerformed

    private void menuListarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarProdActionPerformed
        produtoListar tela = new produtoListar();
        
        
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarProdActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem menuGerenLoja;
    private javax.swing.JMenuItem menuGerenProd;
    private javax.swing.JMenuItem menuGerenUsu;
    private javax.swing.JMenuItem menuListarLoja;
    private javax.swing.JMenuItem menuListarProd;
    private javax.swing.JMenuItem menuListarUsu;
    // End of variables declaration//GEN-END:variables
}

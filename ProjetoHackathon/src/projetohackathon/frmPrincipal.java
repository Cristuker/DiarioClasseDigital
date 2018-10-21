package projetohackathon;

public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();
        ativdadeM = new javax.swing.JMenu();
        mnuNotaProf = new javax.swing.JMenuItem();
        mnuConteudoProf = new javax.swing.JMenuItem();
        mnuAluno = new javax.swing.JMenu();
        mnuNotaAluno = new javax.swing.JMenuItem();
        mnuConteudoAluno = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setText("Arquivo");

        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSair);

        jMenuBar1.add(jMenu1);

        ativdadeM.setText("Professor");

        mnuNotaProf.setText("Notas");
        mnuNotaProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNotaProfActionPerformed(evt);
            }
        });
        ativdadeM.add(mnuNotaProf);

        mnuConteudoProf.setText("Conteúdo");
        mnuConteudoProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConteudoProfActionPerformed(evt);
            }
        });
        ativdadeM.add(mnuConteudoProf);

        jMenuBar1.add(ativdadeM);

        mnuAluno.setText("Aluno");

        mnuNotaAluno.setText("Notas");
        mnuNotaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNotaAlunoActionPerformed(evt);
            }
        });
        mnuAluno.add(mnuNotaAluno);

        mnuConteudoAluno.setText("Conteúdo");
        mnuConteudoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConteudoAlunoActionPerformed(evt);
            }
        });
        mnuAluno.add(mnuConteudoAluno);

        jMenuBar1.add(mnuAluno);

        jMenu4.setText("Administração");

        jMenuItem4.setText("Notificações");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem1.setText("Grade curricular");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuNotaProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNotaProfActionPerformed
        ifrmNotaProf notap = new ifrmNotaProf();
        this.add(notap);
        notap.setVisible(true);
    }//GEN-LAST:event_mnuNotaProfActionPerformed

    private void mnuConteudoProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConteudoProfActionPerformed
        ifrmConteudo cont = new ifrmConteudo();
        this.add(cont);
        cont.setVisible(true);
        cont.habilta();
    }//GEN-LAST:event_mnuConteudoProfActionPerformed

    private void mnuConteudoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConteudoAlunoActionPerformed
        ifrmConteudo cont = new ifrmConteudo();
        this.add(cont);
        cont.setVisible(true);
        cont.desabilita();
    }//GEN-LAST:event_mnuConteudoAlunoActionPerformed

    private void mnuNotaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNotaAlunoActionPerformed
        ifrmNotasAluno notaa = new ifrmNotasAluno();
        this.add(notaa);
        notaa.setVisible(true);
    }//GEN-LAST:event_mnuNotaAlunoActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        ifrmNotificacao notif = new ifrmNotificacao();
        this.add(notif);
        notif.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ifrmGrade GD = new ifrmGrade();
        this.add(GD);
        GD.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        
        
        
        
        
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ativdadeM;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu mnuAluno;
    private javax.swing.JMenuItem mnuConteudoAluno;
    private javax.swing.JMenuItem mnuConteudoProf;
    private javax.swing.JMenuItem mnuNotaAluno;
    private javax.swing.JMenuItem mnuNotaProf;
    private javax.swing.JMenuItem mnuSair;
    // End of variables declaration//GEN-END:variables
}

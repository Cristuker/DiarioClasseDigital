package projetohackathon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author douglasnascimento
 */
public class ifrmConteudo extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmConteudo
     */
    public ifrmConteudo() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        chkbox2 = new javax.swing.JCheckBox();
        chkbox5 = new javax.swing.JCheckBox();
        chkbox3 = new javax.swing.JCheckBox();
        chkbox9 = new javax.swing.JCheckBox();
        chkbox1 = new javax.swing.JCheckBox();
        chkbox4 = new javax.swing.JCheckBox();
        chkbox6 = new javax.swing.JCheckBox();
        chkbox8 = new javax.swing.JCheckBox();
        chkbox7 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSalvar = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Conteúdo programático");

        chkbox2.setText("Conteudo 01");
        chkbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox2ActionPerformed(evt);
            }
        });

        chkbox5.setText("Conteudo 04");
        chkbox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox5ActionPerformed(evt);
            }
        });

        chkbox3.setText("Conteudo 02");
        chkbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox3ActionPerformed(evt);
            }
        });

        chkbox9.setText("Final");
        chkbox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox9ActionPerformed(evt);
            }
        });

        chkbox1.setText("Introdução");
        chkbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox1ActionPerformed(evt);
            }
        });

        chkbox4.setText("Conteudo 03");
        chkbox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox4ActionPerformed(evt);
            }
        });

        chkbox6.setText("Conteudo 05");
        chkbox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox6ActionPerformed(evt);
            }
        });

        chkbox8.setText("Conteudo 07");
        chkbox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox8ActionPerformed(evt);
            }
        });

        chkbox7.setText("Conteudo 06");
        chkbox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbox7ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("Arquivo");

        mnuSalvar.setText("Salvar");
        jMenu1.add(mnuSalvar);

        mnuSair.setText("Sair");
        jMenu1.add(mnuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkbox4)
                    .addComponent(chkbox5)
                    .addComponent(chkbox6)
                    .addComponent(chkbox9)
                    .addComponent(chkbox8)
                    .addComponent(chkbox7)
                    .addComponent(chkbox3)
                    .addComponent(chkbox2)
                    .addComponent(chkbox1))
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkbox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbox4)
                        .addGap(11, 11, 11)
                        .addComponent(chkbox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbox7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbox8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkbox9))
                    .addComponent(jScrollPane1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Conteúdo Programático");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox2ActionPerformed

    private void chkbox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox5ActionPerformed

    private void chkbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox3ActionPerformed

    private void chkbox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox9ActionPerformed

    private void chkbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox1ActionPerformed

    private void chkbox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox4ActionPerformed

    private void chkbox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox6ActionPerformed

    private void chkbox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox8ActionPerformed

    private void chkbox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbox7ActionPerformed

public void desabilita() {
    chkbox1.setEnabled(false);
    chkbox2.setEnabled(false);
    chkbox3.setEnabled(false);
    chkbox4.setEnabled(false);
    chkbox5.setEnabled(false);
    chkbox6.setEnabled(false);
    chkbox7.setEnabled(false);
    chkbox8.setEnabled(false);
    chkbox9.setEnabled(false);
    jTextArea1.setEnabled(false);
}

public void habilta() {
    chkbox1.setEnabled(true);
    chkbox2.setEnabled(true);
    chkbox3.setEnabled(true);
    chkbox4.setEnabled(true);
    chkbox5.setEnabled(true);
    chkbox6.setEnabled(true);
    chkbox7.setEnabled(true);
    chkbox8.setEnabled(true);
    chkbox9.setEnabled(true);
    jTextArea1.setEnabled(true);
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkbox1;
    private javax.swing.JCheckBox chkbox2;
    private javax.swing.JCheckBox chkbox3;
    private javax.swing.JCheckBox chkbox4;
    private javax.swing.JCheckBox chkbox5;
    private javax.swing.JCheckBox chkbox6;
    private javax.swing.JCheckBox chkbox7;
    private javax.swing.JCheckBox chkbox8;
    private javax.swing.JCheckBox chkbox9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenuItem mnuSalvar;
    // End of variables declaration//GEN-END:variables
}

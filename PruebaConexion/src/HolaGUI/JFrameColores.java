/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HolaGUI;

/**
 *
 * @author DAM2Alu10
 */

public class JFrameColores extends javax.swing.JFrame {

    /**
     * Creates new form JFrameColores
     */
    public JFrameColores() {
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

        buttonGroupColores = new javax.swing.ButtonGroup();
        jPanelColores = new javax.swing.JPanel();
        jRadioButtonRojo = new javax.swing.JRadioButton();
        jRadioButtonVerde = new javax.swing.JRadioButton();
        jRadioButtonAzul = new javax.swing.JRadioButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabelColorElegido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelColores.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jPanelColores.border.title"))); // NOI18N
        jPanelColores.setToolTipText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jPanelColores.toolTipText")); // NOI18N

        buttonGroupColores.add(jRadioButtonRojo);
        jRadioButtonRojo.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jRadioButtonRojo.text")); // NOI18N
        jRadioButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonRojoActionPerformed(evt);
            }
        });

        buttonGroupColores.add(jRadioButtonVerde);
        jRadioButtonVerde.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jRadioButtonVerde.text")); // NOI18N

        buttonGroupColores.add(jRadioButtonAzul);
        jRadioButtonAzul.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jRadioButtonAzul.text")); // NOI18N
        jRadioButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelColoresLayout = new javax.swing.GroupLayout(jPanelColores);
        jPanelColores.setLayout(jPanelColoresLayout);
        jPanelColoresLayout.setHorizontalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonRojo)
                    .addComponent(jRadioButtonVerde)
                    .addComponent(jRadioButtonAzul))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanelColoresLayout.setVerticalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRadioButtonRojo)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonVerde)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonAzul)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButtonAceptar.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jButtonAceptar.text")); // NOI18N
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabelColorElegido.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jLabelColorElegido.text")); // NOI18N
        jLabelColorElegido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelColorElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAceptar)
                .addGap(18, 18, 18)
                .addComponent(jLabelColorElegido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonRojoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonRojoActionPerformed

    private void jRadioButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAzulActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
      
       if(jRadioButtonAzul.isSelected())
           jLabelColorElegido.setText("Color elegido: Azul");
       else if(jRadioButtonRojo.isSelected())
           jLabelColorElegido.setText("Color elegido: Rojo");
       else if(jRadioButtonVerde.isSelected())
           jLabelColorElegido.setText("Color elegido: Verde");
       else jLabelColorElegido.setText("No has elegido ningun Color");
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameColores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabelColorElegido;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JRadioButton jRadioButtonAzul;
    private javax.swing.JRadioButton jRadioButtonRojo;
    private javax.swing.JRadioButton jRadioButtonVerde;
    // End of variables declaration//GEN-END:variables
}

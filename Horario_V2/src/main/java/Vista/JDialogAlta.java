/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author DAM2Alu10
 */
public class JDialogAlta extends javax.swing.JDialog {
    JFrameHorario jf;
    ArrayList<JCheckBox> listacheck;
    ArrayList<JRadioButton> listaradio;
    DefaultComboBoxModel dom;
    /**
     * Creates new form JDialogAlta
     */
    public JDialogAlta(java.awt.Frame parent, boolean modal) {
       super(parent,"ALTA HORAS", modal);
        initComponents();
        jf = (JFrameHorario) parent;
        
        String[] horas={"8:25-9:20","9:20-10:15","10:15-11:10","11:40-12:35","12:35-13:30","13:30-14:45"};
        String[] dias={"Lunes","Martes","Miercoles","Jueves","Viernes"};
        String[] modulos={"Diseño Interfaces","Acceso Datos","Sistemas Gestión Empresarial","Ingles","Empresa Iniciativa Emprendedora","Programación Dispositivos Moviles"};
       
        listaradio= new ArrayList<>();
        for (int i = 0; i < dias.length; i++) {
            JRadioButton bu=new JRadioButton(dias[i]);
            bu.setName(String.valueOf(i+1));
            listaradio.add(bu);
        }
        listaradio.forEach(x->{jPanelDía.add(x);
                                buttonGroup1.add(x);
                                }
                            );
        
        listacheck= new ArrayList<>();
        for (int i = 0; i < horas.length; i++) {
            JCheckBox ju =new JCheckBox(horas[i]);
            ju.setName(String.valueOf(i+1));
            listacheck.add(ju);
        }
        listacheck.forEach(x->jPanelHora.add(x));
        
        dom= new DefaultComboBoxModel();   
       // jComboBoxModulo.removeAllItems();
       jComboBoxModulo.setModel(dom);
        for(String s:modulos){
            dom.addElement(s);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelDía = new javax.swing.JPanel();
        jPanelHora = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAñadir = new javax.swing.JButton();
        jComboBoxModulo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelDía.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Día", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanelDía.setLayout(new java.awt.GridLayout(1, 0));

        jPanelHora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanelHora.setLayout(new java.awt.GridLayout(2, 3));

        jLabel1.setText("Módulo:");

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jComboBoxModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxModulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelDía, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addComponent(jPanelHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jButtonAñadir)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelDía, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jPanelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jComboBoxModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAñadir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        // TODO add your handling code here:
        String str="jb";
        StringBuilder sb= new StringBuilder();
        
        listaradio.forEach(x->{if(x.isSelected())sb.append(x.getName());});
      
        ArrayList<String> listaString= new ArrayList<>();
        int i=0;
        for(JCheckBox r:listacheck){
            if(r.isSelected()){
                listacheck.get(i);
                str+=r.getName()+sb.toString()+" jb";
            }
            i++;
        }
        String[]hor=str.split(" ");
        for(JButton but:jf.listabotones){
            for(String s:hor){
                 if(but.getName().toString().equalsIgnoreCase(s))
                    but.setText((String)jComboBoxModulo.getSelectedItem().toString());
                
            }
           
        }
    }//GEN-LAST:event_jButtonAñadirActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogAlta dialog = new JDialogAlta(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JComboBox<String> jComboBoxModulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelDía;
    private javax.swing.JPanel jPanelHora;
    // End of variables declaration//GEN-END:variables
}

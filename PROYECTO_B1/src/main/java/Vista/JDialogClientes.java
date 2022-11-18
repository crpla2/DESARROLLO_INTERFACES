/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class JDialogClientes extends javax.swing.JDialog {
    boolean dia;
    JFrameTaller jf;
    ArrayList<JLabel>listaEtiq;
    /**
     * Creates new form JDialogClientes
     */
    public JDialogClientes(java.awt.Frame parent, boolean modal) {
        super(parent,"CLIENTES", modal);
        jf=(JFrameTaller)parent;
        initComponents();
        dia=jf.dia;
        if(dia)jPanelFondo.setBackground(Color.lightGray);
        else jPanelFondo.setBackground(Color.darkGray);
        
        listaEtiq= new ArrayList<>();
        String[]etiquetas={"Primer Apellido:","Segundo apellido:","Nombre: ","Dirección:","DNI:","Teléfono:"};
        for (int i = 0; i < etiquetas.length; i++) {
            jPanelTF.add(new JLabel(etiquetas[i]));
            jPanelTF.add(new JTextField());
            
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanelTF = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanelFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 30));

        jPanelTF.setOpaque(false);
        jPanelTF.setLayout(new java.awt.GridLayout(3, 2, 3, 0));
        getContentPane().add(jPanelTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 610, 130));

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jButton1.setText("jButton1");
        jPanel1.add(jButton1);

        jButton2.setText("jButton2");
        jPanel1.add(jButton2);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 630, 100));

        jPanelFondo.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelTF;
    // End of variables declaration//GEN-END:variables
}
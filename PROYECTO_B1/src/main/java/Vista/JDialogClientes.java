/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import com.sun.org.apache.bcel.internal.classfile.ClassFormatException;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import logicaNegocio.Cliente;
import logicaNegocio.Taller;

/**
 *
 * @author carlo
 */
public class JDialogClientes extends javax.swing.JDialog {

    Taller taller;
    boolean dia;
    JFrameTaller jf;
    ArrayList<JLabel> listaEtiq;
    ArrayList<JTextField> listaTex;
    DefaultComboBoxModel dom;
    ImageIcon icono;
    Cliente clienteSeleccionado;

    /**
     * Creates new form JDialogClientes
     */
    public JDialogClientes(java.awt.Frame parent, boolean modal) {
        super(parent, "CLIENTES", modal);
        jf = (JFrameTaller) parent;
        initComponents();
        dia = jf.dia;
        clienteSeleccionado = null;
        taller = jf.taller;
        jLabelIcono1.setIcon(new ImageIcon("img/clientes.png"));
        jLabelBotonBorra.setIcon(new ImageIcon("img/borrar.png"));
        jLabelBotonNuevo.setIcon(new ImageIcon("img/añadir.png"));
        jLabelBotonActualiza.setIcon(new ImageIcon("img/actualizar.png"));
        //Añadir etiquetas y jlabels
        listaEtiq = new ArrayList<>();
        listaTex = new ArrayList<>();
        String[] etiquetas = {"Primer Apellido:", "Segundo apellido:", "Nombre: ", "Dirección:", "DNI:", "Teléfono:"};
        for (int i = 0; i < etiquetas.length; i++) {
            JLabel jl = new JLabel(etiquetas[i]);
            JTextField jt = new JTextField();

            listaEtiq.add(jl);
            listaTex.add(jt);
            jPanelTF.add(jl);
            jPanelTF.add(jt);
        }
        //modificar fuente etiquetas
        listaEtiq.forEach(x -> {
            x.setFont(new Font(Font.SERIF, Font.PLAIN, 18));
        });

        if (dia) {
            jPanelFondo.setBackground(Color.lightGray);
            listaEtiq.forEach(x -> x.setForeground(Color.black));
            jLabelTitulo.setForeground(Color.black);
        } else {
            jPanelFondo.setBackground(Color.darkGray);
            listaEtiq.forEach(x -> x.setForeground(Color.white));
            jLabelTitulo.setForeground(Color.white);
        }

        actualiza();
        //NO FUNCIONA!!!
        listaTex.get(listaTex.size() - 1).addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    actualiza();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelbotones = new javax.swing.JPanel();
        jLabelBotonNuevo = new javax.swing.JLabel();
        jLabelBotonActualiza = new javax.swing.JLabel();
        jLabelBotonBorra = new javax.swing.JLabel();
        jComboBoxClientes = new javax.swing.JComboBox<>();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelIcono1 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIcono2 = new javax.swing.JLabel();
        jPanelTF = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(204, 204, 204));

        jPanelbotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelbotones.setOpaque(false);
        jPanelbotones.setLayout(new java.awt.GridLayout(1, 2));

        jLabelBotonNuevo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelBotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonNuevoMouseClicked(evt);
            }
        });
        jPanelbotones.add(jLabelBotonNuevo);

        jLabelBotonActualiza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBotonActualiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonActualizaMouseClicked(evt);
            }
        });
        jPanelbotones.add(jLabelBotonActualiza);

        jLabelBotonBorra.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelBotonBorra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonBorraMouseClicked(evt);
            }
        });
        jPanelbotones.add(jLabelBotonBorra);

        jComboBoxClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClientesActionPerformed(evt);
            }
        });

        jPanelTitulo.setOpaque(false);
        jPanelTitulo.setLayout(new java.awt.GridLayout(1, 0));

        jLabelIcono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTitulo.add(jLabelIcono1);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Clientes");
        jPanelTitulo.add(jLabelTitulo);

        jLabelIcono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTitulo.add(jLabelIcono2);

        jPanelTF.setOpaque(false);
        jPanelTF.setLayout(new java.awt.GridLayout(3, 2, 3, 0));

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTF, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addComponent(jPanelbotones, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(165, Short.MAX_VALUE)))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanelTF, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                    .addContainerGap(303, Short.MAX_VALUE)
                    .addComponent(jPanelbotones, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBotonNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonNuevoMouseClicked
        inserta();

    }//GEN-LAST:event_jLabelBotonNuevoMouseClicked

    private void jLabelBotonActualizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonActualizaMouseClicked
        if (clienteSeleccionado != null) {
            taller.removeCliente(clienteSeleccionado.getDni());
            inserta();

          
        } else
            JOptionPane.showMessageDialog(null, "Ningun Cliente seleccionado", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabelBotonActualizaMouseClicked

    private void jLabelBotonBorraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonBorraMouseClicked

        if (clienteSeleccionado != null) {
            if (JOptionPane.showConfirmDialog(rootPane, "Eliminar Registro!, ¿desea continuar?",
                    "Eliminar Registro", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                taller.removeCliente(clienteSeleccionado.getDni());
            }
            actualiza();
            limpia();
           
        } else
            JOptionPane.showMessageDialog(null, "Ningun Cliente seleccionado", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jLabelBotonBorraMouseClicked

    private void jComboBoxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClientesActionPerformed
        /* String[] str = dom.getSelectedItem().toString().split(" ");
       for (Cliente c : taller.getListaCliente()) {
            if (c.getDni().equals(str[5])) {
                clienteSeleccionado = c;
                String[] apellidos = c.getApellidos().split(" ");
                listaTex.get(0).setText(apellidos[0]);
                listaTex.get(1).setText(apellidos[1]);
                listaTex.get(2).setText(c.getNombre());
                listaTex.get(3).setText(c.getDireccion());
                listaTex.get(4).setText(c.getDni());
                listaTex.get(5).setText(c.getTelefono());
            }
        }*/
        clienteSeleccionado = (Cliente) dom.getSelectedItem();
        String[] apellidos = clienteSeleccionado.getApellidos().split(" ");
        System.out.println(apellidos[0] + ", " + apellidos[1]);
        listaTex.get(0).setText(apellidos[0]);
        listaTex.get(1).setText(apellidos[1]);
        listaTex.get(2).setText(clienteSeleccionado.getNombre());
        listaTex.get(3).setText(clienteSeleccionado.getDireccion());
        listaTex.get(4).setText(clienteSeleccionado.getDni());
        listaTex.get(5).setText(clienteSeleccionado.getTelefono().substring(3));

    }//GEN-LAST:event_jComboBoxClientesActionPerformed
    private void actualiza() {
        dom = new DefaultComboBoxModel();
        dom.removeAllElements();
        /*
        for (Cliente c : taller.getListaCliente()) {
            dom.addElement(c.toString());
        }
         */
        dom.addAll(taller.getListaCliente());

        jComboBoxClientes.setModel(dom);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxClientes;
    private javax.swing.JLabel jLabelBotonActualiza;
    private javax.swing.JLabel jLabelBotonBorra;
    private javax.swing.JLabel jLabelBotonNuevo;
    private javax.swing.JLabel jLabelIcono1;
    private javax.swing.JLabel jLabelIcono2;
    private javax.swing.JLabel jLabelTitulo;
    protected javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelTF;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelbotones;
    // End of variables declaration//GEN-END:variables

    private void inserta() {
        try {

            if (!listaTex.get(0).getText().matches("[A-Z][a-zA-Z]*")) {
                throw new ClassCastException();
            }
            if (!listaTex.get(1).getText().matches("[A-Z][a-zA-Z]*")) {
                throw new ClassNotFoundException();
            }
            if (!listaTex.get(2).getText().matches("[A-Z][a-zA-Z]*")) {
                throw new NullPointerException();
            }
            if (!(listaTex.get(4).getText().toUpperCase()).matches("\\d{8}[A-HJ-NP-TV-Z]")) {
                throw new ArithmeticException();
            }
            if (!listaTex.get(5).getText().matches("^?[6789][0-9]{8}$")) {
                throw new IllegalCallerException();
            }
            for (JTextField c : listaTex) {
                if (c.getText().isEmpty()) {
                    throw new Exception();
                }
            }
            String s = listaTex.get(0).getText() + " " + listaTex.get(1).getText();
            taller.addCliente(s, listaTex.get(2).getText(), listaTex.get(3).getText(), listaTex.get(4).getText().toUpperCase(),listaTex.get(5).getText());
            actualiza();
            limpia();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "El segundo apellido no es correcto", "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (ClassCastException e) {
            JOptionPane.showMessageDialog(null, "El primer apellido no es correcto", "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El nombre no es correcto", "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (IllegalCallerException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "El Teléfono no es correcto", "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "El DNI no es correcto", "ERROR", JOptionPane.ERROR_MESSAGE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No ha rellenado todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpia() {
        for (JTextField j : listaTex) {
            j.setText("");
        }
    }

}

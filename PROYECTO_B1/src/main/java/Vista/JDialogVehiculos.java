/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logicaNegocio.Taller;
import logicaNegocio.Vehiculo;

/**
 *
 * @author carlo
 */
public class JDialogVehiculos extends javax.swing.JDialog {

    Taller taller;
    boolean dia;
    JFrameTaller jf;
    JDialogFORMvehiculo jdf;
    DefaultTableModel dtm;
    String cabecera[] = {"Matricula", "Marca", "Modelo", "Tipo", "En reparación"};
    TableRowSorter<TableModel> order;
    ArrayList<RowSorter.SortKey> keys;

    /**
     * Creates new form JDialogClientes
     */
    public JDialogVehiculos(java.awt.Frame parent, boolean modal) {
        super(parent, "VEHÍCULOS", modal);
        jf = (JFrameTaller) parent;
        initComponents();
        dia = jf.dia;
        taller = jf.taller;
        jLabelIcono1.setIcon(new ImageIcon("img/vehiculos.png"));
        jLabelBotonBorra.setIcon(new ImageIcon("img/borrar.png"));
        jLabelBotonNuevo.setIcon(new ImageIcon("img/añadir.png"));

        if (dia) {
            jPanelFondo.setBackground(Color.lightGray);
            jLabelTitulo.setForeground(Color.black);
        } else {
            jPanelFondo.setBackground(Color.darkGray);
            jLabelTitulo.setForeground(Color.white);
        }

        dtm = new DefaultTableModel(cabecera, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        order = new TableRowSorter<TableModel>(dtm);
        jTableTabla.setRowSorter(order);
        keys = new ArrayList<>();
        keys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        order.setSortKeys(keys);
        actualiza();

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
        jLabelBotonBorra = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelIcono1 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIcono2 = new javax.swing.JLabel();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(204, 204, 204));

        jPanelbotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelbotones.setOpaque(false);
        jPanelbotones.setLayout(new java.awt.GridLayout(1, 2));

        jLabelBotonNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonNuevoMouseClicked(evt);
            }
        });
        jPanelbotones.add(jLabelBotonNuevo);

        jLabelBotonBorra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBotonBorra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonBorraMouseClicked(evt);
            }
        });
        jPanelbotones.add(jLabelBotonBorra);

        jPanelTitulo.setOpaque(false);
        jPanelTitulo.setLayout(new java.awt.GridLayout(1, 0));

        jLabelIcono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTitulo.add(jLabelIcono1);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Vehículos");
        jPanelTitulo.add(jLabelTitulo);

        jLabelIcono2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTitulo.add(jLabelIcono2);

        jPanelTabla.setOpaque(false);

        jTableTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabla);

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
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
        jdf = new JDialogFORMvehiculo(this, true);
        jdf.setVisible(true);
    }//GEN-LAST:event_jLabelBotonNuevoMouseClicked

    private void jLabelBotonBorraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonBorraMouseClicked
        try {
            if (dtm.getRowCount() == 0) {
                throw new IllegalAccessException();
            }
            if (jTableTabla.getSelectedRow() < 0) {
                throw new Exception();
            }
            String matricula = dtm.getValueAt(jTableTabla.getSelectedRow(), 0).toString();
            taller.getListaVehiculo().remove(taller.getVehiculo(matricula));
            dtm.removeRow(jTableTabla.getSelectedRow());
        } catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Tabla vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jLabelBotonBorraMouseClicked

    private void jTableTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTablaMouseClicked
        if (evt.getClickCount() == 2) {
            String filtro= dtm.getValueAt(jTableTabla.getSelectedRow(), 2).toString();
            System.out.println(filtro);
            RowFilter <TableModel,Integer> rf = RowFilter.regexFilter(filtro, 3);
            order.setRowFilter(rf);
        }
    }//GEN-LAST:event_jTableTablaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBotonBorra;
    private javax.swing.JLabel jLabelBotonNuevo;
    private javax.swing.JLabel jLabelIcono1;
    private javax.swing.JLabel jLabelIcono2;
    private javax.swing.JLabel jLabelTitulo;
    protected javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelbotones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabla;
    // End of variables declaration//GEN-END:variables

    void anadeVehiculo(Vehiculo v) {
        String s;
        if (v.getEnReparacion()) {
            s = "SI";
        } else {
            s = "NO";
        }
        taller.addVehiculo(v.getMatricula(), v.getMarca(), v.getModelo(), v.getTipo(), v.getEnReparacion(), v.getClienteDni());
        actualiza();
    }

    private void actualiza() {
        String s;
        dtm.setRowCount(0);
        for (Vehiculo v : taller.getListaVehiculo()) {
            if (v.getEnReparacion()) {
                s = "SI";
            } else {
                s = "NO";
            }
            String[] campos = {v.getMatricula(), v.getMarca(), v.getModelo(), v.getTipo(), s};
            dtm.addRow(campos);
        }
        jTableTabla.setModel(dtm);

    }
}

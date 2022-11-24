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
import logicaNegocio.Acceso;
import logicaNegocio.ParteReparacion;
import logicaNegocio.Taller;
import logicaNegocio.Vehiculo;

/**
 *
 * @author carlo
 */
public class JDialogReparaciones extends javax.swing.JDialog {

    Acceso acceso;
    int codigo;
    Taller taller;
    boolean dia;
    String filtro = "NO";
    JFrameTaller jf;
    ArrayList<ParteReparacion> listaparte;
    JDialogFORMreparacionNuevo jdf;
    JDialogFORMreparacionActualizar jdfa;
    JDialogImprimir jdi;
    DefaultTableModel dtm;
    String cabecera[] = {"Código", "Mecanico", "Cliente", "Vehículo", "Fecha entrada", "En reparación", "Fecha salida", "Horas estimadas", "Horas reales", "Avería", "Precio"};
    TableRowSorter<TableModel> order;
    ArrayList<RowSorter.SortKey> keys;

    /**
     * Creates new form JDialogClientes
     */
    public JDialogReparaciones(java.awt.Frame parent, boolean modal) {
        super(parent, "REPARACIONES", modal);
        jf = (JFrameTaller) parent;
        initComponents();
        this.dia = jf.dia;
        this.taller = jf.taller;
        this.acceso = jf.acceso;

        listaparte = taller.getTodosParte();
        jLabelIcono1.setIcon(new ImageIcon("img/reparaciones.png"));
        jLabelBotonActualizar.setIcon(new ImageIcon("img/actualizar.png"));
        jLabelBotonNuevo.setIcon(new ImageIcon("img/añadir.png"));
        jLabelFactura.setIcon(new ImageIcon("img/factura.png"));

        if (acceso.getUsuarioIdentificado().getRol() == 2) {
            jPanelFiltros.setVisible(false);
            
           
        }
        if (acceso.getUsuarioIdentificado().getRol() == 1) {
            jPanelbotones.setVisible(false);

        }

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
        String s = "";
        if (acceso.getUsuarioIdentificado().getMecanico() == 1) {
            s = "1";
        }
        if (acceso.getUsuarioIdentificado().getMecanico() == 2) {
            s = "2";
        }
        actualiza(listaparte);
        RowFilter<TableModel, Integer> rf = RowFilter.regexFilter(s, 1);
        order.setRowFilter(rf);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPartes = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelFondo = new javax.swing.JPanel();
        jPanelbotones = new javax.swing.JPanel();
        jLabelBotonActualizar = new javax.swing.JLabel();
        jLabelBotonNuevo = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelIcono1 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelIcono2 = new javax.swing.JLabel();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabla = new javax.swing.JTable();
        jPanelFiltros = new javax.swing.JPanel();
        jLabelFactura = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonPendientes = new javax.swing.JRadioButton();
        jRadioButtonTerminados = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonDni = new javax.swing.JRadioButton();
        jRadioButtonMatricula = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(204, 204, 204));

        jPanelbotones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelbotones.setOpaque(false);
        jPanelbotones.setLayout(new java.awt.GridLayout(1, 2));

        jLabelBotonActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBotonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonActualizarMouseClicked(evt);
            }
        });
        jPanelbotones.add(jLabelBotonActualizar);

        jLabelBotonNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotonNuevoMouseClicked(evt);
            }
        });
        jPanelbotones.add(jLabelBotonNuevo);

        jPanelTitulo.setOpaque(false);
        jPanelTitulo.setLayout(new java.awt.GridLayout(1, 0));

        jLabelIcono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelTitulo.add(jLabelIcono1);

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Reparaciones");
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

        jLabelFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFacturaMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("PARTES:"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroupPartes.add(jRadioButtonPendientes);
        jRadioButtonPendientes.setText("Pendientes");
        jRadioButtonPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPendientesActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonPendientes);

        buttonGroupPartes.add(jRadioButtonTerminados);
        jRadioButtonTerminados.setText("Terminados");
        jRadioButtonTerminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTerminadosActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonTerminados);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Elige y haz doble click en la tabla:"));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(jRadioButtonDni);
        jRadioButtonDni.setText("DNI");
        jRadioButtonDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDniActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonDni);

        buttonGroup1.add(jRadioButtonMatricula);
        jRadioButtonMatricula.setText("Matricula");
        jRadioButtonMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMatriculaActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButtonMatricula);

        jButton1.setText("TODOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltrosLayout = new javax.swing.GroupLayout(jPanelFiltros);
        jPanelFiltros.setLayout(jPanelFiltrosLayout);
        jPanelFiltrosLayout.setHorizontalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(165, 165, 165)
                .addComponent(jLabelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
        jPanelFiltrosLayout.setVerticalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE)))
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 1217, Short.MAX_VALUE)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jPanelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                    .addContainerGap(458, Short.MAX_VALUE)
                    .addComponent(jPanelbotones, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanelFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                    .addContainerGap(430, Short.MAX_VALUE)
                    .addComponent(jPanelbotones, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
        jdf = new JDialogFORMreparacionNuevo(this, true);
        jdf.setVisible(true);
    }//GEN-LAST:event_jLabelBotonNuevoMouseClicked

    private void jLabelBotonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotonActualizarMouseClicked

        int seleccionada = jTableTabla.getSelectedRow();
        System.out.println(seleccionada);
        try {
            if (dtm.getRowCount() == 0) {
                throw new IllegalAccessException();
            }
            if (seleccionada < 0) {
                throw new Exception();
            }
            codigo = Integer.parseInt(dtm.getValueAt(jTableTabla.getSelectedRow(), 0).toString());
            System.out.println(codigo);
            jdfa = new JDialogFORMreparacionActualizar(this, true);
            jdfa.setVisible(true);
        } catch (IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, "Tabla vacia", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Ninguna fila seleccionada", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabelBotonActualizarMouseClicked

    private void jRadioButtonPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPendientesActionPerformed
        listaparte = taller.getListadoPartePendientes();
        actualiza(listaparte);
    }//GEN-LAST:event_jRadioButtonPendientesActionPerformed

    private void jRadioButtonTerminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTerminadosActionPerformed
        listaparte = taller.getListadoParteTerminados();
        actualiza(listaparte);
    }//GEN-LAST:event_jRadioButtonTerminadosActionPerformed

    private void jTableTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTablaMouseClicked
        if (evt.getClickCount() == 2) {
            String s = "";
            System.out.println(filtro);
            if (filtro.equals("dni")) {
                s = dtm.getValueAt(jTableTabla.getSelectedRow(), 2).toString();
                RowFilter<TableModel, Integer> rf = RowFilter.regexFilter(s, 2);
                order.setRowFilter(rf);
            }
            if (filtro.equals("matricula")) {
                s = dtm.getValueAt(jTableTabla.getSelectedRow(), 3).toString();
                RowFilter<TableModel, Integer> rf = RowFilter.regexFilter(s, 3);
                order.setRowFilter(rf);
            }

        }
    }//GEN-LAST:event_jTableTablaMouseClicked

    private void jRadioButtonDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDniActionPerformed
        filtro = "dni";
    }//GEN-LAST:event_jRadioButtonDniActionPerformed

    private void jRadioButtonMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMatriculaActionPerformed
        filtro = "matricula";
    }//GEN-LAST:event_jRadioButtonMatriculaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listaparte = taller.getTodosParte();
        actualiza(listaparte);
        RowFilter<TableModel, Integer> rf = RowFilter.regexFilter("", 1);
        order.setRowFilter(rf);
        jRadioButtonMatricula.setSelected(false);
        jRadioButtonTerminados.setSelected(false);
        jRadioButtonPendientes.setSelected(false);
        jRadioButtonDni.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFacturaMouseClicked
         jdi = new JDialogImprimir(this, true);
        jdi.setVisible(true);
    }//GEN-LAST:event_jLabelFacturaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroupPartes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelBotonActualizar;
    private javax.swing.JLabel jLabelBotonNuevo;
    private javax.swing.JLabel jLabelFactura;
    private javax.swing.JLabel jLabelIcono1;
    private javax.swing.JLabel jLabelIcono2;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFiltros;
    protected javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelbotones;
    private javax.swing.JRadioButton jRadioButtonDni;
    private javax.swing.JRadioButton jRadioButtonMatricula;
    private javax.swing.JRadioButton jRadioButtonPendientes;
    private javax.swing.JRadioButton jRadioButtonTerminados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabla;
    // End of variables declaration//GEN-END:variables

    public void actualiza(ArrayList<ParteReparacion> listaparte) {

        String s, f, hr;

        dtm.setRowCount(0);

        for (ParteReparacion p : listaparte) {
            if (p.getEstadoReparacion()) {
                s = "NO";
            } else {
                s = "SI";
            }
            if (jf.getStringFormat(p.getFechaSalida()).equals("03/03/0003")) {
                f = "  - - - - - -";
            } else {
                f = jf.getStringFormat(p.getFechaSalida());
            }
            if (p.getHorasReales() == 0) {
                hr = "  - - - - - -";
            } else {
                hr = String.valueOf(p.getHorasReales());
            }

            String[] campos = {String.valueOf(p.getCodigo()), String.valueOf(p.getMecanico()), p.getDniCliente(), p.getMatriculaVehiculo(), jf.getStringFormat(p.getFechaEntrada()),
                s, f, String.valueOf(p.getHorasEstimadas()), hr,
                p.getTipoAveria(), String.valueOf(p.getCuantiaReparacion())};
            dtm.addRow(campos);
        }
        jTableTabla.setModel(dtm);

    }
}

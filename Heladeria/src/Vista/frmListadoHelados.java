/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Entidades.Helado;
import Entidades.miExcepcion;
import img.ImagenesTabla;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumno
 */
public class frmListadoHelados extends javax.swing.JInternalFrame {

    private static int cantidad;

    /**
     * Creates new form frmListadoHelados
     */
    public frmListadoHelados() throws Exception {
        initComponents();
        if (cantidad == 1) {
            throw new Exception();
        }
        cantidad = 1;
        //llamamos al metodo llenar helados para que apenas inicie se llene
        try {
            this.llenarTablaHelados();

        } catch (Exception error) {
            System.out.println("error el llenar tabla");
            throw error;

        }
        txtNombreModificar.setEnabled(false);
        btnModificar.setEnabled(false);
        lblNombreModificar.setEnabled(false);
    }

    public static boolean PuedoCrearOtra() {

        boolean retorno = false;
        if (cantidad == 0) {
            retorno = true;
        }

        return retorno;
    }

    public void llenarTabla() {

        tbListarHelados.setDefaultRenderer(Object.class, new ImagenesTabla());
        DefaultTableModel modelo = new DefaultTableModel();
        tbListarHelados.setModel(modelo);
        tbListarHelados.setRowHeight(50);
        modelo.addColumn("IdHelado");
        modelo.addColumn("Sabor");
        modelo.addColumn("Image");

        ArrayList<Helado> lista = Helado.ListarHelados();
        Iterator iter = lista.iterator();
        Object[] columnas = new Object[3];

        try {
            while (iter.hasNext()) {
                Helado h = (Helado) iter.next();
                columnas[0] = h.getId();
                columnas[1] = h.getSabor();

                System.out.println(h.getRuta());
                JLabel lb = new JLabel(new ImageIcon(getClass().getResource(h.getRuta())));

                columnas[2] = lb;

                modelo.addRow(columnas);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void llenarTablaHelados() {
        tbListarHelados.setDefaultRenderer(Object.class, new ImagenesTabla());
        DefaultTableModel modelo = new DefaultTableModel();
        tbListarHelados.setModel(modelo);
        tbListarHelados.setRowHeight(50);
        modelo.addColumn("IdHelado");
        modelo.addColumn("Sabor");
        modelo.addColumn("Image");

        ArrayList<Helado> lista = Helado.ListarHelados();
        Iterator iter = lista.iterator();
        Object[] columnas = new Object[3];

        try {
            while (iter.hasNext()) {
                Helado h = (Helado) iter.next();
                columnas[0] = h.getId();
                columnas[1] = h.getSabor();

                System.out.println(h.getRuta());
                JLabel lb = new JLabel(new ImageIcon(getClass().getResource(h.getRuta())));

                columnas[2] = lb;

                modelo.addRow(columnas);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
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

        pmContextual = new javax.swing.JPopupMenu();
        miModificar = new javax.swing.JMenuItem();
        miEliminar = new javax.swing.JMenuItem();
        lblListadoHelados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListarHelados = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblNombreModificar = new javax.swing.JLabel();
        txtNombreModificar = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        miModificar.setText("Modificar");
        miModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarActionPerformed(evt);
            }
        });
        pmContextual.add(miModificar);

        miEliminar.setText("Eliminar");
        miEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miEliminarMouseClicked(evt);
            }
        });
        miEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarActionPerformed(evt);
            }
        });
        pmContextual.add(miEliminar);

        setTitle("Listado de helados");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblListadoHelados.setText("Listado Helados");

        tbListarHelados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbListarHelados.setComponentPopupMenu(pmContextual);
        tbListarHelados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbListarHelados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListarHeladosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbListarHeladosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbListarHelados);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre:");

        lblNombreModificar.setText("Nombre:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombreModificar)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreModificar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar)
                            .addComponent(btnModificar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblListadoHelados)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblListadoHelados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(lblNombre))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreModificar)
                    .addComponent(txtNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.cantidad = 0;
        this.hide();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.cantidad = 0;
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            this.llenarTablaHelados();

        } catch (Exception error) {
            System.out.println("error el llenar tabla");
            throw error;

        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        for (int i = 0; i < tbListarHelados.getRowCount(); i++) {

            String nombre = String.valueOf(tbListarHelados.getValueAt(i, 1));
            if (nombre.equalsIgnoreCase(txtBuscar.getText())) {
                tbListarHelados.changeSelection(i, 1, false, false);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void miModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarActionPerformed
        try {
            txtNombreModificar.setEnabled(true);
            btnModificar.setEnabled(true);
            lblNombreModificar.setEnabled(true);

            for (int i = 0; i < tbListarHelados.getRowCount(); i++) {
                String nombre = String.valueOf(tbListarHelados.getValueAt(i, 1));
                String id = String.valueOf(tbListarHelados.getValueAt(i, 0));
                int fila = tbListarHelados.getSelectedRow();

                txtNombreModificar.setText(String.valueOf(tbListarHelados.getValueAt(fila, 1)));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, primero seleccione la fila con el click izquierdo y luego presione click derecho, modificar o eleiminar gracias!");
        }


    }//GEN-LAST:event_miModificarActionPerformed

    private void tbListarHeladosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListarHeladosMouseClicked

    }//GEN-LAST:event_tbListarHeladosMouseClicked


    private void tbListarHeladosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListarHeladosMouseReleased

    }//GEN-LAST:event_tbListarHeladosMouseReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila = tbListarHelados.getSelectedRow();

        Helado h = new Helado();
        h.setSabor(txtNombreModificar.getText());
        h.setId(Integer.parseInt(String.valueOf(tbListarHelados.getValueAt(fila, 0))));
        try {
            Helado.modificarHelado(h);
            JOptionPane.showMessageDialog(null, "Helado modificado con exito!");
            txtNombreModificar.setText("");
            txtNombreModificar.setEnabled(false);
            btnModificar.setEnabled(false);
            lblNombreModificar.setEnabled(false);
            llenarTablaHelados();

        } catch (Exception e) {
            System.out.println("Error al modificar");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void miEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miEliminarMouseClicked
        
    }//GEN-LAST:event_miEliminarMouseClicked

    private void miEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarActionPerformed
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog(null, "Relamente quiere eliminar el helado: "+String.valueOf(tbListarHelados.getValueAt(tbListarHelados.getSelectedRow(), 1))+" ?", "Eliminar helado",dialogBtn);
        if (dialogBtn == JOptionPane.YES_OPTION) {
             int fila = tbListarHelados.getSelectedRow();
             
             Helado helado = new Helado();
             helado.setId(Integer.parseInt(String.valueOf(tbListarHelados.getValueAt(fila, 0))));
             
             Helado.eliminarHelado(helado);
             JOptionPane.showMessageDialog(null, "Helado eliminado");
             this.llenarTablaHelados();
        }
      
    }//GEN-LAST:event_miEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListadoHelados;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreModificar;
    private javax.swing.JMenuItem miEliminar;
    private javax.swing.JMenuItem miModificar;
    private javax.swing.JPopupMenu pmContextual;
    private javax.swing.JTable tbListarHelados;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombreModificar;
    // End of variables declaration//GEN-END:variables
}

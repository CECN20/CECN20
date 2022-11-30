/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Conexion.ConexionSuper.getConnection;
import Modelo.Empleados;
import Controlador.RegistroBD;
import Controlador.Validadores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static oracle.sql.NUMBER.e;

/**
 *
 * @author Carlos Eduardo
 */
public class RegistroEmpleado extends javax.swing.JFrame {
    
    protected Empleados empleados;
    PreparedStatement ps;
    ResultSet rs;

    public RegistroEmpleado() {
        initComponents();
        empleados = new Empleados();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cboxOpciones = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblvalidacion = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        cboxTipoEmple = new javax.swing.JComboBox<>();
        lblTiposEmpleado = new javax.swing.JLabel();
        lblTelefonos = new javax.swing.JLabel();
        checkContradoIndef = new javax.swing.JCheckBox();
        txtRut = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtTelefonos = new javax.swing.JTextField();
        bntGuardar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatosEmple = new javax.swing.JTable();
        btLis = new javax.swing.JButton();
        btnLBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        bntLimpiar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        cboxOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxOpcionesActionPerformed(evt);
            }
        });

        jLabel1.setText("lblValidacionRut");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblvalidacion.setText("lblValidacion");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRut.setText("Rut:");

        lblNombres.setText("Nombres:");

        lblApellidoPaterno.setText("Apellido Paterno:");

        lblApellidoMaterno.setText("Apellido Materno:");

        lblRegistro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRegistro.setText("Registro y busqueda de Empleados ");

        cboxTipoEmple.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Jefe TI", "Programador", "Cajera", "Supervisor" }));
        cboxTipoEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoEmpleActionPerformed(evt);
            }
        });

        lblTiposEmpleado.setText("Tipo De Empleado:");

        lblTelefonos.setText("Telefono:");

        checkContradoIndef.setText("Contrado Indefinido");
        checkContradoIndef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkContradoIndefActionPerformed(evt);
            }
        });

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        bntGuardar.setText("Guardar");
        bntGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarActionPerformed(evt);
            }
        });

        tblDatosEmple.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tblDatosEmple.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(tblDatosEmple);
        tblDatosEmple.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btLis.setText("Lista");
        btLis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLisActionPerformed(evt);
            }
        });

        btnLBuscar.setText("Buscar");
        btnLBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        bntLimpiar.setText("Limpiar");
        bntLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimpiarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(checkContradoIndef)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblApellidoMaterno)
                                        .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblRut, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblApellidoPaterno))
                                    .addGap(68, 68, 68))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTiposEmpleado)
                                        .addComponent(lblTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(63, 63, 63)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cboxTipoEmple, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(71, 71, 71)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnLBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bntLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(74, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(lblRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(bntGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btLis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRegistro)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntLimpiar))
                    .addComponent(lblNombres))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoPaterno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoMaterno))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxTipoEmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiposEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonos))
                .addGap(19, 19, 19)
                .addComponent(checkContradoIndef)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btLis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkContradoIndefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkContradoIndefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkContradoIndefActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void bntGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarActionPerformed
        Connection con = null;
        try {
            int i = 1;
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO SUPERNUMEROUNO(rut, nombres, apellido_paterno, apellido_materno,"
                    + " tipo_empleado,telefono) VALUES(?,?,?,?,?,?)");
            

            empleados.setRut(txtRut.getText());
          
        
        
        
            ps.setString(i++, txtRut.getText());
            ps.setString(i++, txtNombres.getText());
            ps.setString(i++, txtApellidoPaterno.getText());
            ps.setString(i++, txtApellidoMaterno.getText());
            ps.setString(i++, cboxTipoEmple.getSelectedItem().toString());
            ps.setString(i++, txtTelefonos.getText());
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Guardada");
                borrar();
            } else {
                JOptionPane.showMessageDialog(null, "Error");
                borrar();
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }        
        
    }//GEN-LAST:event_bntGuardarActionPerformed

    private void cboxTipoEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoEmpleActionPerformed

    }//GEN-LAST:event_cboxTipoEmpleActionPerformed

    private void cboxOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxOpcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxOpcionesActionPerformed

    private void btnLBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLBuscarActionPerformed
        
      

    }//GEN-LAST:event_btnLBuscarActionPerformed

    private void btLisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLisActionPerformed
        RegistroBD bda = new RegistroBD();
        
        if ("".equals(txtRut.getText())) {
            List<Empleados> listaEmple = bda.listar();
            System.out.println("CANTIDAD DE PERSONAS -> " + listaEmple.size());
            
            tblDatosEmple.setModel(new DefaultTableModel(
                    new String[]{"rut", "nombres", "apellido_paterno", "apellido_materno", "tipo_empleado", "telefono",}, listaEmple.size()
            ));
            
            for (int i = 0; i < listaEmple.size(); i++) {
                
                tblDatosEmple.setValueAt(listaEmple.get(i).getRut(), i, 0);
                tblDatosEmple.setValueAt(listaEmple.get(i).getNombres(), i, 1);
                tblDatosEmple.setValueAt(listaEmple.get(i).getApellido_paterno(), i, 2);
                tblDatosEmple.setValueAt(listaEmple.get(i).getApellido_materno(), i, 3);
                tblDatosEmple.setValueAt(listaEmple.get(i).getTipo_empleado(), i, 4);
                tblDatosEmple.setValueAt(listaEmple.get(i).getTelefono(), i, 5);
            }
        } else {
            Empleados empleados = bda.BusquedaRut(txtRut.getText());
            
            tblDatosEmple.setModel(new DefaultTableModel(
                    new String[]{"rut", "nombres", "apellido_paterno", "apellido_materno", "tipo_empleado", "telefono",},
                     4
            ));
            
            if (empleados != null) {
                tblDatosEmple.setValueAt(empleados.getRut(), 0, 0);
                tblDatosEmple.setValueAt(empleados.getNombres(), 0, 1);
                tblDatosEmple.setValueAt(empleados.getApellido_paterno(), 0, 2);
                tblDatosEmple.setValueAt(empleados.getApellido_materno(), 0, 3);
                tblDatosEmple.setValueAt(empleados.getTipo_empleado(), 0, 4);
                tblDatosEmple.setValueAt(empleados.getTelefono(), 0, 5);
                
            }
            System.out.println("No Registrado");
        }

    }//GEN-LAST:event_btLisActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String rut = txtRut.getText();
        RegistroBD bda = new RegistroBD();
        boolean resultado = bda.eliminar(rut);
        System.out.println("borrar -> " + resultado);
        
        if (resultado) {
            
            JOptionPane.showMessageDialog(rootPane, "Eliminado");
            borrar();
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Usuario no se elimino");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void bntLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimpiarActionPerformed
        txtRut.setText("");
        txtNombres.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtTelefonos.setText("");
    }//GEN-LAST:event_bntLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Connection con = null;
        try {
            con = getConnection();
            int i = 1;
            ps = con.prepareStatement("UPDATE SUPERMERCADOUNO SET nombres=?, "
                    + "apellido_paterno=?, apellido_materno=?,"
                    + " tipo_empleado=?,telefono=? where rut = ?");
            ps.setString(i++, txtNombres.getText());
            ps.setString(i++, txtApellidoPaterno.getText());
            ps.setString(i++, txtApellidoMaterno.getText());
            ps.setString(i++, cboxTipoEmple.getSelectedItem().toString());
            ps.setString(i++, txtTelefonos.getText());
            ps.setString(i++, txtRut.getText());
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Guardado");
                borrar();
            } else {
                JOptionPane.showMessageDialog(null, "Error");
                borrar();
            }
            
        } catch (Exception e) {
            System.err.print(e);
        }
        

    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistroEmpleado().setVisible(true);
            }
        });
    }
    
    public void borrar() {
        txtRut.setText("");
        txtNombres.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtTelefonos.setText("");
        cboxTipoEmple.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardar;
    private javax.swing.JButton bntLimpiar;
    public javax.swing.JButton btLis;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnLBuscar;
    public javax.swing.JComboBox<String> cboxOpciones;
    public javax.swing.JComboBox<String> cboxTipoEmple;
    private javax.swing.JCheckBox checkContradoIndef;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTelefonos;
    private javax.swing.JLabel lblTiposEmpleado;
    private javax.swing.JLabel lblvalidacion;
    public javax.swing.JTable tblDatosEmple;
    public javax.swing.JTextField txtApellidoMaterno;
    public javax.swing.JTextField txtApellidoPaterno;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtRut;
    public javax.swing.JTextField txtTelefonos;
    // End of variables declaration//GEN-END:variables

     private javax.swing.JLabel lblRutValidador;
    
}

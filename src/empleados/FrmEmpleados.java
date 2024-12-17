package empleados;

import generic.Gestor;
import generic.NodoD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemarestaurante.Main_Interface;

/**
 *
 * @author Elva
 */
public class FrmEmpleados extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    ListaEmpleado LSE = new ListaEmpleado<Empleado>();
    Gestor gestor = new Gestor();
    NodoD<Empleado> actual;
    String FileName = "empleados.bin";
    
    public FrmEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
        modelo = (DefaultTableModel) tblLista.getModel();
        gestor.AbrirArchivoE(FileName, LSE);
        llenarTabla(LSE);
    }
    
    public void llenarTabla(ListaEmpleado lista)
    {
        modelo.setRowCount(0);
            this.LSE = lista;
            NodoD<Empleado> puntero = lista.getPrimero();
            while(puntero != null)
            {
                modelo.addRow(puntero.getInfo().getRegistro());
                puntero = puntero.getSgte();
            }
    }
    
    public void vaciarCajas (){
        txtDNI.setText(null);
        txtNombre.setText(null);
        cbxPuesto.setSelectedItem(cbxPuesto.getItemAt(0));
        txtSueldo.setText(null);
        cboHorario.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cboHorario = new javax.swing.JComboBox<>();
        txtDNI = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRestaurar = new javax.swing.JButton();
        cbxPuesto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLEADOS");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        cboHorario.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cboHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione un Horario--", "Part Time", "Full Time" }));
        cboHorario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HORARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtDNI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtSueldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SUELDO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnInsertar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertar.setText("AGREGAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Puesto", "Nombre", "DNI", "Horario", "Sueldo (S/.)"
            }
        ));
        jScrollPane1.setViewportView(tblLista);

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRestaurar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRestaurar.setText("RESTAURAR");
        btnRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurarActionPerformed(evt);
            }
        });

        cbxPuesto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        cbxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione un puesto--", "Administrador", "Contador", "Cocinero", "Ayudante de cocina", "Mozo", " " }));
        cbxPuesto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PUESTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnOrdenar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnRestaurar))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertar)
                        .addGap(26, 26, 26)
                        .addComponent(btnConsultar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrdenar)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRestaurar)))))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        Main_Interface f = new Main_Interface();
        f.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        LSE.ordenar();
        llenarTabla(LSE);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        int dni = Integer.parseInt(txtDNI.getText().trim());
        String nombre = txtNombre.getText().trim();
        String puesto = cbxPuesto.getSelectedItem().toString();
        double sueldo = Double.parseDouble(txtSueldo.getText().trim());
        String horario = (String) cboHorario.getSelectedItem();
        LSE.agregar(new Empleado(new Object[] {puesto, nombre, dni, horario, sueldo}));
        actual = LSE.getPrimero();
        
        vaciarCajas();
        txtDNI.requestFocus();
        
        gestor.GrabarArchivoE(FileName, LSE); 
        llenarTabla(LSE);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        if (btnConsultar.isEnabled()) {
            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nro de DNI: "));
            NodoD<Empleado> p = LSE.buscar(x);
            actual = p;
            if (p != null) {
                txtDNI.setText(String.valueOf(p.getInfo().getDni()));
                txtNombre.setText(String.valueOf(p.getInfo().getNombre()));
                cbxPuesto.setSelectedItem(String.valueOf(p.getInfo().getPuesto()));
                cboHorario.setSelectedItem(p.getInfo().getHorario());
                txtSueldo.setText(String.valueOf(p.getInfo().getSueldo()));
                btnEliminar.setEnabled(true);
                btnActualizar.setEnabled(true);
                btnConsultar.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "El empleado NO se encuentra en la lista", "ERROR", 0);
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String puesto = cbxPuesto.getSelectedItem().toString();
        String nombre = txtNombre.getText();
        int dni = Integer.parseInt(txtDNI.getText());
        String horario = cboHorario.getSelectedItem().toString();
        double sueldo =Double.parseDouble(txtSueldo.getText()) ;
        actual.getInfo().setRegistro(new Object[] {puesto, nombre, dni, horario, sueldo});
        llenarTabla(LSE);
        gestor.GrabarArchivoE(FileName, LSE);
        vaciarCajas();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (btnEliminar.isEnabled()) {
            int x = Integer.parseInt(txtDNI.getText().trim());
            boolean exito = LSE.eliminarPorDNI(x);
            if (exito) {
                JOptionPane.showMessageDialog(null, "El empleado se eliminó correctamente", "ELIMINACIÓN EXITOSA", 1);
                llenarTabla(LSE);
                btnConsultar.setEnabled(true);
                btnEliminar.setEnabled(false);
                btnActualizar.setEnabled(false);
                vaciarCajas();
            } else {
                JOptionPane.showMessageDialog(null, "El empleado NO se encuentra en la lista", "ERROR", 0);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurarActionPerformed
        if (!btnConsultar.isEnabled()) {
            btnConsultar.setEnabled(true);
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
        }
        vaciarCajas();
    }//GEN-LAST:event_btnRestaurarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRestaurar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboHorario;
    private javax.swing.JComboBox<String> cbxPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}

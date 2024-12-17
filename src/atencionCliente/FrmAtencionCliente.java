package atencionCliente;

import generic.Gestor;
import generadorComprobante.FrmPaymentProof;
import generadorComprobante.FrmReport;
import generic.Nodo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemarestaurante.Main_Interface;

public class FrmAtencionCliente extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    ListaCustomer lista = new ListaCustomer();
    ListaCustomer listaAtentidos = new ListaCustomer(); 
    Gestor gestor = new Gestor();
    Nodo<Customer> actual;
    String FileName = "customer.bin";
    String FileAtentidos = "atentidos.bin";
    double montoTotal;
    
    
    public FrmAtencionCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = (DefaultTableModel) jTable.getModel();
        gestor.ArbrirArchivo(FileName, lista);
        gestor.ArbrirArchivo(FileAtentidos, listaAtentidos);
        llenarTabla(lista);
        deshabilitar();
    }
    
    public void obtenerMonto (double monto){
        montoTotal = monto;
        txtCuentaTotal.setText(String.valueOf(monto));
    }
    
    public void cargarDatos(Nodo<Customer> Auxiliar)
    {
        if(Auxiliar != null)
        {
            txtNombres.setText(Auxiliar.getInfo().getNombre());
            txtDocumentos.setText(String.valueOf(Auxiliar.getInfo().getDocumento()));
            txtCuentaTotal.setText(String.valueOf(Auxiliar.getInfo().getCuentaFinal()));
            cbxMetodo.setSelectedItem(Auxiliar.getInfo().getMetodoPago());
            actual = Auxiliar;
        }
    }
    
    public void llenarTabla(ListaCustomer lista)
    {
        modelo.setRowCount(0);
            this.lista = lista;
            Nodo<Customer> puntero = lista.getPrimero();
            while(puntero != null)
            {
                modelo.addRow(puntero.getInfo().getRegistro());
                puntero = puntero.getSgte();
            }
    }
    
    public void habilitar(){
        txtDocumentos.setEnabled(false);
        btnConsultar.setEnabled(false);
        btnAgregar.setEnabled(false);
        
        btnEliminar.setEnabled(true);
        btnActualizar.setEnabled(true);
    }
    
    public void deshabilitar(){
        txtDocumentos.setEnabled(true);
        btnConsultar.setEnabled(true);
        btnAgregar.setEnabled(true);
        
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
    }
    
    public void limpiarCajas(){
        txtNombres.setText(null);
        txtDocumentos.setText(null);
        txtCuentaTotal.setText(null);
        txtNombres.requestFocus();
        cbxMetodo.setSelectedItem(cbxMetodo.getItemAt(0));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombres = new javax.swing.JTextField();
        txtDocumentos = new javax.swing.JTextField();
        txtCuentaTotal = new javax.swing.JTextField();
        cbxMetodo = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        btnAtender = new javax.swing.JButton();
        btnEliminar2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnReporte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documento:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtCuentaTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuenta total:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        cbxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Efectivo", "Tarjeta", "Yape", "Plin" }));
        cbxMetodo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Metodo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombres", "Documento", "Cuenta Total", "Metodo de pago"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        btnAtender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtender.setText("Atender");
        btnAtender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtenderActionPerformed(evt);
            }
        });

        btnEliminar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar2.setText("Eliminar Selecionado");
        btnEliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar2ActionPerformed(evt);
            }
        });

        btnReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReporte.setText("Reporte de ventas");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Registrar Cliente");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(btnAtender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnReporte)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)
                                    .addComponent(txtDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtCuentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cbxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCuentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumentos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtender)
                    .addComponent(btnEliminar2)
                    .addComponent(btnReporte))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre = txtNombres.getText();
        int documento= Integer.parseInt(txtDocumentos.getText());
        double cuentaF =Double.parseDouble(txtCuentaTotal.getText()) ;
        String metodo = cbxMetodo.getSelectedItem().toString();
        if(lista.BuscarCodigo((documento))==null)
        {
            lista.encolar(new Customer(new Object[] {nombre, documento, metodo, cuentaF}));
            actual = lista.getPrimero();
            limpiarCajas();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Codigo ya existe");
        }
        gestor.GrabarArchivo(FileName, lista); 
        llenarTabla(lista);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int documento = Integer.parseInt(txtDocumentos.getText());
        Nodo auxiliar = lista.BuscarCodigo(documento);
        lista.eliminar(auxiliar);
        this.llenarTabla(lista);
        limpiarCajas();
        deshabilitar();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nro de Documento(DNI/RUC): "));
        Nodo auxiliar = lista.BuscarCodigo(documento);
        if(auxiliar != null)
        {
            cargarDatos(auxiliar);
        }
        else{
            JOptionPane.showMessageDialog(null,"El cliente no esta en cola de pago.");
        }

        habilitar();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String documento = txtDocumentos.getText();
        String nombre = txtNombres.getText();
        String metodo = cbxMetodo.getSelectedItem().toString();
        double cuentaF =Double.parseDouble(txtCuentaTotal.getText()) ;
        actual.getInfo().setRegistro(new Object[] { nombre, documento, metodo, cuentaF});
        llenarTabla(lista);
        gestor.GrabarArchivo(FileName, lista);
        limpiarCajas();
        deshabilitar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar2ActionPerformed
        int fila = jTable.getSelectedRow();
        if(fila != -1)
        {
            int rpta = JOptionPane.showConfirmDialog(this,"¿Desea eliminar el registro?","Proceso de eliminar",JOptionPane.YES_NO_OPTION);
            if(rpta == JOptionPane.YES_OPTION)
            {
                int codigo = Integer.parseInt(jTable.getValueAt(fila, 1).toString());
                Nodo auxiliar = lista.BuscarCodigo(codigo);
                if(auxiliar != null)
                {
                    lista.eliminar(auxiliar);
                    this.llenarTabla(lista);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Codigo no existe");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Seleccione un registro de la tabla");
        }
        gestor.GrabarArchivo(FileName, lista);
        
    }//GEN-LAST:event_btnEliminar2ActionPerformed

    private void btnAtenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderActionPerformed
        Customer atendido = lista.desencolar();
        llenarTabla(lista);
        gestor.GrabarArchivo(FileName, lista);
        
        listaAtentidos.encolar(atendido);
        gestor.GrabarArchivo(FileAtentidos, listaAtentidos);
        
        
        int respuesta = JOptionPane.showConfirmDialog(null, "Desea un comprobante de pago?", "Confirmación",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(respuesta == JOptionPane.YES_OPTION){
            this.dispose();
            FrmPaymentProof paymentProof = new FrmPaymentProof();
            paymentProof.mostrarCustomer(atendido);
            paymentProof.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"¡Agradecemos su preferencia!");
        }
    }//GEN-LAST:event_btnAtenderActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        this.dispose();
        FrmReport f = new FrmReport();
        f.llenarTabla(listaAtentidos);
        f.setVisible(true);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Main_Interface f = new Main_Interface();
        f.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmAtencionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAtencionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAtencionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAtencionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAtencionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtender;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar2;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> cbxMetodo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtCuentaTotal;
    private javax.swing.JTextField txtDocumentos;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}

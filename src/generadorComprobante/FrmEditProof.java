package generadorComprobante;

import atencionCliente.Customer;

public class FrmEditProof extends javax.swing.JFrame {
    private String nombre;
    private int documento;
    private String metodoPago;
    private double cuentaTotal;

    public FrmEditProof() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    public void guardarDatos (Customer customer){
        nombre = customer.getNombre();
        documento = customer.getDocumento();
        metodoPago = customer.getMetodoPago();
        cuentaTotal = customer.getCuentaFinal();
        txtNombres1.setText(nombre);
        txtDocumentos1.setText(String.valueOf(documento));
        cbxMetodo1.setSelectedItem(metodoPago);
        txtCuentaF.setText(String.valueOf(cuentaTotal));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCuentaTotal = new javax.swing.JTextField();
        cbxMetodo = new javax.swing.JComboBox<>();
        txtNombres = new javax.swing.JTextField();
        txtDocumentos = new javax.swing.JTextField();
        txtCuentaF = new javax.swing.JTextField();
        cbxMetodo1 = new javax.swing.JComboBox<>();
        txtNombres1 = new javax.swing.JTextField();
        txtDocumentos1 = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        txtCuentaTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta total:"));

        cbxMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Efectivo", "Tarjeta", "Yape", "Plin" }));
        cbxMetodo.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodo de pago:"));

        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres:"));

        txtDocumentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento:"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCuentaF.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuenta total:"));

        cbxMetodo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Efectivo", "Tarjeta", "Yape", "Plin" }));
        cbxMetodo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodo de pago:"));

        txtNombres1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres:"));

        txtDocumentos1.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento:"));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtDocumentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCuentaF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxMetodo1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtDocumentos1))
                    .addComponent(txtCuentaF)
                    .addComponent(cbxMetodo1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(txtNombres1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        nombre = txtNombres1.getText();
        documento = Integer.parseInt(txtDocumentos1.getText());
        metodoPago = cbxMetodo1.getSelectedItem().toString();
        cuentaTotal = Double.parseDouble(txtCuentaF.getText());
        Customer edit = new Customer(new Object[] {nombre,documento,metodoPago,cuentaTotal});
        FrmPaymentProof f = new FrmPaymentProof();
        f.actualizarCustomer(edit);
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        Customer edit = new Customer(new Object[] {nombre,documento,metodoPago,cuentaTotal});
        FrmPaymentProof f = new FrmPaymentProof();
        f.mostrarCustomer(edit);
        f.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEditProof().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxMetodo;
    private javax.swing.JComboBox<String> cbxMetodo1;
    private javax.swing.JTextField txtCuentaF;
    private javax.swing.JTextField txtCuentaTotal;
    private javax.swing.JTextField txtDocumentos;
    private javax.swing.JTextField txtDocumentos1;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombres1;
    // End of variables declaration//GEN-END:variables
}

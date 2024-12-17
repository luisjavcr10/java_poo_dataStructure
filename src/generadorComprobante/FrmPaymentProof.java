package generadorComprobante;

import atencionCliente.Customer;
import atencionCliente.FrmAtencionCliente;
import javax.swing.JOptionPane;

public class FrmPaymentProof extends javax.swing.JFrame {
    private String nombre;
    private int documento;
    private String metodoPago;
    private double cuentaTotal;

    public FrmPaymentProof() {
        initComponents();
        setLocationRelativeTo(null);
        txtProof.setEnabled(false);
    }
    
    public void  mostrarCustomer(Customer customer) {
        nombre = customer.getNombre();
        documento = customer.getDocumento();
        metodoPago = customer.getMetodoPago();
        cuentaTotal = customer.getCuentaFinal();
        
        String mensaje=
                "Consumidor: "+customer.getNombre()+"\n"+
                "\n"+
                "Nro Documento: "+customer.getDocumento()+"\n"+
                "\n"+
                "Metodo de pago: "+customer.getMetodoPago()+"\n"+
                "\n"+
                "Cuenta total: S/"+customer.getCuentaFinal();
        txtProof.setText(mensaje);
    }
    
    public void  actualizarCustomer(Customer customer) {
        String mensaje=
                "Consumidor: "+customer.getNombre()+"\n"+
                "\n"+
                "Nro Documento: "+customer.getDocumento()+"\n"+
                "\n"+
                "Metodo de pago: "+customer.getMetodoPago()+"\n"+
                "\n"+
                "Cuenta total: S/"+customer.getCuentaFinal();
        txtProof.setText(mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtProof = new javax.swing.JTextArea();
        btnImprimir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtProof.setColumns(20);
        txtProof.setRows(5);
        jScrollPane1.setViewportView(txtProof);

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel1.setText("Don Gastelo Chancho Al Palo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(26, 26, 26)
                .addComponent(btnImprimir)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimir)
                    .addComponent(btnEditar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        JOptionPane.showMessageDialog(null,"¡Agradecemos su preferencia!");
        this.dispose();
        FrmAtencionCliente f = new FrmAtencionCliente();
        f.setVisible(true);
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Customer edit = new Customer(new Object[] {nombre,documento,metodoPago,cuentaTotal});
        this.dispose();
        FrmEditProof f = new FrmEditProof();
        f.guardarDatos(edit);
        f.setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPaymentProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPaymentProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPaymentProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPaymentProof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPaymentProof().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtProof;
    // End of variables declaration//GEN-END:variables
}

package Inventario;

import atencionCliente.FrmAtencionCliente;
import generic.Gestor;
import generic.Nodo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistemarestaurante.Main_Interface;

public class FrmInventario extends javax.swing.JFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    LEDProductos lista = new LEDProductos();
    LEDProductos listaBebidas = new LEDProductos();
    Nodo<Product> actual;
    Gestor gestor = new Gestor();
    String FileName = "inventario.bin";
    double montoTotal;

    public FrmInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = (DefaultTableModel) jTable1.getModel();
        gestor.ArbrirArchivo(FileName, lista);
        llenarTabla(lista);
        btnSelecionar.setEnabled(false);
        btnTerminar.setEnabled(false);
        btnRegresarB.setEnabled(false);
    }
    
    public void llenarTabla(LEDProductos lista)
    {
        modelo.setRowCount(0);
            this.lista = lista;
            Nodo<Product> puntero = lista.getPrimero();
            while(puntero != null)
            {
                modelo.addRow(puntero.getInfo().getRegistro());
                puntero = puntero.getSgte();
            }
    }
    
    public void llenarTablaSelecionado(LEDProductos lista, String tipo)
    {
        modelo.setRowCount(0);
            this.lista = lista;
            Nodo<Product> puntero = lista.getPrimero();
            while(puntero != null)
            {
                if(puntero.getInfo().getTipo().equals(tipo)){
                    modelo.addRow(puntero.getInfo().getRegistro());
                }
                puntero = puntero.getSgte();
            }
    }
    
    public void llenarTablaBusqueda(LEDProductos lista, int codigo)
    {
        modelo.setRowCount(0);
            this.lista = lista;
            Nodo<Product> puntero = lista.getPrimero();
            while(puntero != null)
            {
                if(puntero.getInfo().getCodigo()==codigo){
                    modelo.addRow(puntero.getInfo().getRegistro());
                }
                puntero = puntero.getSgte();
            }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        btnMbebidas = new javax.swing.JButton();
        btnMplatillos = new javax.swing.JButton();
        btnMguarniciones = new javax.swing.JButton();
        btnMtodo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegresarB = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Reporte general de ventas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tipo de producto", "Código", "Nombre", "Precio (S/ x U)", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Inventario de productos");

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar Producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar producto");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar producto");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSelecionar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSelecionar.setText("Seleccionar Producto");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnIniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciar.setText("Iniciar Pedido");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnTerminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTerminar.setText("Terminar pedido");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnMbebidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMbebidas.setText("Mostrar Bebidas");
        btnMbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMbebidasActionPerformed(evt);
            }
        });

        btnMplatillos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMplatillos.setText("Mostrar Platillos");
        btnMplatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMplatillosActionPerformed(evt);
            }
        });

        btnMguarniciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMguarniciones.setText("Mostrar Guarniciones");
        btnMguarniciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMguarnicionesActionPerformed(evt);
            }
        });

        btnMtodo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMtodo.setText("Mostrar Todo");
        btnMtodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMtodoActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Producto por codigo:");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegresarB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresarB.setText("Regresar");
        btnRegresarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarBActionPerformed(evt);
            }
        });

        btnOrdenar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnMbebidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnIniciar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSelecionar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnTerminar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnMplatillos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnEliminar)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnMguarniciones)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnMtodo))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnRegresarB)
                                    .addGap(56, 56, 56)
                                    .addComponent(btnOrdenar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscar)
                    .addComponent(btnRegresarB)
                    .addComponent(btnOrdenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMbebidas)
                    .addComponent(btnMplatillos)
                    .addComponent(btnMguarniciones)
                    .addComponent(btnMtodo))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addComponent(btnIniciar)
                    .addComponent(btnTerminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.dispose();
        FrmAddProduct f = new FrmAddProduct();
        f.setVisible(true);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int fila = jTable1.getSelectedRow();
        if(fila != -1)
        {
            int rpta = JOptionPane.showConfirmDialog(this,"¿Desea actualizar el registro?","Proceso de actualizar",JOptionPane.YES_NO_OPTION);
            if(rpta == JOptionPane.YES_OPTION)
            {
                int codigo = Integer.parseInt(jTable1.getValueAt(fila, 1).toString());
                Nodo<Product> auxiliar = lista.BuscarCodigo(codigo);
                if(auxiliar != null)
                {
                    Product p = new Product(new Object[] {auxiliar.getInfo().getTipo(), auxiliar.getInfo().getCodigo(), 
                        auxiliar.getInfo().getNombre(), auxiliar.getInfo().getPrecio(), auxiliar.getInfo().getStock()});                  
                    this.dispose();
                    FrmAddProduct f = new FrmAddProduct();
                    actual=auxiliar;
                    f.sendRegistro(p, actual);
                    f.setVisible(true);
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
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = jTable1.getSelectedRow();
        if(fila != -1)
        {
            int rpta = JOptionPane.showConfirmDialog(this,"¿Desea eliminar el registro?","Proceso de eliminar",JOptionPane.YES_NO_OPTION);
            if(rpta == JOptionPane.YES_OPTION)
            {
                int codigo = Integer.parseInt(jTable1.getValueAt(fila, 1).toString());
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
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        int fila = jTable1.getSelectedRow();
        if(fila != -1)
        {
            int rpta = JOptionPane.showConfirmDialog(this,"¿Desea comprar el producto?","Proceso de actualizar",JOptionPane.YES_NO_OPTION);
            if(rpta == JOptionPane.YES_OPTION)
            {
                int codigo = Integer.parseInt(jTable1.getValueAt(fila, 1).toString());
                Nodo<Product> auxiliar = lista.BuscarCodigo(codigo);
                if(auxiliar != null)
                {                  
                    montoTotal = montoTotal + auxiliar.getInfo().getPrecio();
                    auxiliar.getInfo().setRegistro(new Object[] { auxiliar.getInfo().getTipo(), auxiliar.getInfo().getCodigo(), 
                        auxiliar.getInfo().getNombre(), auxiliar.getInfo().getPrecio(), auxiliar.getInfo().getStock()-1});   
                    llenarTabla(lista);              
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
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        Main_Interface f = new Main_Interface();
        f.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        btnIniciar.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegresar.setEnabled(false);
        
        btnSelecionar.setEnabled(true);
        btnTerminar.setEnabled(true);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        int rpta = JOptionPane.showConfirmDialog(this,"¿Desea continuar el proceso de compra?","Proceso de compra",JOptionPane.YES_NO_OPTION);
            if(rpta == JOptionPane.YES_OPTION)
            {
                this.dispose();
                FrmAtencionCliente f = new FrmAtencionCliente();
                f.obtenerMonto(montoTotal);
                f.setVisible(true);
            }    
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnMbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMbebidasActionPerformed
        llenarTablaSelecionado(lista,"Bebida");
    }//GEN-LAST:event_btnMbebidasActionPerformed

    private void btnMplatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMplatillosActionPerformed
        llenarTablaSelecionado(lista,"Platillo");
    }//GEN-LAST:event_btnMplatillosActionPerformed

    private void btnMguarnicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMguarnicionesActionPerformed
        llenarTablaSelecionado(lista,"Guarnición");
    }//GEN-LAST:event_btnMguarnicionesActionPerformed

    private void btnMtodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMtodoActionPerformed
        llenarTabla(lista);
    }//GEN-LAST:event_btnMtodoActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        lista.ordenarPorNombre();
        llenarTabla(lista);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int codigo = Integer.parseInt(txtBuscar.getText());
        if(lista.BuscarCodigo(codigo)!=null){
            llenarTablaBusqueda(lista,codigo);
        }else{
            JOptionPane.showMessageDialog(null,"El código de producto no se encuentra.");
            txtBuscar.setText(null);
        }
        btnBuscar.setEnabled(false);
        btnRegresarB.setEnabled(true);
        btnAgregar.setEnabled(false);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarBActionPerformed
        btnBuscar.setEnabled(true);
        btnRegresarB.setEnabled(false);
        llenarTabla(lista);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_btnRegresarBActionPerformed

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
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMbebidas;
    private javax.swing.JButton btnMguarniciones;
    private javax.swing.JButton btnMplatillos;
    private javax.swing.JButton btnMtodo;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresarB;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}

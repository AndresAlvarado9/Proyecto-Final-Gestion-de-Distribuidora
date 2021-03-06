/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorBodega;
import ec.edu.ups.modelo.Bodega;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author HI andres
 */
public class VentanaGestionBodega extends javax.swing.JInternalFrame {
private ControladorBodega controladorBodega;
private Locale localizacion;
private ResourceBundle mensaje;
    /**
     * Creates new form VentanaGestionBodega
     */
    public VentanaGestionBodega(ControladorBodega controladorBodega) {
        initComponents();
        this.controladorBodega=controladorBodega;
    }

    public Locale getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Locale localizacion) {
        this.localizacion = localizacion;
    }

    public ResourceBundle getMensaje() {
        return mensaje;
    }

    public void setMensaje(ResourceBundle mensaje) {
        this.mensaje = mensaje;
    }
    public void cambiarIdioma(String idioma,String localidad){
    labelCodigo.setText(mensaje.getString("Codigo"));
    labelDireccion.setText(mensaje.getString("Direccion"));
    labelNombre.setText(mensaje.getString("Nombre"));
    labelTelefono.setText(mensaje.getString("Telefonos"));
    labelTitulo.setText(mensaje.getString("BodegaT"));
    btnActualiza.setText(mensaje.getString("Actualizar"));
    btnBuscar.setText(mensaje.getString("Buscar"));
    btnCrear.setText(mensaje.getString("Crear"));
    btnEliminar.setText(mensaje.getString("Eliminar"));
    TableColumnModel modelo = tblBodega.getColumnModel();
    modelo.getColumn(0).setHeaderValue(mensaje.getString("Codigo"));
    modelo.getColumn(1).setHeaderValue(mensaje.getString("Nombre"));
    modelo.getColumn(2).setHeaderValue(mensaje.getString("Direccion"));
    modelo.getColumn(3).setHeaderValue(mensaje.getString("Telefonos"));
    }
    
    public void cargarDatosTbl() {
       
        
    }
    public void limpiar(){
    txtNombreB.setText("");
    txtDireccion.setText("");
    txtTelefono.setText("");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualiza = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBodega = new javax.swing.JTable();
        labelTitulo = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtNombreB = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 143, 227));

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");

        btnActualiza.setText("Actualizar");
        btnActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBodega);

        labelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        labelTitulo.setText("Bodega");

        labelCodigo.setText("Codigo");

        labelNombre.setText("Nombre");

        labelDireccion.setText("Direccion");

        labelTelefono.setText("Telefono");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(labelDireccion)
                                    .addComponent(labelTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelCodigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnCrear)
                        .addGap(12, 12, 12)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualiza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(labelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(txtNombreB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCrear)
                    .addComponent(btnActualiza)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        cargarDatosTbl();
        limpiar();
JOptionPane.showMessageDialog(this, "Bodega creada exitosamente");
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int respuesta = JOptionPane.showConfirmDialog(this,"Estas seguro que deceas eliminar el telefono seleccionado" );
        if (respuesta == JOptionPane.YES_OPTION) {
             
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiza;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tblBodega;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombreB;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

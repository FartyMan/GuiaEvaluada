/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.dao.DaoFacultad;
import com.modelo.Facultad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Nombre de la clase: FrmFacultad
 * Fecha:22-08-2018
 * Versión: 1.0
 * CopyRight:ITCA-FEPADE
 * @author Leonardo Mendez
 */
public class FrmFacultad extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmFacultad
     */
    public FrmFacultad() {
        initComponents();
        this.jTxtCodigo.setEnabled(false);
        mostrarFacultad();
    }

    DaoFacultad daoFac = new DaoFacultad();
    Facultad  fac = new Facultad();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaFacultad = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnInsertar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jTxtCodigo = new javax.swing.JTextField();
        jTxtNombre = new javax.swing.JTextField();
        jTxtTelefono = new javax.swing.JFormattedTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestionar Facultad");

        jTablaFacultad.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaFacultad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaFacultadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaFacultad);

        jLabel2.setText("Codigo: ");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Telefono:");

        jBtnInsertar.setText("Insertar");
        jBtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInsertarActionPerformed(evt);
            }
        });

        jBtnModificar.setText("Modificar");
        jBtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnModificarActionPerformed(evt);
            }
        });

        jBtnEliminar.setText("Eliminar");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        try {
            jTxtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(503) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jBtnInsertar)
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jTxtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jBtnModificar)
                                    .addComponent(jTxtTelefono))))
                        .addGap(54, 54, 54)
                        .addComponent(jBtnLimpiar)
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnInsertar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void agregarFacultad(){
        String nombre = jTxtNombre.getText();
        String telefono = jTxtTelefono.getText();
       
        fac.setNombre(nombre);
        fac.setTelefono(telefono);
        
        daoFac.insertarFacultad(fac);
        JOptionPane.showMessageDialog(null, "Ingresado correctamente");
        mostrarFacultad();
        limpiar();
    }
    
    public void mostrarFacultad()
    {
        String[] columnas ={"codigo", "Nombre", "Telefono"};
        Object[] obj = new Object[3];
        DefaultTableModel tabla = new DefaultTableModel(null, columnas);
        try 
        {
            List lista = daoFac.mostrarFacultad();
            for (int i = 0; i <lista.size(); i++) 
            {
                fac = (Facultad) lista.get(i);
                obj[0] = fac.getCodigoFacultad();
                obj[1] = fac.getNombre();
                obj[2] = fac.getTelefono();
                tabla.addRow(obj);
            }
            this.jTablaFacultad.setModel(tabla);
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error al mostrar" +e.getMessage());
        }
    }
    
    public void modificar()
    {
        try 
        {
            fac.setNombre(this.jTxtNombre.getText());
            fac.setTelefono(this.jTxtTelefono.getText());
            fac.setCodigoFacultad(Integer.parseInt(this.jTxtCodigo.getText()));
            int SioNo = JOptionPane.showConfirmDialog(null,"Desea modificar facultad","Modificar Faculitad",
                    JOptionPane.YES_NO_OPTION);
            if(SioNo ==0)
            {
                daoFac.modififaFacultad(fac);
                JOptionPane.showMessageDialog(null, "Facultad modificada","Confirmacion",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                mostrarFacultad();
            }
            else
            {
                limpiar();
            }
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error al modificar" +e.getMessage());
        }
    }
    
    public void eliminar()
    {
        try 
        {
            fac.setCodigoFacultad(Integer.parseInt(this.jTxtCodigo.getText()));
            int SioNo = JOptionPane.showConfirmDialog(null,"Desea eliminar facultad","Modificar Faculitad",
                    JOptionPane.YES_NO_OPTION);
            if(SioNo ==0)
            {
                daoFac.eliminarFacultad(fac);
                JOptionPane.showMessageDialog(null, "Facultad eliminada","Confirmacion",
                        JOptionPane.INFORMATION_MESSAGE);
                limpiar();
                mostrarFacultad();
            }
            else
            {
             limpiar();
            }
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null,"Error al eliminada" +e.getMessage());
        }
        
    }
    
    public void limpiar()
    {
        this.jTxtCodigo.setText("");
        this.jTxtNombre.setText("");
        this.jTxtTelefono.setText("");
    }
    
    public void llenarTextField()
    {
        int fila = this.jTablaFacultad.getSelectedRow();
        this.jTxtCodigo.setText(String.valueOf(this.jTablaFacultad.getValueAt(fila, 0)));
        this.jTxtNombre.setText(String.valueOf(this.jTablaFacultad.getValueAt(fila, 1)));
        this.jTxtTelefono.setText(String.valueOf(this.jTablaFacultad.getValueAt(fila, 2)));
        
    }
    private void jBtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarActionPerformed
        this.agregarFacultad();
    }//GEN-LAST:event_jBtnInsertarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        this.modificar();
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        this.eliminar();
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jTablaFacultadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaFacultadMouseClicked
        llenarTextField();
    }//GEN-LAST:event_jTablaFacultadMouseClicked
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnInsertar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaFacultad;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JFormattedTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}

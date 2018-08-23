
package vistas;

import com.dao.DaoCarrera;
import com.dao.DaoFacultad;
import com.modelo.Carrera;
import com.modelo.Estudiante;
import com.modelo.Facultad;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramirez
 */
public class FrmCarrera extends javax.swing.JInternalFrame {

  
    public FrmCarrera() throws Exception {
        initComponents();
        mostrarCarrera();
        cargarCombo();
        this.jBtnModificar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
    }
    DaoCarrera daoCar = new DaoCarrera();
    DaoFacultad daoFac = new DaoFacultad();
    Carrera car = new Carrera();
    Facultad fac = new Facultad();
    private List comboItems;
    private void cargarCombo() {
        this.jCmbFacultad.removeAllItems();
        
        comboItems = daoFac.mostrarFacultad();
        Facultad facultad;
        for (Object item : comboItems) {
            facultad = (Facultad) item;
            this.jCmbFacultad.addItem(facultad.getNombre());
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnInsertar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jTxtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaCarrera = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jSpCantidadMateria = new javax.swing.JSpinner();
        jCmbFacultad = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel2.setText("Codigo: ");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Cantidad Materias");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Gestionar Carrera");

        jTablaCarrera.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaCarreraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablaCarrera);

        jLabel5.setText("Facultad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jBtnInsertar)
                                .addGap(43, 43, 43)
                                .addComponent(jBtnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jBtnEliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTxtCodigo)
                                    .addComponent(jTxtNombre)
                                    .addComponent(jCmbFacultad, 0, 115, Short.MAX_VALUE)
                                    .addComponent(jSpCantidadMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addComponent(jBtnLimpiar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jSpCantidadMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCmbFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnInsertar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void mostrarCarrera()
    {   
        String[] columnas = {"Codigo", "Nombre", "Cantidad de Materias", "Facultad"};
        Object[] obj = new Object[4];
        DefaultTableModel tabla = new DefaultTableModel(null,columnas);
        try 
        {
            List lista = daoCar.mostrarCarrera();
            for (int i = 0; i <lista.size(); i++)
            {
                car = (Carrera) lista.get(i);
                obj[0] = car.getCodigoCarrera();
                obj[1] = car.getNombre();
                obj[2] = car.getCantidadMaterias();
                fac = daoFac.buscarFacultad(fac.getCodigoFacultad());
                obj[3] = car.getNombre();
                tabla.addRow(obj);
            }
            this.jTablaCarrera.setModel(tabla);
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error generando Tabla!", "Carga Fallida "
                    + e.getMessage(),
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
    
    public void agregar(){
        Facultad facultad = (Facultad) this.comboItems.get(this.jCmbFacultad.getSelectedIndex());
        String nombre = jTxtNombre.getText();
        int cantidad = Integer.parseInt(jSpCantidadMateria.getValue().toString());
        int item = facultad.getCodigoFacultad();
        
        car.setNombre(nombre);
        car.setCantidadMaterias(cantidad);
        car.setCodigoFacultad(item);
        
        daoCar.insertarCarrera(car);
        JOptionPane.showMessageDialog(null, "Ingresado correctamente");
        mostrarCarrera();
        limpiar();
    }
    
    public void modificar()
    {
        try 
        {
            int codigo = Integer.parseInt(jTxtCodigo.getText());
            String nombre = jTxtNombre.getText();
            int cantidad = Integer.parseInt(jSpCantidadMateria.getValue().toString());
            String facultad = jCmbFacultad.getSelectedItem().toString();
            ComboItem item = new ComboItem();

            for (int i = 0; i < jCmbFacultad.getItemCount(); i++) {
                if (facultad.equals(jCmbFacultad.getItemAt(i).toString())) {
                //item = jCmbFacultad.getModel().getElementAt(i);
                }
            }

            car.setNombre(nombre);
            car.setCantidadMaterias(cantidad);
            car.setCodigoFacultad(item.getValue());
            car.setCodigoCarrera(codigo);
            
            int SioNo = JOptionPane.showConfirmDialog(null,"Desea modificar carrera","Modificar carrera",
                    JOptionPane.YES_NO_OPTION);
            if(SioNo ==0)
            {
                daoCar.modificarCarrera(car);
                JOptionPane.showMessageDialog(null, "Facultad modificada","Confirmacion",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrarCarrera();
                limpiar();
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
            int codigo = Integer.parseInt(jTxtCodigo.getText());

            car.setCodigoCarrera(codigo);
            
            int SioNo = JOptionPane.showConfirmDialog(null,"Desea eliminar carrera","Modificar carrera",
                    JOptionPane.YES_NO_OPTION);
            if(SioNo ==0)
            {
                daoCar.eliminarCarrera(car);
                JOptionPane.showMessageDialog(null, "Facultad modificada","Confirmacion",
                        JOptionPane.INFORMATION_MESSAGE);
                mostrarCarrera();
                limpiar();
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
    
     public void limpiar()
    {
        this.jTxtCodigo.setText("");
        this.jTxtNombre.setText("");
        this.jSpCantidadMateria.setValue(0);
        this.jCmbFacultad.setSelectedIndex(0);
    }
    
    public void llenarTextField()
    {
        int fila = this.jTablaCarrera.getSelectedRow();
        this.jTxtCodigo.setText(String.valueOf(this.jTablaCarrera.getValueAt(fila, 0)));
        this.jTxtNombre.setText(String.valueOf(this.jTablaCarrera.getValueAt(fila, 1)));
        int cantidad = Integer.parseInt(this.jTablaCarrera.getValueAt(fila, 2).toString());
        this.jSpCantidadMateria.setValue(cantidad);
        String facu = String.valueOf(this.jTablaCarrera.getValueAt(fila, 3));
        this.jCmbFacultad.getModel().setSelectedItem(facu);
        
    }
    
    private void jBtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarActionPerformed
        this.agregar();
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

    private void jTablaCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaCarreraMouseClicked
        llenarTextField();
    }//GEN-LAST:event_jTablaCarreraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnInsertar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JComboBox<String> jCmbFacultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpCantidadMateria;
    private javax.swing.JTable jTablaCarrera;
    private javax.swing.JTextField jTxtCodigo;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}

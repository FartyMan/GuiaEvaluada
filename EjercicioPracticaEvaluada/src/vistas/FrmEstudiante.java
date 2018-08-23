package vistas;

import com.dao.DaoCarrera;
import com.dao.DaoEstudiante;
import com.modelo.Estudiante;
import com.modelo.Carrera;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Nombre de la clase: FrmEstudiante
 * Fecha:21-08-2018
 * Versión: 1.0
 * CopyRight:ITCA-FEPADE
 * @author Leonardo Mendez
 */
public class FrmEstudiante extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEstudiante
     */
    
    
    DaoEstudiante daoEst = new DaoEstudiante();
    DaoCarrera daoCar = new DaoCarrera();
    Estudiante est = new Estudiante();
    Ar
    
    public FrmEstudiante() throws Exception {
        initComponents();
        tablaP();
        this.jTxtCarnet.setEnabled(false);
        cargarCombo(jComboCarrera, daoEst.mostrarEstudiante());
    }
    
    private void cargarCombo(JComboBox combo, List<Estudiante> list) throws Exception {

        for (Estudiante item : list) {
            combo.addItem(new ComboItem(item.getCodigoCarrera(), item.getNombre()));
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtCarnet = new javax.swing.JTextField();
        jSpEdad = new javax.swing.JSpinner();
        jTxtNombre = new javax.swing.JTextField();
        jRdMasculino = new javax.swing.JRadioButton();
        jRdFemenino = new javax.swing.JRadioButton();
        jTxtCum = new javax.swing.JTextField();
        jChDeportes = new javax.swing.JCheckBox();
        jChMusica = new javax.swing.JCheckBox();
        jChArte = new javax.swing.JCheckBox();
        jComboCarrera = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaEstudiante = new javax.swing.JTable();
        jBtnInsertar = new javax.swing.JButton();
        jBtnModificar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);

        jRdMasculino.setText("Masculino");

        jRdFemenino.setText("Femenino");

        jChDeportes.setText("Deportes");

        jChMusica.setText("Musica");

        jChArte.setText("Arte");

        label1.setText("Carnet");

        label2.setText("Nombre");

        label3.setText("Edad");

        label4.setText("Genero");

        jLabel1.setText("CUM");

        label5.setText("Intereses");

        label6.setText("Carrera");

        jTablaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaEstudiante);

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Gestionar Estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRdMasculino)
                                    .addComponent(jChDeportes))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jChMusica)
                                        .addGap(29, 29, 29)
                                        .addComponent(jChArte))
                                    .addComponent(jRdFemenino)))
                            .addComponent(jTxtCum, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtCarnet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimpiar)
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTxtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jSpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRdMasculino)
                            .addComponent(jRdFemenino))
                        .addGap(18, 18, 18)
                        .addComponent(jTxtCum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jChDeportes)
                            .addComponent(jChMusica)
                            .addComponent(jChArte))
                        .addGap(20, 20, 20)
                        .addComponent(jComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)))
                                .addGap(41, 41, 41))
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnInsertar)
                    .addComponent(jBtnModificar)
                    .addComponent(jBtnEliminar)
                    .addComponent(jBtnLimpiar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tablaP() {

        String[] columnas = {"Carnet", "Nombre", "Edad", "Genero", "Cum", "Intereses",  "Carrera"};
        Object[] obj = new Object[7];
        DefaultTableModel tabla = new DefaultTableModel(null, columnas);
        List ls;

        try {

            ls = daoEst.mostrarEstudiante();

            for (int i = 0; i < ls.size(); i++) {

                est = (Estudiante) ls.get(i);
                obj[0] = est.getCodigoEstudiante();
                obj[1] = est.getNombre();
                obj[2] = est.getEdad();
                obj[3] = est.getGenero();
                obj[4] = est.getCum();
                obj[5] = est.getIntereses();
                obj[6] = daoCar.mostrarCarrera();
                tabla.addRow(obj);

            }
            this.jTablaEstudiante.setModel(tabla);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error generando Tabla!", "Carga Fallida "
                    + e.getMessage(),
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }
    private void jBtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarActionPerformed
        
        String nombre = jTxtNombre.getText();
        int edad = Integer.parseInt(jSpEdad.getValue().toString());
        String genero = jRdMasculino.isSelected() ? jRdMasculino.getText() :
                jRdFemenino.getText();
        double cum = Double.parseDouble(jTxtCum.getText());

        String intereses = "";
         if(this.jChDeportes.isSelected())
         {
             intereses+=" Deportes";
         }
         if(this.jChMusica.isSelected())
         {
             intereses+=" Musica";
         }
         if(this.jChArte.isSelected())
         {
             intereses+=" Arte";
         }
         
         String carrera = jComboCarrera.getSelectedItem().toString();
         ComboItem item = new ComboItem();
         
          for (int i = 0; i < jComboCarrera.getItemCount(); i++) 
        {
            if(carrera.equals(jComboCarrera.getItemAt(i).toString()))
            {
                item = jComboCarrera.getModel().getElementAt(i);
            }
        }
         
         est.setNombre(nombre);
         est.setEdad(edad);
         est.setGenero(genero);
         est.setCum(cum);
         est.setIntereses(intereses);
         est.setCodigoCarrera(item.getValue());
         
         daoEst.insertarEstudiante(est);
         JOptionPane.showMessageDialog(null, "Empleado Guardado Exitosamente", "Actualizacion Correcta",
                    JOptionPane.INFORMATION_MESSAGE);
                
    }//GEN-LAST:event_jBtnInsertarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        try 
        {
            int codigo = Integer.parseInt(jTxtCarnet.getText());
        String nombre = jTxtNombre.getText();
        int edad = Integer.parseInt(jSpEdad.getValue().toString());
        String genero = jRdMasculino.isSelected() ? jRdMasculino.getText() :
                jRdFemenino.getText();
        double cum = Double.parseDouble(jTxtCum.getText());

        String intereses = "";
         if(this.jChDeportes.isSelected())
         {
             intereses+="Deportes, ";
         }
         if(this.jChMusica.isSelected())
         {
             intereses+="Musica, ";
         }
         if(this.jChArte.isSelected())
         {
             intereses+="Arte, ";
         }
         
         String carrera = jComboCarrera.getSelectedItem().toString();
         ComboItem item = new ComboItem();
         
          for (int i = 0; i < jComboCarrera.getItemCount(); i++) 
        {
            if(carrera.equals(jComboCarrera.getItemAt(i).toString()))
            {
                //item = jComboCarrera.getModel().getElementAt(i);
            }
        }
         
         est.setNombre(nombre);
         est.setEdad(edad);
         est.setGenero(genero);
         est.setCum(cum);
         est.setIntereses(intereses);
         //est.setCarrera(item.getValue());
         est.setCodigoEstudiante(codigo);
         
         daoEst.modificarEstudiante(est);
         JOptionPane.showMessageDialog(null, "Empleado modificado Exitosamente", "Actualizacion Correcta",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,
                    "Ocurrio un error modificando ",
                    "Modificacion Fallido",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        try 
        {
             int codigo = Integer.parseInt(jTxtCarnet.getText());
            
             int SioNo = JOptionPane.showConfirmDialog(this, "¿Desea Eliminar definitivamente el empleado?", "Eliminar Empleado", JOptionPane.YES_NO_OPTION);

            if (SioNo == 0)
            {
                //daoEst.eliminarEstudiante(codigo);
                JOptionPane.showMessageDialog(null, "Se ha eliminado Exitosamente");
                tablaP();
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,
                    "Ocurrio un error Eliminando",
                    "Imposible Eliminar",
                    JOptionPane.ERROR_MESSAGE);
        }
 
            
    }//GEN-LAST:event_jBtnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnInsertar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JCheckBox jChArte;
    private javax.swing.JCheckBox jChDeportes;
    private javax.swing.JCheckBox jChMusica;
    private javax.swing.JComboBox<String> jComboCarrera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRdFemenino;
    private javax.swing.JRadioButton jRdMasculino;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpEdad;
    private javax.swing.JTable jTablaEstudiante;
    private javax.swing.JTextField jTxtCarnet;
    private javax.swing.JTextField jTxtCum;
    private javax.swing.JTextField jTxtNombre;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    // End of variables declaration//GEN-END:variables
}

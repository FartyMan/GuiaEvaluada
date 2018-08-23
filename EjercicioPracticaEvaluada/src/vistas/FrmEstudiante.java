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
    Carrera car = new Carrera();
    private List comboItems;
    
    public FrmEstudiante() throws Exception {
        initComponents();
        tabla();
        this.jTxtCarnet.setEnabled(false);
        cargarCombo();
        this.jBtnModificar.setEnabled(false);
        this.jBtnEliminar.setEnabled(false);
    }
    
    private void cargarCombo() {
        this.jComboCarrera.removeAllItems();
        
        comboItems = daoCar.mostrarCarrera();
        Carrera carrera;
        for (Object item : comboItems) {
            carrera = (Carrera) item;
            this.jComboCarrera.addItem(carrera.getNombre());
        }

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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

        jSpEdad.setModel(new javax.swing.SpinnerNumberModel(20, 17, 60, 1));

        buttonGroup1.add(jRdMasculino);
        jRdMasculino.setText("Masculino");

        buttonGroup1.add(jRdFemenino);
        jRdFemenino.setText("Femenino");

        jChDeportes.setText("Deportes");

        jChMusica.setText("Musica");

        jChArte.setText("Arte");

        jComboCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCarreraActionPerformed(evt);
            }
        });

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
        jTablaEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaEstudianteMouseClicked(evt);
            }
        });
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
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Gestionar Estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSpEdad)
                                .addComponent(jTxtCarnet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCum, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jRdMasculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRdFemenino))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jChDeportes)
                                        .addGap(18, 18, 18)
                                        .addComponent(jChMusica)
                                        .addGap(18, 18, 18)
                                        .addComponent(jChArte))))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRdMasculino)
                                .addComponent(jRdFemenino))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTxtCum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jChDeportes)
                                .addComponent(jChMusica)
                                .addComponent(jChArte)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tabla() {

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
                car = daoCar.buscarCarrera(est.getCodigoCarrera());
                obj[6] = car.getNombre();
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
    
    public void llenarTextField()
    {
        this.jBtnModificar.setEnabled(true);
        this.jBtnEliminar.setEnabled(true);
        this.jBtnInsertar.setEnabled(false);
        int index = this.jTablaEstudiante.getSelectedRow();
        
        if (index > -1) {
            this.jTxtCarnet.setText(String.valueOf(this.jTablaEstudiante.getValueAt(index, 0)));
            this.jTxtNombre.setText(String.valueOf(this.jTablaEstudiante.getValueAt(index, 1)));
            int cantidad = Integer.parseInt(String.valueOf(this.jTablaEstudiante.getValueAt(index, 2)));
            this.jSpEdad.setValue(cantidad);
            String genero = String.valueOf(this.jTablaEstudiante.getValueAt(index, 3));
            if(genero.toLowerCase().equals("masculino"))
            {
                this.jRdMasculino.setSelected(true);
            } else
            {
                this.jRdFemenino.setSelected(true);
            }
            this.jTxtCum.setText(String.valueOf(this.jTablaEstudiante.getValueAt(index, 4)));
            String intereses = String.valueOf(this.jTablaEstudiante.getValueAt(index, 5));
            String[] s = intereses.split(",");
            this.jChArte.setSelected(false);
            this.jChDeportes.setSelected(false);
            this.jChMusica.setSelected(false);
            for (int i = 0; i < s.length; i++) {
                String comprobante = s[i].trim();
                if(comprobante.equals("Musica"))
                {
                    this.jChMusica.setSelected(true);
                }
                if(comprobante.equals("Deportes"))
                {
                    this.jChDeportes.setSelected(true);
                }
                if(comprobante.equals("Arte"))
                {
                    this.jChDeportes.setSelected(true);
                }
            }
            this.jComboCarrera.getModel().setSelectedItem(String.valueOf(this.jTablaEstudiante.getValueAt(index, 6)));
        }
    }
    
    public void limpiar()
    {
        this.jTxtCarnet.setText("");
        this.jTxtNombre.setText("");
        this.jTxtCum.setText("");
        this.jChArte.setSelected(false);
        this.jChMusica.setSelected(false);
        this.jChDeportes.setSelected(false);
        this.jRdFemenino.setSelected(false);
        this.jRdMasculino.setSelected(false);
        this.jComboCarrera.setSelectedIndex(0);
        this.jSpEdad.setValue(17);
        this.jBtnInsertar.setEnabled(true);
        this.jBtnEliminar.setEnabled(false);
        this.jBtnModificar.setEnabled(false);
    }
    
    public void insercion()
    {
        Carrera carrera = (Carrera) this.comboItems.get(this.jComboCarrera.getSelectedIndex());
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
         
         int item = carrera.getCodigoCarrera();
         
         est.setNombre(nombre);
         est.setEdad(edad);
         est.setGenero(genero);
         est.setCum(cum);
         est.setIntereses(intereses);
         est.setCodigoCarrera(item);
         
         daoEst.insertarEstudiante(est);
         JOptionPane.showMessageDialog(null, "Empleado Guardado Exitosamente", "Actualizacion Correcta",
                    JOptionPane.INFORMATION_MESSAGE);
        tabla();
    }
    
    public void modificar()
    {
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
     
        Carrera carrera = (Carrera) this.comboItems.get(this.jComboCarrera.getSelectedIndex());
         
        est.setNombre(nombre);
        est.setEdad(edad);
        est.setGenero(genero);
        est.setCum(cum);
        est.setIntereses(intereses);
        est.setCodigoCarrera(carrera.getCodigoCarrera());
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
        tabla();
    }
    
    public void eliminar()
    {
        try 
        {
             est.setCodigoEstudiante(Integer.parseInt(this.jTxtCarnet.getText()));
            
             int SioNo = JOptionPane.showConfirmDialog(this, "¿Desea Eliminar definitivamente el empleado?", "Eliminar Empleado", JOptionPane.YES_NO_OPTION);

            if (SioNo == 0)
            {
                daoEst.deleteLogicoEstudiante(est);
                JOptionPane.showMessageDialog(null, "Se ha eliminado Exitosamente");
                tabla();
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,
                    "Ocurrio un error Eliminando",
                    "Imposible Eliminar",
                    JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    private void jBtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInsertarActionPerformed
        insercion();
    }//GEN-LAST:event_jBtnInsertarActionPerformed

    private void jBtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jBtnModificarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
            
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jTablaEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaEstudianteMouseClicked
        llenarTextField();
    }//GEN-LAST:event_jTablaEstudianteMouseClicked

    private void jComboCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCarreraActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
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

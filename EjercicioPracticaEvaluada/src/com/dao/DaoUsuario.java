/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: Usuario
 * Version: 1.0
 * Fecha de Creación: 21 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramirez
 */
public class DaoUsuario extends Conexion{
    public int login(String u, String p)
    {
        ResultSet res;
        int entero = 0;
        try 
        {
            this.conectar();
            String sql = "select * from usuario where username=? and pass=?";
            PreparedStatement pre = this.getCon().prepareStatement(sql);
            pre.setString(1, u);
            pre.setString(2, p);
            res = pre.executeQuery();
            while(res.next())
            {
                entero = 1;
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Ocurrió el siguiente error al loguearse: "+e.getMessage());
        }
        finally
        {
            this.desconectar();
        }
        return entero;
    }
}

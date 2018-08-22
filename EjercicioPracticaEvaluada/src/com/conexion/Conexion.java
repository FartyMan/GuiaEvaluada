package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: Conexion
 * Versión: 1.0
 * Fecha de Creación: 18 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramírez
 */
public class Conexion {
    
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void conectar()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/basepe","root","chuhinglin");
        } 
        catch (SQLException | ClassNotFoundException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al conectar: "+e.getMessage());
        }
    }
    
    public void desconectar()
    {
        try 
        {
            if(con!=null)
            {
                if(!con.isClosed())
                {
                    con.close();
                }
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error al desconectar: "+e.getMessage());
        }
    }
}

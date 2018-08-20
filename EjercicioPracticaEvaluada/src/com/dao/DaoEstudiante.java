/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.conexion.Conexion;
import com.modelo.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: DaoEstudiante
 * Versión: 1.0
 * Fecha de Creación:19 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramirez
 */
public class DaoEstudiante extends Conexion{
    public void insertarEstudiante(Estudiante es)
    {
        try 
        {
            this.conectar();
            String sql = "call insertarEstudiante(?,?,?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setString(1, es.getNombre());
            pre.setInt(2, es.getEdad());
            pre.setString(3, es.getGenero());
            pre.setDouble(4, es.getCum());
            pre.setString(5, es.getIntereses());
            pre.setInt(6, es.getCodigoCarrera());
            
            pre.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e);
        }
        finally
        {
            this.desconectar();
        }
    }
    
    public void modificarEstudiante(Estudiante es)
    {
        try 
        {
            this.conectar();
            String sql = "call modificarEstudiante(?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setString(1, es.getNombre());
            pre.setInt(2, es.getEdad());
            pre.setString(3, es.getGenero());
            pre.setDouble(4, es.getCum());
            pre.setString(5, es.getIntereses());
            pre.setInt(6, es.getCodigoCarrera());
            
            pre.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e);
        }
        finally
        {
            this.desconectar();
        }
    }
    
    public void deleteLogicoEstudiante(Estudiante es)
    {
        try 
        {
            this.conectar();
            String sql = "call papeleraEstudiante(?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, es.getCodigoEstudiante());
            
            pre.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e);
        }
        finally
        {
            this.desconectar();
        }
    }
    
    public void eliminarEstudiante(Estudiante es)
    {
        try 
        {
            this.conectar();
            String sql = "call eliminarEstudiante(?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, es.getCodigoEstudiante());
            
            pre.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al insertar: "+e);
        }
        finally
        {
            this.desconectar();
        }
    }
    
    public List mostrarEstudiante()
    {
        List<Estudiante> lista=new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call mostrarEstudiante()";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next())
            {
                Estudiante es = new Estudiante();
                es.setCodigoEstudiante(res.getInt("codigoEstudiante"));
                es.setNombre(res.getString("nombre"));
                es.setEdad(res.getInt("edad"));
                es.setGenero(res.getString("genero"));
                es.setCum(res.getDouble("cum"));
                es.setIntereses(res.getString("intereses"));
                es.setCodigoCarrera(res.getInt("codigoCarrera"));
                lista.add(es);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar: "+e);
        }
        finally
        {
            this.desconectar();
        }
        return lista;
    }
    
    public List mostrarPapeleraEstudiante()
    {
        List<Estudiante> lista = new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call mostrarPapeleraEstudiante();";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next())
            {
                Estudiante es = new Estudiante();
                es.setCodigoEstudiante(res.getInt("codigoEstudiante"));
                es.setNombre(res.getString("nombre"));
                es.setEdad(res.getInt("edad"));
                es.setGenero(res.getString("genero"));
                es.setCum(res.getDouble("cum"));
                es.setIntereses(res.getString("intereses"));
                es.setCodigoCarrera(res.getInt("codigoCarrera"));
                lista.add(es);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar papelera: "+e.getMessage());
        }
        return lista;
    }
    
    public Estudiante buscarPapeleraEstudiante(int idEstudiante)
    {
        Estudiante es = new Estudiante();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarPapeleraEstudiante(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idEstudiante);
            res = pre.executeQuery();
            while(res.next())
            {
                es.setCodigoEstudiante(res.getInt("codigoEstudiante"));
                es.setNombre(res.getString("nombre"));
                es.setEdad(res.getInt("edad"));
                es.setGenero(res.getString("genero"));
                es.setCum(res.getDouble("cum"));
                es.setIntereses(res.getString("intereses"));
                es.setCodigoCarrera(res.getInt("codigoCarrera"));
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return es;
    }
    
    public List buscarPapeleraEstudianteTabla(int idEstudiante)
    {
        List<Estudiante> lista=new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarPapeleraEstudiante(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idEstudiante);
            res = pre.executeQuery();
            while(res.next())
            {
                Estudiante es = new Estudiante();
                es.setCodigoEstudiante(res.getInt("codigoEstudiante"));
                es.setNombre(res.getString("nombre"));
                es.setEdad(res.getInt("edad"));
                es.setGenero(res.getString("genero"));
                es.setCum(res.getDouble("cum"));
                es.setIntereses(res.getString("intereses"));
                es.setCodigoCarrera(res.getInt("codigoCarrera"));
                lista.add(es);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return lista;
    }
    
    public Estudiante buscarEstudiante(int idEstudiante)
    {
        Estudiante es = new Estudiante();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarEstudiante(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idEstudiante);
            res = pre.executeQuery();
            while(res.next())
            {
                es.setCodigoEstudiante(res.getInt("codigoEstudiante"));
                es.setNombre(res.getString("nombre"));
                es.setEdad(res.getInt("edad"));
                es.setGenero(res.getString("genero"));
                es.setCum(res.getDouble("cum"));
                es.setIntereses(res.getString("intereses"));
                es.setCodigoCarrera(res.getInt("codigoCarrera"));
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return es;
    }
    
    public List buscarEstudianteTabla(int idEstudiante)
    {
        List<Estudiante> lista = new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarEstudiante(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idEstudiante);
            res = pre.executeQuery();
            while(res.next())
            {
                Estudiante es = new Estudiante();
                es.setCodigoEstudiante(res.getInt("codigoEstudiante"));
                es.setNombre(res.getString("nombre"));
                es.setEdad(res.getInt("edad"));
                es.setGenero(res.getString("genero"));
                es.setCum(res.getDouble("cum"));
                es.setIntereses(res.getString("intereses"));
                es.setCodigoCarrera(res.getInt("codigoCarrera"));
                lista.add(es);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return lista;
    }
}

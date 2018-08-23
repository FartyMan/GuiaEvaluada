package com.dao;

import com.conexion.Conexion;
import com.modelo.Carrera;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: DaoCarrera
 * Versión: 1.0
 * Fecha de Creación: 18 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramírez
 */
public class DaoCarrera extends Conexion{
    
    public void insertarCarrera(Carrera ca)
    {
        try 
        {
            this.conectar();
            String sql = "call insertarCarrera(?,?,?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setString(1, ca.getNombre());
            pre.setInt(2, ca.getCantidadMaterias());
            pre.setInt(3, ca.getCodigoFacultad());
            
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
    
    public void modificarCarrera(Carrera ca)
    {
        try 
        {
            this.conectar();
            String sql = "call modificarCarrera(?,?,?,?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, ca.getCodigoCarrera());
            pre.setString(2, ca.getNombre());
            pre.setInt(3, ca.getCantidadMaterias());
            pre.setInt(4, ca.getCodigoFacultad());
            
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
    
    public void deleteLogicoCarrera(Carrera ca)
    {
        try 
        {
            this.conectar();
            String sql = "call papeleraCarrera(?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, ca.getCodigoCarrera());
            
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
    
    public void eliminarCarrera(Carrera ca)
    {
        try 
        {
            this.conectar();
            String sql = "call eliminarCarrera(?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, ca.getCodigoCarrera());
            
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
    
    public List mostrarCarrera()
    {
        List<Carrera> lista=new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call mostrarCarrera()";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next())
            {
                Carrera car = new Carrera();
                car.setCodigoCarrera(res.getInt("codigoCarrera"));
                car.setNombre(res.getString("nombre"));
                car.setCantidadMaterias(res.getInt("cantidadMaterias"));
                car.setCodigoFacultad(res.getInt("codigoFacultad"));
                lista.add(car);
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
    
    public List mostrarPapeleraCarrera()
    {
        List<Carrera> lista = new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call mostrarPapeleraCarrera();";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next())
            {
                Carrera car = new Carrera();
                car.setCodigoCarrera(res.getInt("codigoCarrera"));
                car.setNombre(res.getString("nombre"));
                car.setCantidadMaterias(res.getInt("cantidadMaterias"));
                car.setCodigoFacultad(res.getInt("codigoFacultad"));
                lista.add(car);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar papelera: "+e.getMessage());
        }
        return lista;
    }
    
    public Carrera buscarPapeleraCarrera(int idCarrera)
    {
        Carrera car = new Carrera();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarPapeleraCarrera(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idCarrera);
            res = pre.executeQuery();
            while(res.next())
            {
                car.setCodigoCarrera(res.getInt("codigoCarrera"));
                car.setNombre(res.getString("nombre"));
                car.setCantidadMaterias(res.getInt("cantidadMaterias"));
                car.setCodigoFacultad(res.getInt("codigoFacultad"));
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return car;
    }
    
    public List buscarPapeleraCarreraTabla(int idCarrera)
    {
        List<Carrera> lista=new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarPapeleraCarrera(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idCarrera);
            res = pre.executeQuery();
            while(res.next())
            {
                Carrera car = new Carrera();
                car.setCodigoCarrera(res.getInt("codigoCarrera"));
                car.setNombre(res.getString("nombre"));
                car.setCantidadMaterias(res.getInt("cantidadMaterias"));
                car.setCodigoFacultad(res.getInt("codigoFacultad"));
                lista.add(car);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return lista;
    }
    
    public Carrera buscarCarrera(int idCarrera)
    {
        Carrera car = new Carrera();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarCarrera(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idCarrera);
            res = pre.executeQuery();
            while(res.next())
            {
                car.setCodigoCarrera(res.getInt("codigoCarrera"));
                car.setNombre(res.getString("nombre"));
                car.setCantidadMaterias(res.getInt("cantidadMaterias"));
                car.setCodigoFacultad(res.getInt("codigoFacultad"));
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return car;
    }
    
    public List buscarCarreraTabla(String carrera)
    {
        List<Carrera> lista = new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarCarreraNombre(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setString(1,carrera);
            res = pre.executeQuery();
            while(res.next())
            {
                Carrera car = new Carrera();
                car.setCodigoCarrera(res.getInt("codigoCarrera"));
                car.setNombre(res.getString("nombre"));
                car.setCantidadMaterias(res.getInt("cantidadMaterias"));
                car.setCodigoFacultad(res.getInt("codigoFacultad"));
                lista.add(car);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return lista;
    }
}

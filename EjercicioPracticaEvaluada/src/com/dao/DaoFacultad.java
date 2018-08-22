package com.dao;

import com.conexion.Conexion;
import com.modelo.Facultad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: DaoFacultad
 * Versión: 1.0
 * Fecha de Creación:19 de Agosto de 2018
 * CopyRight: ITCA-FEPADE
 * @author Benjamín Ramirez
 */
public class DaoFacultad extends Conexion{
    
    public void insertarFacultad(Facultad fa)
    {
        try 
        {
            this.conectar();
            String sql = "call insertarFacultad(?,?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setString(1, fa.getNombre());
            pre.setString(2, fa.getTelefono());
            
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
    
    public void modificarFacultad(Facultad fa)
    {
        try 
        {
            this.conectar();
            String sql = "call modififaFacultad(?,?,?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, fa.getCodigoFacultad());
            pre.setString(2, fa.getNombre());
            pre.setString(3, fa.getTelefono());
            
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
    
    public void deleteLogicoFacultad(Facultad fa)
    {
        try 
        {
            this.conectar();
            String sql = "call papeleraFacultad(?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, fa.getCodigoFacultad());
            
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
    
    public void eliminarFacultad(Facultad fa)
    {
        try 
        {
            this.conectar();
            String sql = "call eliminarFacultad(?)";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1, fa.getCodigoFacultad());
            
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
    
    public List mostrarFacultad()
    {
        List<Facultad> lista=new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call mostrarFacultad()";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next())
            {
                Facultad fa = new Facultad();
                fa.setCodigoFacultad(res.getInt("codigoFacultad"));
                fa.setNombre(res.getString("nombre"));
                fa.setTelefono(res.getString("telefono"));
                lista.add(fa);
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
    
    public List mostrarPapeleraFacultad()
    {
        List<Facultad> lista = new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call mostrarPapeleraFacultad();";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            res = pre.executeQuery();
            while(res.next())
            {
                Facultad fa = new Facultad();
                fa.setCodigoFacultad(res.getInt("codigoFacultad"));
                fa.setNombre(res.getString("nombre"));
                fa.setTelefono(res.getString("telefono"));
                lista.add(fa);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar papelera: "+e.getMessage());
        }
        return lista;
    }
    
    public Facultad buscarPapeleraFacultad(int idFacultad)
    {
        Facultad fa = new Facultad();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarPapeleraFacultad(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idFacultad);
            res = pre.executeQuery();
            while(res.next())
            {
                fa.setCodigoFacultad(res.getInt("codigoFacultad"));
                fa.setNombre(res.getString("nombre"));
                fa.setTelefono(res.getString("telefono"));
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return fa;
    }
    
    public List buscarPapeleraFacultadTabla(int idFacultad)
    {
        List<Facultad> lista=new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarPapeleraFacultad(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idFacultad);
            res = pre.executeQuery();
            while(res.next())
            {
                Facultad fa = new Facultad();
                fa.setCodigoFacultad(res.getInt("codigoFacultad"));
                fa.setNombre(res.getString("nombre"));
                fa.setTelefono(res.getString("telefono"));
                lista.add(fa);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return lista;
    }
    
    public Facultad buscarFacultad(int idFacultad)
    {
        Facultad fa = new Facultad();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarFacultad(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idFacultad);
            res = pre.executeQuery();
            while(res.next())
            {
                fa.setCodigoFacultad(res.getInt("codigoFacultad"));
                fa.setNombre(res.getString("nombre"));
                fa.setTelefono(res.getString("telefono"));
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return fa;
    }
    
    public List buscarFacultadTabla(int idFacultad)
    {
        List<Facultad> lista = new ArrayList();
        ResultSet res;
        try 
        {
            this.conectar();
            String sql = "call buscarFacultad(?);";
            PreparedStatement pre = this.getCon().prepareCall(sql);
            pre.setInt(1,idFacultad);
            res = pre.executeQuery();
            while(res.next())
            {
                Facultad fa = new Facultad();
                fa.setCodigoFacultad(res.getInt("codigoFacultad"));
                fa.setNombre(res.getString("nombre"));
                fa.setTelefono(res.getString("telefono"));
                lista.add(fa);
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al buscar en papelera: "+e.getMessage());
        }
        return lista;
    }
    
}

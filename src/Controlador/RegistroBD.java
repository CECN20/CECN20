/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Conexion.ConexionSuper;
import Modelo.Empleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Eduardo
 */
public class RegistroBD {
   
    
    

    public List<Empleados> listar() {
        List<Empleados> empleados1 = new ArrayList<>();

        String query = "SELECT rut, nombres, apellido_paterno, apellido_materno,"
                + " tipo_empleado,telefono from SUPERNUMEROUNO ";

        try {

            PreparedStatement ps = ConexionSuper.getConnection().prepareStatement(query);
            ResultSet zz = ps.executeQuery();

            while (zz.next()) {

                Empleados listem = new Empleados();
                listem.setRut(zz.getString("rut"));
                listem.setNombres(zz.getString("nombres"));
                listem.setApellido_paterno(zz.getString("apellido_paterno"));
                listem.setApellido_materno(zz.getString("apellido_materno"));
                listem.setTipo_empleado(zz.getString("tipo_empleado"));
                listem.setTelefono(zz.getString("telefono"));
                empleados1.add(listem);
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return empleados1;

    }

    public Empleados BusquedaRut(String rut) {
        

        Empleados listem = null;

        String query = "SELECT rut, nombres, apellido_paterno, apellido_materno,"
                + " tipo_empleado,telefono from SUPERNUMEROUNO where rut = ?";

        try {

            PreparedStatement ps = ConexionSuper.getConnection().prepareStatement(query);

            int i = 1;
            ps.setString(i++, rut);

            ResultSet hp = ps.executeQuery();

            while (hp.next()) {

                listem = new Empleados();
                listem.setRut(hp.getString("rut"));
                listem.setNombres(hp.getString("nombres"));
                listem.setApellido_paterno(hp.getString("apellido_paterno"));
                listem.setApellido_materno(hp.getString("apellido_materno"));
                listem.setTipo_empleado(hp.getString("tipo_empleado"));
                listem.setTelefono(hp.getString("telefono"));
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        }
        return listem;
    }

        public boolean eliminar(String rut){  
        boolean resultado = false;
        
        String query = "Delete from Supernumerouno where rut = ?";
    
        try{
        
            PreparedStatement  ps = ConexionSuper.getConnection().prepareStatement(query);
            int i = 1;
            ps.setString(i++, rut);
            
            ps.execute();
            resultado = true;
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }

        return resultado;
    }
        public static void validandoTama(String texto,
                                         int comienzo,
                                         int termina,
                                         String nombreCampo) throws Exception{
    
        
        if(texto.length() < comienzo ||
                texto.length() > termina){
        
            String mensajeError = "EL TAMAÑO DE " +
                    nombreCampo + " DEBE SER MAYOR QUE "  +
                    comienzo + " Y MENOR QUE " +
                    termina;
            
            throw new Exception(mensajeError);
        }        
    }
    
    public void campoVacio(String texto, 
            String nombreCampo) throws Exception{
    
        
        if(texto == null || "".equals(texto)){
            
            String mensajeError = "DEBE INGRESAR " +
                    "INFORMACIÓN EN EL CAMPO " + 
                    nombreCampo;
            
            throw new Exception(mensajeError);
        }
        
    }
}

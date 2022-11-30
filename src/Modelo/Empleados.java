/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Carlos Eduardo
 */
public class Empleados {
   private String rut, nombres,apellido_paterno,apellido_materno, tipo_empleado, telefono;

    public Empleados(String rut, String nombres, String apellido_paterno, String apellido_materno, String tipo_empleado, String telefono) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.tipo_empleado = tipo_empleado;
        this.telefono = telefono;
    }

    public Empleados() {
          this.rut = "";
        this.nombres = "";
        this.apellido_paterno = "";
        this.apellido_materno = "";
        this.tipo_empleado = "";
        this.telefono = "";
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getTipo_empleado() {
        return tipo_empleado;
    }

    public void setTipo_empleado(String tipo_empleado) {
        this.tipo_empleado = tipo_empleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }




    public void mostrar(){
        System.out.println("Rut: " + this.rut + "\n"+
                           "Nombres: " + this.nombres + "\n"+
                           "apellido_paterno: " + this.apellido_paterno + " " + 
                                                  this.apellido_materno + "\n" +
                           "Tipo De Empleado: " + this.tipo_empleado + "\n" +
                           "telefono" +this.telefono);
                          // "Contrato" + this.IndefinidoToString(contrato)+"\n";

              
    }

    
   
   
   
   
   
   
}

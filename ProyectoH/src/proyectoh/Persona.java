/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoh;

import java.util.Date;

/**
 *
 * @author facu
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private String DNI;
    private String diaDeIngreso;
    private String diaDeSalida;
    String dias;
    
    //constructor vacio. 
    public Persona(){
    }
    
    //contructor con parametros.
    public Persona(String nombre, String apellido, String dni, String nacionalidad, String diaDeIngreso, String diaDeSalida , String dias){
       this.nombre = nombre;
       this.apellido = apellido;
       this.nacionalidad = nacionalidad;
       this.DNI = dni;
       this.diaDeIngreso = diaDeIngreso;
       this.diaDeSalida = diaDeSalida;
       this.dias = dias;
        
    }
    
    // Metodos persona
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setdni(String dni){
        this.DNI = dni;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
     public void setdiaDeIngreso(String diaDeIngreso){
        this.diaDeIngreso = diaDeIngreso;
    } 
     public void setdiaDeSalida(String diaDeSalida){
        this.diaDeSalida = diaDeSalida;
    }
    //Metodos get.
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public String getdni(){
        return DNI;
    }
    public String getdiaDeIngreso(){
        return diaDeIngreso;
    }
    public String getdiaDesalida(){
        return diaDeSalida;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
    
    @Override
    public String toString() {
        String send = 
               "Nombre : " + nombre +
               "\nApellido : " + apellido +
               "\nNacionalidad : " + nacionalidad +
               "\nDNI : " + DNI +
               "\nDia de Ingreso :" + diaDeIngreso +
               "\nDia de Salida :" + diaDeSalida +
                "\nDias de opedaje hospedaje :" + dias;
        return send;
    }
    
}
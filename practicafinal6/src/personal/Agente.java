/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import com.sun.org.apache.xml.internal.serializer.ToStream;
import java.io.Serializable;

/**
 *
 * @author alumno
 */
public class Agente implements Serializable{
    protected String nombre;
    protected double salario;
    protected int edad;
    protected String direccion;

    public Agente(String nombre, double salario, int edad, String direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        String datos="";
        
        datos="Nombre: "+nombre+" Edad: "+edad+" Salario: "+salario+" Dirección: "+direccion+"";
        
        return datos;
    }


    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author alumno
 */
public class Jefazo extends Agente{
    protected int añosMandato;

    public Jefazo(int añosMandato, String Nombre, double salario, int edad, String direccion) {
        super(Nombre, salario, edad, direccion);
        this.añosMandato = añosMandato;
    }

      @Override
    public String toString() {
        String datos="";
        
        datos="********************************"+
               "\n Nombre: "+nombre+
               "\n Edad: "+edad+
               "\n Dirección: "+direccion+
                "\n Salario: "+salario+"€"+
                
               "\n Años de mandato: "+añosMandato+
               "\n ********************************";
        
        return datos;
    }
   

    
}

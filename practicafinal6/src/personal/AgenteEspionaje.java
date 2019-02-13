/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import ioDatos.Ficheros;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class AgenteEspionaje extends Agente{
    ArrayList<String> vPisos;

    public AgenteEspionaje(ArrayList<String> vPisos, String nombre, double salario, int edad, String direccion) {
        super(nombre, salario, edad, direccion);
        this.vPisos = Ficheros.leerDatosArmasPisos("pisos.txt");
    }

  
    
}

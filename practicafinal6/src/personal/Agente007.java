/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Agente007 extends Agente{
    private int muertes;
      ArrayList<String> vArmas = new ArrayList();

    public Agente007(int muertes, String Nombre, double salario, int edad, String direccion) {
        super(Nombre, salario, edad, direccion);
        this.muertes = muertes;
    }
      
}

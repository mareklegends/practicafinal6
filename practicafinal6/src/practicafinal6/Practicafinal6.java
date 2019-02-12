/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal6;

import java.util.ArrayList;
import java.util.Scanner;
import personal.Agente;

/**
 *
 * @author alumno
 */
public class Practicafinal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      //Inicializa
      ArrayList<Agente> vAgentes = ioDatos.Ficheros.leerAgentes();
      //ArrayList<String> vPisos = ioDatos.Ficheros.leerPisos();
      //ArrayList<String> vArmas = ioDatos.Ficheros.leerArmas();
        
      int opc = 9;       
       
        do{
            opc = Menu.Menu.mostrarMenu();
           switch(opc){
               case 1:
                   System.out.println("1- Ver todos los agentes con su información");
                   break;                   
               case 2:
                   System.out.println("2- Ver los agentes que ganen más de una cantidad X");
                   break;
               case 3:
                   System.out.println("3- Dar de alta un nuevo piso");
                   break;
               case 4:
                   System.out.println("4- Dar de alta una nueva arma");
                   break;
               case 5:
                   System.out.println("5- Dar de alta un nuevo agente");
                   break;
               case 6:
                   System.out.println("6- Encriptar toda la información");
                   break;
               case 7:
                   System.out.println("7- Desencriptar toda la información");
                   break;
               case 8:
                   System.out.println("Saliendo de la aplicación");
                   break;                   
           }
       }while(opc!=8);
       
    }
    
}

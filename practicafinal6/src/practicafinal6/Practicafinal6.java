/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicafinal6;

import java.util.ArrayList;
import java.util.Scanner;
import personal.Agente;
import personal.Jefazo;

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
                   System.out.println(".--------- .---------- .------");
                   for (Agente vAgente : vAgentes) {
                       System.out.println(vAgente.toString());
                   }
                   break;                   
               case 2:
                   System.out.println("2- Ver los agentes que ganen más de una cantidad X");
                   System.out.println(".--------- .---------- .------");
                   break;
               case 3:
                   System.out.println("3- Dar de alta un nuevo piso");
                   System.out.println(".--------- .---------- .------");
                   break;
               case 4:
                   System.out.println("4- Dar de alta una nueva arma");
                   System.out.println(".--------- .---------- .------");
                   break;
               case 5:
                   System.out.println("5- Dar de alta un nuevo agente");
                   System.out.println(".--------- .---------- .------");
                   
                   int opc2 = 5;       
       
                            do{
                                opc2 = Menu.MenuAgente.mostrarMenu();
                               switch(opc2){
                                   case 1:
                                       System.out.println("1- Añadir un Jefazo");
                                       System.out.println(".--------- .---------- .------");
                                       System.out.println("--Años de mandato");
                                        Scanner leerañosmandato = new Scanner(System.in);
                                        int añosmandato = leerañosmandato.nextInt();
                                       System.out.println("--Nombre del jefazo");
                                        Scanner leernombrejefazo = new Scanner(System.in);
                                        String nombrejefazo = leernombrejefazo.nextLine();
                                       System.out.println("--Sueldo del jefazo");
                                        Scanner leersueldojefazo = new Scanner(System.in);
                                        double sueldojefazo = leernombrejefazo.nextDouble();
                                       System.out.println("--Edad del jefazo");
                                        Scanner leeredadjefazo = new Scanner(System.in);
                                        int edadjefazo = leeredadjefazo.nextInt();
                                       System.out.println("--Dirección del jefazo");
                                        Scanner leerdireccionjefazo = new Scanner(System.in);
                                        String direccionjefazo = leerdireccionjefazo.nextLine();
                                        
                                       Jefazo j = new Jefazo(añosmandato, nombrejefazo, sueldojefazo, edadjefazo, direccionjefazo);
                                       vAgentes.add(j);
                                       ioDatos.Ficheros.guardarAgente(vAgentes);
                                       break;                   
                                   case 2:
                                       System.out.println("2- Añadir un Agente007");
                                       System.out.println(".--------- .---------- .------");
                                       break;
                                   case 3:
                                       System.out.println("3- Añadir un AgenteEspionaje");
                                       System.out.println(".--------- .---------- .------");
                                       break;
                                   case 4:                                                                          
                                       System.out.println(">>>> Saliendo del submenu");
                                       break;                   
                               }
                           }while(opc2!=4);
                   
                   break;
               case 6:
                   System.out.println("6- Encriptar toda la información");
                   System.out.println(".--------- .---------- .------");
                   break;
               case 7:
                   System.out.println("7- Desencriptar toda la información");
                   System.out.println(".--------- .---------- .------");
                   break;
               case 8:
                   System.out.println(">>>> Saliendo de la aplicación");
                   break;                   
           }
       }while(opc!=8);
       
    }
    
}

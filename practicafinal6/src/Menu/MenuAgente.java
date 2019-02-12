/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class MenuAgente {
    public static int mostrarMenu(){
        int opc2=0;
            Scanner leer = new Scanner(System.in);
        
        while((opc2<1) || (opc2>4)){
              try{
            System.out.println("--------------------------------");
            System.out.println("1- Añadir un Jefazo");
            System.out.println("2- Añadir un Agente007");
            System.out.println("3- Añadir un AgenteEspionaje");
            System.out.println("4- Salir del submenu");            
            System.out.println("--------------------------------");
               System.out.println("¿Dime que quieres hacer?");
             opc2=leer.nextInt();  
               
          
          
            }catch(Exception e){
                System.out.println("Error al leer la opción");
            }
        }
        
        return opc2;
    }
}

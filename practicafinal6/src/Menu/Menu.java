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
public class Menu {
    
    public static int mostrarMenu(){
        int opc=10;
        
        while(opc>0 || opc<=8){
            
            System.out.println("********************************");
            System.out.println("1- Ver todos los agentes con su información");
            System.out.println("2- Ver los agentes que ganen más de una cantidad X");
            System.out.println("3- Dar de alta un nuevo piso");
            System.out.println("4- Dar de alta una nueva arma");
            System.out.println("5- Dar de alta un nuevo agente");
            System.out.println("6- Encriptar toda la información");
            System.out.println("7- Desencriptar toda la información");
            System.out.println("8- Salir");
            
            System.out.println("********************************");
            
            
            
            try{
                Scanner leer = new Scanner(System.in);
            }catch(Exception e){
                System.out.println("Error al leer la opción");
            }
        }
        
        return opc;
    }
}

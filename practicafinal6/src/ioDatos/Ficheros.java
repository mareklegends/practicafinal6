package ioDatos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import personal.Agente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Ficheros {
    
    
    //leer y relleganar el arrylist de agentes
   public static ArrayList<Agente> leerAgentes(){
        File f = new File("Recursos/agentes.txt");
        FileInputStream fi = null;
        ObjectInputStream salida = null;
        ArrayList<Agente> vAgentes = new ArrayList();
        
         if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo");
            }
        }
           
       try {
           fi = new FileInputStream(f);
           salida = new ObjectInputStream(fi);
           while(true){
             Agente a = (Agente)salida.readObject();
             vAgentes.add(a);
           }
       } catch (FileNotFoundException ex) {
            System.out.println("Error al leer el archivo");
       } catch (IOException ex) {
           System.out.println("");
            //System.out.println("Fin de lectura");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
            try {
                if (salida!=null)
                    salida.close();
            } catch (IOException ex) {
                 System.out.println("Error al cerrar el programa");
            }
       } 
        
        return vAgentes;
   }
   
   //guardas los nuevos agentes en el arrylist
    public static void guardarAgente(ArrayList<Agente> vAgentes){
         File f = new File("Recursos/agentes.txt");
        FileOutputStream fi = null;
        ObjectOutputStream entrada = null;

        
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo");
            }
        }
        
        if (f.exists()) {
            try {
                fi = new FileOutputStream(f,true);
                entrada = new ObjectOutputStream(fi);
              
                 for (Agente vAgente : vAgentes) {
                    entrada.writeObject(vAgente);
                }
              
                
            } catch (FileNotFoundException ex) {
                System.out.println("Error al escribir en el archivo");
            } catch (IOException ex) {
                System.out.println("Error al añadir los datos");
            }finally{
                try{
                    entrada.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
              
            
        }
    }
}

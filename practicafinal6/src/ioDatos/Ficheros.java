package ioDatos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
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
                fi = new FileOutputStream(f);
                entrada = new ObjectOutputStream(fi);
              
                 for (Agente v : vAgentes) {
                    entrada.writeObject(v);
                }
              
                
            } catch (FileNotFoundException ex) {
                System.out.println("Error al escribir en el archivo");
            } catch (IOException ex) {
                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                try{
                    entrada.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo");
                }
            }
              
            
        }
    }
    
    //leer y añadir el array de armas
    
    public static ArrayList<String> leerDatosArmasPisos(String f){
         ArrayList<String> vArmasPisos = new ArrayList();
        
         File fic = new File(f);
          Scanner leer=null;    
     
      
        if (!fic.exists()) {
             try {
                 fic.createNewFile();
             } catch (IOException ex) {
                 System.out.println("Error al crear el archivo");
             }
        }
          if (fic.exists()) {
             try {
                 leer = new Scanner(fic);
                 
                  while(leer.hasNext()){
            String dato = leer.nextLine();
            vArmasPisos.add(dato);
            }
             } catch (FileNotFoundException ex) {
                 System.out.println("Error al leer el archivo");
             }
        }
         
         return vArmasPisos;
         
    }
    
    
     public static void guardarDatosArmasPisos(ArrayList<String> vArmasPisos, String fichero){
        File f = null;
        FileWriter fw = null;
        PrintWriter escribir = null;
        
        f = new File(fichero);
        
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo");
            }
        }
        
        try {
            fw = new FileWriter(f);
            escribir = new PrintWriter(fw);
            
            for (int i = 0; i < vArmasPisos.size(); i++) {
                escribir.println(vArmasPisos.get(i));
            }
            
            
            
        } catch (IOException ex) {
            System.out.println("Error al escribir en fichero");
        }finally{
            if (escribir != null) {
                escribir.close();
            }
        }
        
        
    }
     
     
     //encriptar los archivos
     
     public static void encriptarArhivos(ArrayList<Agente> vAgentes,ArrayList<String> vArmas, ArrayList<String> vPisos, String nombre){
         
         File f = new File(nombre);
         f.getParentFile().listFiles();
         
     }
    
}

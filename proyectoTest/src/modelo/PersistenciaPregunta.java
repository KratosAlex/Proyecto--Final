
package modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class PersistenciaPregunta {
      public static void guardar(Pregunta p) throws Exception {
        //static: cuando declaramos algo static significa que al ejecutar el programa 
        //lo primero que va a ejecutar es todo lo que tiene static por ejemplo el psvm
        //lo estatico tambien es compartido entre clases
        //Exception es un error en tiempo de ejecucion

        //paso 1: Generar el archivo donde se va a guardar nuestro seializado}
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("KratosAlex");
        if(file.exists())preguntas= leer();
        preguntas.add(p);
        //paso 2:Indicar que lo vamos a generar para escribir en el
        FileOutputStream fos = new FileOutputStream(file);
        //paso 3:Escribir un objeto en el
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);        
        oos.close();
    }

    //Ahora vamos a leer el archivo que previamente creamos, como vamos a regresar un objeto del tipo cliente,
    //en lugar de void sera Cliente
    
    public static ArrayList<Pregunta> leer() throws Exception {
        //Primero asignamos la ruta del archivo que vamos a leer
        File file = new File("KratosAlex");
        //
        FileInputStream fis = new FileInputStream(file);
        //
        ObjectInputStream ois = new ObjectInputStream(fis);
        //
        ArrayList<Pregunta> preguntas =  (ArrayList<Pregunta>) ois.readObject();
        
        return preguntas;
    }
    
    public static  ArrayList<Opcion>
            opcionesAletorias(ArrayList<Opcion> opciones){
            
            ArrayList<Opcion> opcionesAleatorias = new ArrayList<>();
            
             Set<Integer> enteros = new LinkedHashSet<>();
        //al imprimir es un 2 porque quita los repetidos gracias al 
        //si ya existe un numero no lo agreges y vuelvelo a hacer
        while (enteros.size() < 4) {
            Random r = new Random();
            int valor = r.nextInt(4);
            enteros.add(valor);
            System.out.println(valor);
            }
                
            for(Integer i: enteros){
                opcionesAleatorias.add(opciones.get(i));
            }
          return opcionesAleatorias;
                
            
}
            
              public static void borrar(int indice) throws Exception {
        //static: cuando declaramos algo static significa que al ejecutar el programa 
        //lo primero que va a ejecutar es todo lo que tiene static por ejemplo el psvm
        //lo estatico tambien es compartido entre clases
        //Exception es un error en tiempo de ejecucion

        //paso 1: Generar el archivo donde se va a guardar nuestro seializado}
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("KratosAlex");
        if(file.exists())preguntas= leer();
        preguntas.remove(indice);
        //paso 2:Indicar que lo vamos a generar para escribir en el
        FileOutputStream fos = new FileOutputStream(file);
        //paso 3:Escribir un objeto en el
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);        
        oos.close();
    }
              
              public static void actualizar(Pregunta p) throws Exception {
        //static: cuando declaramos algo static significa que al ejecutar el programa 
        //lo primero que va a ejecutar es todo lo que tiene static por ejemplo el psvm
        //lo estatico tambien es compartido entre clases
        //Exception es un error en tiempo de ejecucion

        //paso 1: Generar el archivo donde se va a guardar nuestro seializado}
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        File file = new File("KratosAlex");
        if(file.exists())preguntas= leer();
        preguntas.add(p);
        //paso 2:Indicar que lo vamos a generar para escribir en el
        FileOutputStream fos = new FileOutputStream(file);
        //paso 3:Escribir un objeto en el
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(preguntas);        
        oos.close();
    }
}
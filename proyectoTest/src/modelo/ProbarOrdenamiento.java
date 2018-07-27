/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author T-101
 */
public class ProbarOrdenamiento {

    public static void main(String[] args) {
        //} while (true valor=0);
        //Este arreglo no acepta duplicados
        Set<Integer> enteros = new LinkedHashSet<>();
        //al imprimir es un 2 porque quita los repetidos gracias al 
        //si ya existe un numero no lo agreges y vuelvelo a hacer
        while (enteros.size() < 4) {
            Random r = new Random();
            int valor = r.nextInt(4);
            enteros.add(valor);
            System.out.println(valor);
            }
         for (Integer i: enteros){
         //  System.out.println(enteros.);
        }
    }
}

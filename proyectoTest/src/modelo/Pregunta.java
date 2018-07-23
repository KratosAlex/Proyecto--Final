
package modelo;

import java.io.Serializable;
import java.util.*;


public class Pregunta implements  Serializable {

    private String titulo;
    private ArrayList<Opcion> opciones;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public Pregunta() {
    }

    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    
}

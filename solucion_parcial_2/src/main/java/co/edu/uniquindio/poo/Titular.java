package co.edu.uniquindio.poo;

/*
 * Clase que contiene la informacion de un Titular
 */

public class Titular {
    private final String nombres;
    private final String apellidos;

    /*
     * Método constructor de la clase Titular
     */
    public Titular(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    /*
     * Método para obtener el nombre del Titular
     */
    public String getNombres() {
        return nombres;
    }

    /*
     * Método para obtener los apellidos del Titular
     */
    public String getApellidos() {
        return apellidos;
    }


    
    
}

package co.edu.uniquindio.poo;

import java.util.Collection;
/*
 * Clase principal la cual contiene la informacion de un Banco
 */
public class Banco {
    private final String nombre;
    private final CuentaBancaria cuentaBancaria;
    private final Collection<Titular> listaTitulares;

    /*
     * Método constructor de la clase Banco
     */
    public Banco(String nombre, CuentaBancaria cuentaBancaria, Collection<Titular> listaTitulares) {
        this.nombre = nombre;
        this.cuentaBancaria = cuentaBancaria;
        this.listaTitulares = listaTitulares;
    }

    /*
     * Método para obtener el nombre del Banco
     */
    public String getNombre() {
        return nombre;
    }

    /*
     * Método para obtener la cuentaBancaria de dicho banco
     */
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    /*
     * Método para obtener la lista de titulares
     */
    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }

    public void transferirDinerio (CuentaBancaria cuentaDeOrigen, CuentaBancaria cuentaDeDestino){
        
    }
    
}

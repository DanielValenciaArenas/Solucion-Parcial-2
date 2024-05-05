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

    /*
     * Método para consultar el saldo de una cuenta 
     */
    public double consultarSaldo (CuentaBancaria cuentaBancaria){
        if(cuentaBancaria.getEstado() == true){
            return cuentaBancaria.getSaldo();
        }
        else {
            return 0.0;
        }
    }

    /*
     * Método para transferir dinero de una cuenta a otra
     */
    public void transferirDinerio (CuentaBancaria cuentaDeDestino, double cantidad){
        assert cantidad > 0:"El dinero a transferir no puede ser negativo";
        
        if(this.cuentaBancaria.getNumeroCuenta() != null && cuentaDeDestino.getNumeroCuenta() != null){
            if(this.cuentaBancaria.getSaldo() >= cantidad){
                if(cuentaDeDestino.getEstado()==true){
                    this.cuentaBancaria.retirar(cantidad);
                    cuentaDeDestino.depositar(cantidad);
                }
                else{
                    System.out.println("La cuenta de destino está inactiva");
                }
            }
            else{
                System.out.println("Saldo insuficiente para realizar la transferencia o la cuenta está inactiva (saldo en 0)");
            }
        }
        else{
            System.out.println("Una de las cuentas no existe (no tiene un número de cuenta)");
        }
   }
}

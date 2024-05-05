package co.edu.uniquindio.poo;

import java.util.Collection;

/*
 * Clase abstracta que agrupa los datos de una Cuenta Bancaria con sus metodos
 */
public abstract class CuentaBancaria {
    private final Titular titular;
    private final int numeroCuenta;
    public double saldo;
    public boolean estado;
    private final Collection<Transaccion> listaTransacciones;

    /*
     * Método constructor de la clase CuentaBancaria
     */
    public CuentaBancaria(Titular titular, int numeroCuenta, double saldo, boolean estado,
            Collection<Transaccion> listaTransacciones) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.listaTransacciones = listaTransacciones;
    }

    /*
     * Método para obtener el titular de la cuenta bancaria
     */
    public Titular getTitular() {
        return titular;
    }

    /*
     * Método para obtener el numero de la cuenta bancaria
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /*
     * Método para obtener el saldo de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /*
     * Método para modificar el saldo de la cuenta bancaria
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /*
     * Método para obtener el estado de la cuenta con valor booleano (True ó False)
     */
    public boolean isEstado() {
        return estado;
    }

    /*
     * Método para cambiar (actualizar) el estado de la cuenta bancaria
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /*
     * Método para obtener la lista (colección) de las transacciones de la cuenta bancaria
     */
    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    /*
     * Método para depositar dinero en una cuenta bancaria (que no sea negativo)
     */
    public void depositar (double valor){
        assert valor > 0:"El valor ingresado no puede ser negativo, intente de nuevo";
        saldo = saldo + valor;
        estado = true;
    }

    /*
     * Método abstracto para definir que toda cuenta bancaria debe tener un método retirar
     */
    public abstract void retirar (double valor);

    /*
     * Método para consultar el saldo de una cuenta
     */
    public double consultarSaldo (){
        if(estado == true){
            System.out.println("El saldo de la cuenta es: ");
            return saldo;
        }
        else {
            System.out.println("La cuenta está inactiva");
            return 0.0;
        }
    }

    

    
    
}

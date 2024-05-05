package co.edu.uniquindio.poo;

import java.util.Collection;
/*
 * Calse extendida que agrupa los datos de una Cuenta Corriente
 */
public class CuentaCorriente extends CuentaBancaria {
    public double sobregiro;

    /*
     * Método constructor de la clase CuentaCorriente
     */
    public CuentaCorriente(Titular titular, int numeroCuenta, double saldo, boolean estado,
            Collection<Transaccion> listaTransacciones, double sobregiro) {
        super(titular, numeroCuenta, saldo, estado, listaTransacciones);
        this.sobregiro = sobregiro;
    }

    /*
     * Método para obtener el sobregiro de la cuenta corriente
     */
    public double getSobregiro() {
        return sobregiro;
    }

    /*
     * Método para cambiar(actualizar) el valor del sobregiro de la cuenta corriente
     */
    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }
    /*
     * Método heredado que define el retiro del dinero en una cuenta corriente
     */
    @Override
    public void retirar(double valor) {
        assert valor > 0;
        assert valor <= saldo;
        saldo = saldo - valor;
        if(saldo == 0) estado = false;
        double sobregiroGastado = valor - saldo;
        double nuevoSobregiro = sobregiro - sobregiroGastado;
        sobregiro = nuevoSobregiro;
    }
    

    


    

    
    
}

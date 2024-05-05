package co.edu.uniquindio.poo;

import java.util.Collection;

/*
 * Clase extendida que agrupa los datos de una Cuenta de Ahorros
 */
public class CuentaAhorros extends CuentaBancaria {
    private final double tasaIntentres;

    /*
     * Método constructor de la clase CuentaAhorros
     */
    public CuentaAhorros(Titular titular, int numeroCuenta, double saldo, boolean estado,
            Collection<Transaccion> listaTransacciones, double tasaIntentres) {
        super(titular, numeroCuenta, saldo, estado, listaTransacciones);
        this.tasaIntentres = tasaIntentres;
    }

    /*
     * Método para obtener la tasa de interes de la cuenta de ahorros
     */
    public double getTasaIntentres() {
        return tasaIntentres;
    }

    /*
     * Método heredado que define el retiro del dinero en una cuenta de ahorros
     */
    @Override
    public void retirar(double valor) {
        assert valor > 0;
        assert valor <= saldo;
        saldo = saldo - valor;
        if(saldo == 0) estado = false;
    }

    

    

    
    
    
}

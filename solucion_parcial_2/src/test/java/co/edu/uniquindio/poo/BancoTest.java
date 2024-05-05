/**
 * Clase para probar el funcionamiento del código de la clase Banco
 * @author Daniel Valencia Arenas
 * @since 2024
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BancoTest {
    private static final Logger LOG = Logger.getLogger(BancoTest.class.getName());

    @Test
    public void consultaDelSaldo() {
        LOG.info("Inicio test consultaDelSaldo");

        Titular titular = new Titular("Guillermo", "Salazar Vazquez");
        Collection<Transaccion> listaTransacciones = new LinkedList<>();
        CuentaBancaria cuenta = new CuentaAhorros(titular, "7777", 32200.0, false, listaTransacciones, 1.1);

        Collection<Titular> listaTitulares = new LinkedList<>();
        Banco banco = new Banco("Banco Davivienda", cuenta, listaTitulares);

        assertEquals(32200.0, banco.consultarSaldo(cuenta));

        LOG.info("Finalización test consultaDelSaldo");

    }

    @Test
    public void transferenciaDeDinero() {
        LOG.info("Inicio test transferenciaDeDinero");

        Titular titular1 = new Titular("Angel", "Valencia Basquez");
        Titular titular2 = new Titular("Alyssa", "Rios Suarez");

        Collection<Transaccion> listaTransaccionesCuenta1 = new LinkedList<>();
        Collection<Transaccion> listaTransaccionesCuenta2 = new LinkedList<>();

        CuentaAhorros cuenta1 = new CuentaAhorros(titular1, "90009", 1000000.0, true, listaTransaccionesCuenta1, 2.6);
        CuentaCorriente cuenta2 = new CuentaCorriente(titular2, "87654", 80000.0, true, listaTransaccionesCuenta2, 450000);


        Collection<Titular> listaTitulares = new LinkedList<>();
        listaTitulares.add(titular1);

        Banco banco = new Banco("Banco Davivienda", cuenta1, listaTitulares);
        banco.transferirDinerio(cuenta2, 978000);

        assertTrue(cuenta1.getSaldo() < cuenta2.getSaldo());
        assertEquals(22000.0, cuenta1.getSaldo());
        assertEquals(1058000.0, cuenta2.getSaldo());

        LOG.info("Finalización test transferenciaDeDinero");

    }




}
/**
 * Clase para probar el funcionamiento del código de la clase CuentaBancaria
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

public class CuentaBancariaTest {
    private static final Logger LOG = Logger.getLogger(CuentaBancariaTest.class.getName());

    @Test
    public void verificarValorNegativo() {
        LOG.info("Inicio test verificarValorNegativo");

        Titular titular = new Titular("Byron", "Goméz Goméz");
        Collection<Transaccion> listaTransacciones = new LinkedList<>();
        CuentaBancaria cuenta = new CuentaAhorros(titular, "1111", 50000.0, true, listaTransacciones, 1.5);
        cuenta.depositar(-20000);
        
        assertEquals(70000, cuenta.getSaldo());

        LOG.info("Finalización test verificarValorNegativo");

    }


}


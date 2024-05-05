/**
 * Clase para probar el funcionamiento del código de la clase CuentaAhorros
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

public class CuentaAhorrosTest {
    private static final Logger LOG = Logger.getLogger(CuentaAhorrosTest.class.getName());

    @Test
    public void retiroEnCuentaAhorros() {
        LOG.info("Inicio test retiroEnCuentaAhorros");

        Titular titular = new Titular("Marzello", "Montes Bedoya");
        Collection<Transaccion> listaTransacciones = new LinkedList<>();
        CuentaBancaria cuenta = new CuentaAhorros(titular, "54467", 220000.0, true, listaTransacciones, 1.1);
        cuenta.retirar(220000.0);
        
        assertEquals(false, cuenta.getEstado());

        LOG.info("Finalización test retiroEnCuentaAhorros");

    }
}

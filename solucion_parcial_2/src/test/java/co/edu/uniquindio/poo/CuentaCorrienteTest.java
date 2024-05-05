/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
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

public class CuentaCorrienteTest {
    private static final Logger LOG = Logger.getLogger(CuentaCorrienteTest.class.getName());

    @Test
    public void verificarValorNegativo() {
        LOG.info("Inicio test verificarValorNegativo");
        Titular titular = new Titular("Marzello", "Montes Bedoya");
        Collection<Transaccion> listaTransacciones = new LinkedList<>();
        CuentaBancaria cuenta = new CuentaAhorros(titular, 11, 50000.0, true, listaTransacciones, 1.1);
        cuenta.depositar(-20000);
        assertEquals(70000, cuenta.getSaldo());
        LOG.info("Finalización test verificarValorNegativo");

    }


}


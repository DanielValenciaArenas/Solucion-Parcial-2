/**
 * Clase para probar el funcionamiento del código de la clase CuentaCorriente
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

public class CuentaCorrienteTest {
    private static final Logger LOG = Logger.getLogger(CuentaCorrienteTest.class.getName());

    @Test
    public void retiroEnCuentaCorriente() {
        LOG.info("Inicio test retiroEnCuentaCorriente");

        Titular titular = new Titular("Karoll", "Gonzales Sevilla");
        Collection<Transaccion> listaTransacciones = new LinkedList<>();
        CuentaCorriente cuenta = new CuentaCorriente(titular, "15623", 40000.0, true, listaTransacciones, 120000.0);
        cuenta.retirar(110000.0);
        
        assertEquals(50000.0, cuenta.getSobregiro());

        LOG.info("Finalización test retiroEnCuentaCorriente");

    }


}


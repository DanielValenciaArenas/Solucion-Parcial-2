package co.edu.uniquindio.poo;

import java.time.LocalDate;
/*
 * Clase que agrupa los datos de una Transacción
 */
public class Transaccion {
    private final String codigo;
    private final double valor;
    private final LocalDate fecha;
    private final String descripcion;
    private final boolean estado;
    private final TipoTransaccion tipoTransaccion;

    /*
     * Método constructor de la clase Transaccion
     */
    public Transaccion(String codigo, double valor, LocalDate fecha, String descripcion, boolean estado,
            TipoTransaccion tipoTransaccion) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tipoTransaccion = tipoTransaccion;
    }

    /*
     * Método para obtener el codigo de la transacción
     */
    public String getCodigo() {
        return codigo;
    }

    /*
     * Método para obtener el valor realizado en la transacción
     */
    public double getValor() {
        return valor;
    }

    /*
     * Método para obtener la fecha de la transacción
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /*
     * Método para obtener la descripción de la transacción
     */
    public String getDescripcion() {
        return descripcion;
    }

    /*
     * Método para obtener el estado de la transacción
     */
    public boolean getEstado() {
        return estado;
    }

    /*
     * Método para obtener el tipo de transacción (deposito o retiro)
     */
    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    

    
    
}

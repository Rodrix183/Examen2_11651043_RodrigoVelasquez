package examen2_11651043_rodrigovelasquez;

import java.util.Date;

public class Transaccion {
    private int numero_cuenta;
    private String descripcion;
    private Date fecha;
    private String hora;

    public Transaccion() {
    }

    public Transaccion(int numero_cuenta, String descripcion, Date fecha, String hora) {
        this.numero_cuenta = numero_cuenta;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(int numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Transaccion: " + descripcion;
    }

    
    
}

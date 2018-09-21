package examen2_11651043_rodrigovelasquez;

import java.util.Date;

public class LOG {
    private String usuario;
    private String descripcion;
    private Date fecha;
    private String hora;
    private String iniciarSesion;
    private int fallos;
    private int dineroRetirado;
    private int dineroIngresado;

    public LOG() {
    }

    public LOG(String usuario, String descripcion, Date fecha, String hora, String iniciarSesion, int fallos, int dineroRetirado, int dineroIngresado) {
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.iniciarSesion = iniciarSesion;
        this.fallos = fallos;
        this.dineroRetirado = dineroRetirado;
        this.dineroIngresado = dineroIngresado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
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

    public String getIniciarSesion() {
        return iniciarSesion;
    }

    public void setIniciarSesion(String iniciarSesion) {
        this.iniciarSesion = iniciarSesion;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public int getDineroRetirado() {
        return dineroRetirado;
    }

    public void setDineroRetirado(int dineroRetirado) {
        this.dineroRetirado = dineroRetirado;
    }

    public int getDineroIngresado() {
        return dineroIngresado;
    }

    public void setDineroIngresado(int dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
}

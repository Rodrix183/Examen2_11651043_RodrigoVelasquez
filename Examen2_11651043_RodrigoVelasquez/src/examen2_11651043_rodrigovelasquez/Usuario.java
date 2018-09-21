package examen2_11651043_rodrigovelasquez;

import java.util.ArrayList;

public class Usuario {

    private int id;
    private String user;
    private String p_nombre;
    private String s_nombre;
    private String p_apellido;
    private String s_apellido;
    private String password;
    private int año_nacimiento;
    private int año_afiliacion;
    private String tipo;
    private ArrayList<Transaccion> lista_transacciones = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(int id, String user, String p_nombre, String s_nombre, String p_apellido, String s_apellido, String password, int año_nacimiento, int año_afiliacion, String tipo) {
        this.id = id;
        this.user = user;
        this.p_nombre = p_nombre;
        this.s_nombre = s_nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
        this.password = password;
        this.año_nacimiento = año_nacimiento;
        this.año_afiliacion = año_afiliacion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getP_nombre() {
        return p_nombre;
    }

    public void setP_nombre(String p_nombre) {
        this.p_nombre = p_nombre;
    }

    public String getS_nombre() {
        return s_nombre;
    }

    public void setS_nombre(String s_nombre) {
        this.s_nombre = s_nombre;
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        this.p_apellido = p_apellido;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAño_nacimiento() {
        return año_nacimiento;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

    public int getAño_afiliacion() {
        return año_afiliacion;
    }

    public void setAño_afiliacion(int año_afiliacion) {
        this.año_afiliacion = año_afiliacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Transaccion> getLista_transacciones() {
        return lista_transacciones;
    }

    public void setLista_transacciones(ArrayList<Transaccion> lista_transacciones) {
        this.lista_transacciones = lista_transacciones;
    }

    @Override
    public String toString() {
        return user;
    }
    
    
}

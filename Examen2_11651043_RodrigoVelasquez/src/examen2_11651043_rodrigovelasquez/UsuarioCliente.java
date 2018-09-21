package examen2_11651043_rodrigovelasquez;

import java.util.ArrayList;

public class UsuarioCliente extends Usuario{
    private ArrayList <Cuenta> lista_Cuentas = new ArrayList<>();

    public UsuarioCliente() {
        super();
    }

    public UsuarioCliente(int id, String user, String p_nombre, String s_nombre, String p_apellido, String s_apellido, String password, int año_nacimiento, int año_afiliacion, String tipo) {
        super(id, user, p_nombre, s_nombre, p_apellido, s_apellido, password, año_nacimiento, año_afiliacion, tipo);
    }
    
    public ArrayList<Cuenta> getLista_Cuentas() {
        return lista_Cuentas;
    }

    public void setLista_Cuentas(ArrayList<Cuenta> lista_Cuentas) {
        this.lista_Cuentas = lista_Cuentas;
    }

    @Override
    public String toString() {
        return "Lista Cuentas: " + lista_Cuentas;
    }
    
}

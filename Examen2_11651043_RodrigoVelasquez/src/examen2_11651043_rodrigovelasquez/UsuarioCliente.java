package examen2_11651043_rodrigovelasquez;

import java.util.ArrayList;

public class UsuarioCliente extends Usuario{
    private ArrayList <Cuenta> lista_Cuentas = new ArrayList<>();

    public UsuarioCliente() {
        super();
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

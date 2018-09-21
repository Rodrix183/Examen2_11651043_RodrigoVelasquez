package examen2_11651043_rodrigovelasquez;

public class Cuenta {

private int numCuenta;
private int saldoDisponible;
private int id_Propietario;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int saldoDisponible, int id_Propietario) {
        this.numCuenta = numCuenta;
        this.saldoDisponible = saldoDisponible;
        this.id_Propietario = id_Propietario;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public int getId_Propietario() {
        return id_Propietario;
    }

    public void setId_Propietario(int id_Propietario) {
        this.id_Propietario = id_Propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", saldoDisponible=" + saldoDisponible + ", id_Propietario=" + id_Propietario + '}';
    }

    

}

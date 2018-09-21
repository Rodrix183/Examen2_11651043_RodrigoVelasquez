package examen2_11651043_rodrigovelasquez;

public class ATM {

    private String ubicacion;
    private int id;
    private int year_fabricacion;
    private int tiempo_mantenimiento;
    private int dinero;

    public ATM() {
    }

    public ATM(String ubicacion, int id, int year_fabricacion, int tiempo_mantenimiento, int dinero) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.year_fabricacion = year_fabricacion;
        this.tiempo_mantenimiento = tiempo_mantenimiento;
        this.dinero = dinero;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear_fabricacion() {
        return year_fabricacion;
    }

    public void setYear_fabricacion(int year_fabricacion) {
        this.year_fabricacion = year_fabricacion;
    }

    public int getTiempo_mantenimiento() {
        return tiempo_mantenimiento;
    }

    public void setTiempo_mantenimiento(int tiempo_mantenimiento) {
        this.tiempo_mantenimiento = tiempo_mantenimiento;
    }

    @Override
    public String toString() {
        return "ATM: " + id;
    }

}

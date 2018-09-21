package examen2_11651043_rodrigovelasquez;

public class ATM {

    private String ubicacion;
    private int id;
    private int year_fabricacion;
    private int tiempo_mantenimiento;

    public ATM() {
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
        return "ATM: " +id;
    }
    
    
}

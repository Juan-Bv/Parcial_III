package Aeropuerto;

public class Compania {

    private int idCompania;
    private String nombre;

    // Constructor
    public Compania(int idCompania, String nombre) {
        this.idCompania = idCompania;
        this.nombre = nombre;
    }

    // Getters y Setters
    public int getIdCompania() {
        return idCompania;
    }

    public void setIdCompania(int idCompania) {
        this.idCompania = idCompania;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Compania [idCompania=" + idCompania + ", nombre=" + nombre + "]";
    }
}

package Aeropuerto;

public class Pasajero {

    private int idPasajero;
    private String nombre;
    private String pasaporte;
    private String nacionalidad;

    // Constructor
    public Pasajero(int idPasajero, String nombre, String pasaporte, String nacionalidad) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Pasajero [idPasajero=" + idPasajero + ", nombre=" + nombre
                + ", pasaporte=" + pasaporte + ", nacionalidad=" + nacionalidad + "]";
    }
}

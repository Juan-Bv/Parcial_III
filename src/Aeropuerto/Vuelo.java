package Aeropuerto;

public class Vuelo {

    private int idVuelo;
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaxPasajeros;

    // Getters y Setters
    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public void setNumMaxPasajeros(int numMaxPasajeros) {
        this.numMaxPasajeros = numMaxPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{"
                + "idVuelo=" + idVuelo
                + ", identificador='" + identificador + '\''
                + ", ciudadOrigen='" + ciudadOrigen + '\''
                + ", ciudadDestino='" + ciudadDestino + '\''
                + ", precio=" + precio
                + ", numMaxPasajeros=" + numMaxPasajeros
                + '}';
    }
}

package Aeropuerto;

public class Aeropuerto {
    private int id;
    private String nombre;
    private String ciudad;
    private String pais;
    private boolean privado;
    private double subvencion; // Solo para privados
    private int publico; // Solo para públicos

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getSubvencion() {
        return subvencion;
    }

    public void setSubvencion(double subvencion) {
        this.subvencion = subvencion;
    }

    public int getPublico() {
        return publico;
    }

    public void setPublico(int publico) {
        this.publico = publico;
    }

    @Override
    public String toString() {
        if (privado) {
            return "Aeropuerto{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", ciudad='" + ciudad + '\'' +
                    ", pais='" + pais + '\'' +
                    ", tipo=Privado" +
                    ", subvencion=" + subvencion +
                    '}';
        } else {
            return "Aeropuerto{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", ciudad='" + ciudad + '\'' +
                    ", pais='" + pais + '\'' +
                    ", tipo=Público" +
                    ", dinero del gobierno=" + publico +
                    '}';
        }
    }
}

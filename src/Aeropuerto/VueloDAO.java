package Aeropuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VueloDAO {

    // Método para buscar vuelos según la ciudad de origen y destino
    public List<Vuelo> listarVuelosPorCiudad(String ciudadOrigen, String ciudadDestino) {
        List<Vuelo> vuelos = new ArrayList<>();
        String consulta = "SELECT * FROM vuelos WHERE ciudadOrigen = ? AND ciudadDestino = ?";

        try (Connection conexion = ConexionBD.conectar(); PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setString(1, ciudadOrigen);
            ps.setString(2, ciudadDestino);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Vuelo vuelo = new Vuelo();
                vuelo.setIdVuelo(rs.getInt("idVuelo"));
                vuelo.setIdentificador(rs.getString("identificador"));
                vuelo.setCiudadOrigen(rs.getString("ciudadOrigen"));
                vuelo.setCiudadDestino(rs.getString("ciudadDestino"));
                vuelo.setPrecio(rs.getDouble("precio"));
                vuelo.setNumMaxPasajeros(rs.getInt("numMaxPasajeros"));

                vuelos.add(vuelo);
            }
        } catch (Exception e) {
            System.out.println("Error al listar vuelos: " + e.getMessage());
        }

        return vuelos;
    }
}

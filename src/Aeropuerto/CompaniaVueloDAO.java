package Aeropuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CompaniaVueloDAO {

    // Método para listar vuelos ofrecidos por una compañía
    public void listarVuelosPorCompania(int idCompania) {
        String consulta = "SELECT v.identificador, v.ciudadOrigen, v.ciudadDestino, v.precio "
                + "FROM vuelos v "
                + "JOIN compania_vuelos cv ON v.idVuelo = cv.idVuelo "
                + "WHERE cv.idCompania = ?";
        try (Connection conexion = ConexionBD.conectar(); PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setInt(1, idCompania);
            ResultSet rs = ps.executeQuery();

            System.out.println("Vuelos de la compañía " + idCompania + ":");
            while (rs.next()) {
                System.out.println("- Vuelo " + rs.getString("identificador")
                        + " desde " + rs.getString("ciudadOrigen")
                        + " hasta " + rs.getString("ciudadDestino")
                        + ", Precio: " + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            System.out.println("Error al listar vuelos: " + e.getMessage());
        }
    }
}

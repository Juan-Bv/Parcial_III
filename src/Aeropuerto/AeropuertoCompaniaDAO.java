
package Aeropuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AeropuertoCompaniaDAO {
    // Método para listar compañías que operan en un aeropuerto
    public void listarCompaniasPorAeropuerto(int idAeropuerto) {
        String consulta = "SELECT c.nombre FROM companias c " +
                          "JOIN aeropuertos_companias ac ON c.idCompania = ac.idCompania " +
                          "WHERE ac.idAeropuerto = ?";
        try (Connection conexion = ConexionBD.conectar();
             PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setInt(1, idAeropuerto);
            ResultSet rs = ps.executeQuery();

            System.out.println("Compañías que operan en el aeropuerto " + idAeropuerto + ":");
            while (rs.next()) {
                System.out.println("- " + rs.getString("nombre"));
            }
        } catch (Exception e) {
            System.out.println("Error al listar compañías: " + e.getMessage());
        }
    }
}

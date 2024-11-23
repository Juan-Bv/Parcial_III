package Aeropuerto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AeropuertoDAO {

    // Método para listar aeropuertos según el tipo (públicos o privados)
    public List<Aeropuerto> listarAeropuertos(boolean esPrivado) {
        List<Aeropuerto> aeropuertos = new ArrayList<>();
        String consulta = "SELECT * FROM aeropuertos WHERE privado = ?";

        try (Connection conexion = ConexionBD.conectar(); PreparedStatement ps = conexion.prepareStatement(consulta)) {

            ps.setBoolean(1, esPrivado);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Aeropuerto aeropuerto = new Aeropuerto();
                aeropuerto.setId(rs.getInt("idAeropuerto"));
                aeropuerto.setNombre(rs.getString("nombre"));
                aeropuerto.setCiudad(rs.getString("ciudad"));
                aeropuerto.setPais(rs.getString("pais"));
                aeropuerto.setPrivado(rs.getBoolean("privado"));

                if (esPrivado) {
                    aeropuerto.setSubvencion(rs.getDouble("subvencion"));
                } else {
                    aeropuerto.setPublico(rs.getInt("publico"));
                }

                aeropuertos.add(aeropuerto);
            }
        } catch (Exception e) {
            System.out.println("Error al listar aeropuertos: " + e.getMessage());
        }

        return aeropuertos;
    }
}

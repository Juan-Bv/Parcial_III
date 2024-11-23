package Aeropuerto;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AeropuertoDAO aeropuertoDAO = new AeropuertoDAO();
        VueloDAO vueloDAO = new VueloDAO();

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Listar aeropuertos públicos");
            System.out.println("2. Listar aeropuertos privados");
            System.out.println("3. Buscar vuelos por ciudad de origen y destino");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    List<Aeropuerto> publicos = aeropuertoDAO.listarAeropuertos(false);
                    publicos.forEach(System.out::println);
                    break;
                case 2:
                    List<Aeropuerto> privados = aeropuertoDAO.listarAeropuertos(true);
                    privados.forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Ingrese ciudad de origen: ");
                    String ciudadOrigen = scanner.nextLine();
                    System.out.print("Ingrese ciudad de destino: ");
                    String ciudadDestino = scanner.nextLine();

                    List<Vuelo> vuelos = vueloDAO.listarVuelosPorCiudad(ciudadOrigen, ciudadDestino);
                    if (vuelos.isEmpty()) {
                        System.out.println("No se encontraron vuelos disponibles.");
                    } else {
                        vuelos.forEach(System.out::println);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}

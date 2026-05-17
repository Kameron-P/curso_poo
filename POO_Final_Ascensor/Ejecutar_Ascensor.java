package POO_Final_Ascensor;

// Clase principal para probar el sistema de ascensores
public class Ejecutar_Ascensor {

    public static void main(String[] args) {

        // Crear el sistema con 5 pisos (piso 0 al 4)
        SistemaControl sistema = new SistemaControl(5);

        // --- Prueba 1: Múltiples solicitudes simultáneas (Optimización de Movimiento) ---
        sistema.gestionarSolicitudDesdePiso(3, "SUBIR");
        sistema.gestionarSolicitudDesdeAscensor(4);
        sistema.gestionarSolicitudDesdePiso(1, "BAJAR");
        
        // Procesar todas en el orden optimizado
        sistema.procesarTodasLasSolicitudes();
        sistema.mostrarEstado();

        // --- Prueba 2: Obstáculo en la puerta ---
        sistema.simularObstaculoEnPuerta();

        // --- Prueba 3: Ascensor atascado (falla) ---
        sistema.reportarAscensorAtascado();
        
        // --- Prueba 4: Mostrar desempeño (Registro de viajes y tiempo) ---
        sistema.mostrarDesempenoAscensor();

        System.out.println("\n=== Fin de las pruebas ===");
    }
}

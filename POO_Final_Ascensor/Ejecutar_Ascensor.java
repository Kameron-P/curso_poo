package POO_Final_Ascensor;

public class Ejecutar_Ascensor{

    public static void main(String[] args) {

        // Crear el sistema con 5 pisos (piso 0 al 4)
        SistemaControl sistema = new SistemaControl(5);

        // --- Prueba 1: Solicitud desde el piso 3 para subir ---
        sistema.gestionarSolicitudDesdePiso(3, "SUBIR");
        sistema.mostrarEstado();

        // --- Prueba 2: Alguien dentro del ascensor selecciona el piso 4 ---
        sistema.gestionarSolicitudDesdeAscensor(4);
        sistema.mostrarEstado();

        // --- Prueba 3: Solicitud desde el piso 1 para bajar ---
        sistema.gestionarSolicitudDesdePiso(1, "BAJAR");
        sistema.mostrarEstado();

        // --- Prueba 4: Obstáculo en la puerta ---
        sistema.simularObstaculoEnPuerta();

        // --- Prueba 5: Ascensor atascado (falla) ---
        sistema.reportarAscensorAtascado();

        System.out.println("\n=== Fin de las pruebas ===");
    }
}

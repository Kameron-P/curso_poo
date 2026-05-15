package POO_Final_Ascensor;

public class SistemaControl {

    private Ascensor ascensor;
    private Piso[] pisos;
    private int totalPisos;

    // Constructor: recibe el número de pisos del edificio
    public SistemaControl(int totalPisos) {
        this.totalPisos = totalPisos;
        this.ascensor = new Ascensor(totalPisos);

        // Crear todos los pisos del edificio
        this.pisos = new Piso[totalPisos];
        for (int i = 0; i < totalPisos; i++) {
            pisos[i] = new Piso(i);
        }

        System.out.println("=== Sistema de Control iniciado con " + totalPisos + " pisos ===\n");
    }

    // Gestionar una solicitud desde un piso (alguien presiona el botón del piso)
    public void gestionarSolicitudDesdePiso(int numeroPiso, String direccion) {
        System.out.println("\n--- Nueva solicitud desde Piso " + numeroPiso + " ---");

        if (numeroPiso < 0 || numeroPiso >= totalPisos) {
            System.out.println("[SistemaControl] Error: piso inválido.");
            return;
        }

        // Registrar la solicitud en el piso
        if (direccion.equals("SUBIR")) {
            pisos[numeroPiso].solicitarSubir();
        } else {
            pisos[numeroPiso].solicitarBajar();
        }

        // Verificar que el botón no esté fallando
        if (pisos[numeroPiso].getBoton().isFallando()) {
            enviarAlerta("Falla en botón del piso " + numeroPiso);
            return;
        }

        // Mover el ascensor al piso solicitado
        ascensor.mover(numeroPiso);

        // Abrir la puerta del piso y del ascensor
        pisos[numeroPiso].getPuerta().abrir();
        ascensor.abrirPuerta();
    }

    // Gestionar una solicitud desde dentro del ascensor (seleccionar piso destino)
    public void gestionarSolicitudDesdeAscensor(int pisoDestino) {
        System.out.println("\n--- Solicitud interna: ir al piso " + pisoDestino + " ---");

        if (pisoDestino < 0 || pisoDestino >= totalPisos) {
            System.out.println("[SistemaControl] Error: piso destino inválido.");
            return;
        }

        // Presionar el botón interno del ascensor
        ascensor.presionarBoton(pisoDestino);

        // Cerrar puertas antes de mover
        ascensor.cerrarPuerta();

        // Mover el ascensor
        ascensor.mover(pisoDestino);

        // Abrir puertas al llegar
        ascensor.abrirPuerta();
        pisos[pisoDestino].getPuerta().abrir();
    }

    // Enviar alerta al equipo de mantenimiento
    public void enviarAlerta(String mensaje) {
        System.out.println("\n!!! ALERTA DE MANTENIMIENTO: " + mensaje + " !!!");

        // En caso de emergencia, detener en piso más cercano y abrir puertas
        ascensor.detener();
        ascensor.abrirPuerta();
    }

    // Registrar falla en el ascensor (se atasca)
    public void reportarAscensorAtascado() {
        ascensor.setAtascado(true);
        enviarAlerta("Ascensor atascado en piso " + ascensor.getPisoActual());
    }

    // Simular un obstáculo en la puerta
    public void simularObstaculoEnPuerta() {
        System.out.println("\n--- Simulando obstáculo en puerta del ascensor ---");
        ascensor.getPuerta().setHayObstaculo(true);
        ascensor.cerrarPuerta(); // No se puede cerrar
        ascensor.getPuerta().setHayObstaculo(false); // Se retira el obstáculo
        ascensor.cerrarPuerta(); // Ahora sí se puede cerrar
    }

    // Mostrar el estado actual del sistema
    public void mostrarEstado() {
        System.out.println("\n[Estado] " + ascensor.getEstado());
    }
}

package POO_Final_Ascensor;

// Clase que representa el ascensor
public class Ascensor {

    private int pisoActual;
    private String direccion;    // "SUBIR", "BAJAR" o "DETENIDO"
    private boolean enMovimiento;
    private Puerta puerta;
    private BotonAscensor[] botones; // Un botón por piso dentro del ascensor
    private boolean atascado;

    // Para optimización de movimiento
    private boolean[] solicitudes;

    // Para el módulo de desempeño
    private int totalViajes;
    private int pisosRecorridos;
    private long tiempoInicio;

    // Constructor: recibe el número total de pisos del edificio
    public Ascensor(int totalPisos) {
        this.pisoActual = 0;           // Empieza en planta baja (piso 0)
        this.direccion = "DETENIDO";
        this.enMovimiento = false;
        this.atascado = false;
        this.puerta = new Puerta();
        this.solicitudes = new boolean[totalPisos];

        this.totalViajes = 0;
        this.pisosRecorridos = 0;
        this.tiempoInicio = System.currentTimeMillis();

        // Crear un botón por cada piso dentro del ascensor
        this.botones = new BotonAscensor[totalPisos];
        for (int i = 0; i < totalPisos; i++) {
            botones[i] = new BotonAscensor(i);
        }
    }

    // Agregar una solicitud a la cola
    public void agregarSolicitud(int piso) {
        solicitudes[piso] = true;
        System.out.println("  [Ascensor] Solicitud registrada para el piso " + piso);
    }

    // Procesar todas las solicitudes pendientes optimizando el movimiento
    public void procesarSolicitudes() {
        if (direccion.equals("DETENIDO")) {
            direccion = "SUBIR"; // Dirección inicial por defecto al empezar a moverse
        }

        while (haySolicitudes()) {
            int siguientePiso = obtenerSiguienteParada();
            
            if (siguientePiso != -1) {
                mover(siguientePiso);
                solicitudes[siguientePiso] = false;
            } else {
                cambiarDireccion();
            }
        }
        
        direccion = "DETENIDO";
        enMovimiento = false;
    }

    private boolean haySolicitudes() {
        for (boolean s : solicitudes) {
            if (s) return true;
        }
        return false;
    }

    private int obtenerSiguienteParada() {
        if (direccion.equals("SUBIR")) {
            for (int i = pisoActual; i < solicitudes.length; i++) {
                if (solicitudes[i]) return i;
            }
        } else if (direccion.equals("BAJAR")) {
            for (int i = pisoActual; i >= 0; i--) {
                if (solicitudes[i]) return i;
            }
        }
        return -1; // No hay paradas en la dirección actual
    }

    // Mover el ascensor hacia un piso destino (uso interno durante el procesamiento)
    public void mover(int pisoDestino) {
        if (atascado) {
            System.out.println("[Ascensor] ERROR: el ascensor está atascado en piso " + pisoActual);
            return;
        }

        if (pisoDestino == pisoActual) {
            System.out.println("[Ascensor] Se detiene en el piso actual " + pisoActual);
            abrirPuerta();
            botones[pisoDestino].apagarLuz();
            return;
        }

        enMovimiento = true;
        System.out.println("[Ascensor] Moviendo de piso " + pisoActual + " a piso " + pisoDestino + " - Dirección: " + direccion);

        // Registrar desempeño
        pisosRecorridos += Math.abs(pisoDestino - pisoActual);
        totalViajes++;

        pisoActual = pisoDestino;
        
        System.out.println("[Ascensor] Llegó al piso " + pisoActual);
        abrirPuerta();

        // Al llegar, apagar el botón del destino
        botones[pisoDestino].apagarLuz();
    }

    // Cambiar la dirección del ascensor solo cuando no hay más solicitudes en la misma dirección
    public void cambiarDireccion() {
        if (direccion.equals("SUBIR")) {
            direccion = "BAJAR";
        } else {
            direccion = "SUBIR";
        }
        System.out.println("[Ascensor] Dirección cambiada a: " + direccion + " (No hay más solicitudes en la dirección anterior)");
    }

    // Detener el ascensor (ej. emergencia)
    public void detener() {
        enMovimiento = false;
        direccion = "DETENIDO";
        System.out.println("[Ascensor] Ascensor detenido de emergencia en piso " + pisoActual);
        
        // Limpiar solicitudes por seguridad
        for (int i = 0; i < solicitudes.length; i++) {
            solicitudes[i] = false;
        }
    }

    // Presionar un botón dentro del ascensor para ir a un piso
    public void presionarBoton(int pisoDestino) {
        System.out.println("[Ascensor] Botón interno presionado para ir al piso " + pisoDestino);
        botones[pisoDestino].seleccionarPiso();
        agregarSolicitud(pisoDestino);
    }

    // Presionar botón de mantener puertas abiertas
    public void mantenerPuertasAbiertas() {
        botones[0].mantenerPuerta(); // Usa el método especial
        puerta.mantenerAbierta();
    }

    // Abrir la puerta del ascensor
    public void abrirPuerta() {
        puerta.abrir();
    }

    // Cerrar la puerta del ascensor
    public void cerrarPuerta() {
        puerta.cerrar();
    }

    // Muestra estadísticas de desempeño para análisis de mantenimiento
    public void mostrarDesempeno() {
        long tiempoActivoSegundos = (System.currentTimeMillis() - tiempoInicio) / 1000;
        System.out.println("\n--- Reporte de Desempeño del Ascensor ---");
        System.out.println("Total de viajes realizados: " + totalViajes);
        System.out.println("Total de pisos recorridos: " + pisosRecorridos);
        System.out.println("Tiempo activo del sistema: " + tiempoActivoSegundos + " segundos");
        System.out.println("-----------------------------------------\n");
    }

    // Getters
    public int getPisoActual() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }

    public boolean isAtascado() {
        return atascado;
    }

    public void setAtascado(boolean atascado) {
        this.atascado = atascado;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public String getEstado() {
        return "Piso: " + pisoActual + " | Dirección: " + direccion + " | En movimiento: " + enMovimiento;
    }
}

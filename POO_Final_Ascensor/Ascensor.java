package POO_Final_Ascensor;

public class Ascensor {

    private int pisoActual;
    private String direccion;    // "SUBIR", "BAJAR" o "DETENIDO"
    private boolean enMovimiento;
    private Puerta puerta;
    private BotonAscensor[] botones; // Un botón por piso dentro del ascensor
    private boolean atascado;

    // Constructor: recibe el número total de pisos del edificio
    public Ascensor(int totalPisos) {
        this.pisoActual = 0;           // Empieza en planta baja (piso 0)
        this.direccion = "DETENIDO";
        this.enMovimiento = false;
        this.atascado = false;
        this.puerta = new Puerta();

        // Crear un botón por cada piso dentro del ascensor
        this.botones = new BotonAscensor[totalPisos];
        for (int i = 0; i < totalPisos; i++) {
            botones[i] = new BotonAscensor(i);
        }
    }

    // Mover el ascensor hacia un piso destino
    public void mover(int pisoDestino) {
        if (atascado) {
            System.out.println("[Ascensor] ERROR: el ascensor está atascado en piso " + pisoActual);
            return;
        }

        if (pisoDestino == pisoActual) {
            System.out.println("[Ascensor] Ya está en el piso " + pisoActual);
            return;
        }

        // Determinar dirección
        if (pisoDestino > pisoActual) {
            direccion = "SUBIR";
        } else {
            direccion = "BAJAR";
        }

        enMovimiento = true;
        System.out.println("[Ascensor] Moviendo de piso " + pisoActual + " a piso " + pisoDestino + " - Dirección: " + direccion);

        pisoActual = pisoDestino;
        enMovimiento = false;
        direccion = "DETENIDO";

        System.out.println("[Ascensor] Llegó al piso " + pisoActual);

        // Al llegar, apagar el botón del destino
        botones[pisoDestino].apagarLuz();
    }

    // Cambiar la dirección del ascensor
    public void cambiarDireccion() {
        if (direccion.equals("SUBIR")) {
            direccion = "BAJAR";
        } else {
            direccion = "SUBIR";
        }
        System.out.println("[Ascensor] Dirección cambiada a: " + direccion);
    }

    // Detener el ascensor
    public void detener() {
        enMovimiento = false;
        direccion = "DETENIDO";
        System.out.println("[Ascensor] Ascensor detenido en piso " + pisoActual);
    }

    // Presionar un botón dentro del ascensor para ir a un piso
    public void presionarBoton(int pisoDestino) {
        System.out.println("[Ascensor] Botón interno presionado para ir al piso " + pisoDestino);
        botones[pisoDestino].seleccionarPiso();
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


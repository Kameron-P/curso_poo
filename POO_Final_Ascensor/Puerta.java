package POO_Final_Ascensor;

// Clase que representa la puerta del ascensor o de un piso
public class Puerta {

    private boolean estaAbierta;
    private boolean hayObstaculo;

    // Constructor
    public Puerta() {
        this.estaAbierta = false;
        this.hayObstaculo = false;
    }

    // Abrir la puerta (solo si no hay obstáculo)
    public void abrir() {
        if (!hayObstaculo) {
            estaAbierta = true;
            System.out.println("  [Puerta] Puerta abierta.");
        } else {
            System.out.println("  [Puerta] No se puede abrir: hay un obstáculo.");
        }
    }

    // Cerrar la puerta (solo si no hay obstáculo)
    public void cerrar() {
        if (!hayObstaculo) {
            estaAbierta = false;
            System.out.println("  [Puerta] Puerta cerrada.");
        } else {
            System.out.println("  [Puerta] No se puede cerrar: hay un obstáculo detectado.");
        }
    }

    // Mantener la puerta abierta (botón dentro del ascensor)
    public void mantenerAbierta() {
        estaAbierta = true;
        System.out.println("  [Puerta] Puerta se mantiene abierta.");
    }

    // Getters y setters
    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    public void setHayObstaculo(boolean hayObstaculo) {
        this.hayObstaculo = hayObstaculo;
        if (hayObstaculo) {
            System.out.println("  [Puerta] Sensor: obstáculo detectado.");
        }
    }

    public boolean isHayObstaculo() {
        return hayObstaculo;
    }
}

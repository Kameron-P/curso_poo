package POO_Final_Ascensor;

public class Piso {

    private int numero;
    private Puerta puerta;
    private BotonPiso boton;

    // Constructor
    public Piso(int numero) {
        this.numero = numero;
        this.puerta = new Puerta();       // Cada piso tiene su propia puerta
        this.boton = new BotonPiso(numero); // y su propio botón de llamada
    }

    // El botón del piso solicita el ascensor hacia arriba
    public void solicitarSubir() {
        System.out.println("[Piso " + numero + "] Solicitud de SUBIR.");
        boton.pedirSubir();
    }

    // El botón del piso solicita el ascensor hacia abajo
    public void solicitarBajar() {
        System.out.println("[Piso " + numero + "] Solicitud de BAJAR.");
        boton.pedirBajar();
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public BotonPiso getBoton() {
        return boton;
    }
}


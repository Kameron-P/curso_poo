package POO_Final_Ascensor;

// Botón ubicado en cada piso para llamar al ascensor
// Hereda de Boton (herencia)
public class BotonPiso extends Boton {

    private int numeroPiso;
    private String direccionSolicitada; // "SUBIR" o "BAJAR"

    // Constructor
    public BotonPiso(int numeroPiso) {
        super(); // Llama al constructor del padre
        this.numeroPiso = numeroPiso;
        this.direccionSolicitada = "";
    }

    // Implementación del método abstracto del padre (polimorfismo)
    @Override
    public void presionar() {
        if (!isFallando()) {
            iluminar();
            emitirSonido();
            System.out.println("  [BotonPiso] Piso " + numeroPiso + " solicita ascensor - dirección: " + direccionSolicitada);
        } else {
            System.out.println("  [BotonPiso] FALLA en botón del piso " + numeroPiso);
        }
    }

    // Solicitar subir
    public void pedirSubir() {
        direccionSolicitada = "SUBIR";
        presionar();
    }

    // Solicitar bajar
    public void pedirBajar() {
        direccionSolicitada = "BAJAR";
        presionar();
    }

    // Getters
    public int getNumeroPiso() {
        return numeroPiso;
    }

    public String getDireccionSolicitada() {
        return direccionSolicitada;
    }
}

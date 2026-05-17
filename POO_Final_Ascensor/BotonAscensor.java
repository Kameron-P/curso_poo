package POO_Final_Ascensor;

// Botón dentro del ascensor para seleccionar el piso de destino
// Hereda de Boton (herencia)
public class BotonAscensor extends Boton {

    private int pisoDestino;

    // Constructor
    public BotonAscensor(int pisoDestino) {
        super(); // Llama al constructor del padre
        this.pisoDestino = pisoDestino;
    }

    // Implementación del método abstracto del padre (polimorfismo)
    @Override
    public void presionar() {
        if (!isFallando()) {
            iluminar();
            emitirSonido();
            System.out.println("  [BotonAscensor] Piso destino seleccionado: " + pisoDestino);
        } else {
            System.out.println("  [BotonAscensor] FALLA en botón de destino piso " + pisoDestino);
        }
    }

    // Botón especial: mantener puertas abiertas
    public void mantenerPuerta() {
        System.out.println("  [BotonAscensor] Botón 'Mantener puertas abiertas' presionado.");
    }

    // Seleccionar el piso desde dentro del ascensor
    public void seleccionarPiso() {
        presionar();
    }

    // Getter
    public int getPisoDestino() {
        return pisoDestino;
    }
}

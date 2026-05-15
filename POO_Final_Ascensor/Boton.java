package POO_Final_Ascensor;

public abstract class Boton {

    private boolean iluminado;
    private boolean fallando;

    // Constructor
    public Boton() {
        this.iluminado = false;
        this.fallando = false;
    }

    // Método que deben implementar los hijos (polimorfismo)
    public abstract void presionar();

    // Iluminar el botón al ser presionado
    public void iluminar() {
        if (!fallando) {
            iluminado = true;
            System.out.println("  [Boton] Luz del botón activada.");
        } else {
            System.out.println("  [Boton] FALLA: el botón no responde.");
        }
    }

    // Apagar la luz del botón
    public void apagarLuz() {
        iluminado = false;
        System.out.println("  [Boton] Luz del botón apagada.");
    }

    // Emitir sonido de confirmación
    public void emitirSonido() {
        if (!fallando) {
            System.out.println("  [Boton] *beep* Solicitud registrada.");
        }
    }

    // Getters y setters
    public boolean isIluminado() {
        return iluminado;
    }

    public boolean isFallando() {
        return fallando;
    }

    public void setFallando(boolean fallando) {
        this.fallando = fallando;
    }
}

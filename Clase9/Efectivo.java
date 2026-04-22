package Clase9;

public class Efectivo extends Pago {
    public double cantidad; // El dinero que entrega el cliente

    // Un método sencillo para ver cuánto sobra
    public void mostrarCambio(double totalDeLaOrden) {
        double cambio = cantidad - totalDeLaOrden;
        if (cambio >= 0) {
            System.out.println("Pago exitoso. Su cambio es: " + cambio);
        } else {
            System.out.println("Falta dinero. Faltan: " + (totalDeLaOrden - cantidad));
        }
    }
}

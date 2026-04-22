package Clase9;

public class Credito extends Pago {
    
    public int numeroTdeCredito; 
    public String nombre;
    public String tipo;
    public String fechaDeExp;

    public boolean hacerCargo(double total) {
        System.out.println("Cobrando $" + total + " a la tarjeta de " + nombre);
        return true;
    }
}
package Clase9;
public class Pago {
    protected double subTotal;
    protected double propina;
    protected double impuestos;

    public double calculoTotal(double subTotal, double propina, double impuestos) {
        return subTotal + propina + impuestos;
    }
}
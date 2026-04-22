package Clase9;

public class Cliente {
    public int mesa;
    public int comensales;
    public Orden orden; // Aquí guardamos la orden del cliente

    public Cliente(int mesa, int comensales) {
        this.mesa = mesa;
        this.comensales = comensales;
    }
}
package Clase9;

public class Ejecutar {
    public static void main(String[] args) {
        // 1. Creamos la bebida y el platillo
        Bebida jugo = new Bebida(1, "Jugo de Mora");
        Platillo pizza = new Platillo(1, "Pizza Pepperoni");

        // 2. Creamos la orden y asignamos los objetos
        Orden miOrden = new Orden(1430, "Juan Perez");
        miOrden.bebida = jugo;
        miOrden.platillo = pizza;

        // --- PRUEBA 1: PAGO CON CRÉDITO ---
        Credito miTarjeta = new Credito();
        miTarjeta.nombre = "Diego";
        miTarjeta.numeroTdeCredito = 123456;
        
        // Calculamos el total usando el método heredado de Pago
        double total = miTarjeta.calculoTotal(15000, 2000, 1000);
        
        System.out.println("--- PAGO CON TARJETA ---");
        miTarjeta.hacerCargo(total);
        System.out.println("Total pagado: $" + total);
    }
}
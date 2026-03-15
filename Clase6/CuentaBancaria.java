public class CuentaBancaria {
    // 1. Atributos (Lo que la cuenta "tiene")
    public String numeroCuenta;
    public String titular;
    public double saldo;

    // 2. Constructor (Para crear la cuenta con datos desde el inicio)
    public CuentaBancaria(String num, String nombre, double saldoInicial) {
        this.numeroCuenta = num;
        this.titular = nombre;
        this.saldo = saldoInicial;
    }

    // 3. Métodos (Lo que la cuenta "hace")
    
    public void depositar(double cantidad) {
        saldo = saldo + cantidad; // Forma clásica de principiante
        System.out.println("Has depositado: $" + cantidad);
    }

    public void retirar(double cantidad) {
        // Validación básica para no quedar en negativo
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Has retirado: $" + cantidad);
        } else {
            System.out.println("No tienes suficiente dinero para retirar $" + cantidad);
        }
    }
    public String toString() {
        return "Cuenta de " + titular + " - Saldo actual: $" + saldo;
    }
}
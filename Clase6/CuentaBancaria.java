public class CuentaBancaria {
    //Atributos 
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public CuentaBancaria(String num, String nombre, double saldoInicial) {
        this.numeroCuenta = num;
        this.titular = nombre;
        this.saldo = saldoInicial;
    }    
    public void depositar(double cantidad) {
        saldo = saldo + cantidad; 
        System.out.println("Has depositado: $" + cantidad);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Has retirado: $" + cantidad);
        } else {
            System.out.println("No tienes suficiente dinero para retirar $" + cantidad);
        }
    }
    public String toString() {
        return "CuentaBancaria: Cuenta de " + titular + " - Saldo actual: $" + saldo;
    }
}
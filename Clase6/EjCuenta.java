public class EjCuenta {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("987654", "Maria Lopez", 1000.0);
        System.out.println(miCuenta); 

        miCuenta.depositar(500.0);  
        miCuenta.retirar(200.0);  
        System.out.println("Estado final: " + miCuenta);
    }
}
public class EjCuenta {
    public static void main(String[] args) {
        // Crear la instancia (el objeto)
        CuentaBancaria miCuenta = new CuentaBancaria("987654", "Maria Lopez", 1000.0);

        // Realizar operaciones
        System.out.println(miCuenta); // Consulta inicial

        miCuenta.depositar(500.0);    // Depósito
        miCuenta.retirar(200.0);     // Retiro
        
        // Consulta final
        System.out.println("Estado final: " + miCuenta);
    }
}
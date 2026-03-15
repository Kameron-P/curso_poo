public class Cuentabancaria {
    //Atributos
    private int numerocuenta;
    private String titular;
    double saldo;
    
    
    public Cuentabancaria(int numerocuenta, double saldo, String titular, int cantidad){
        this.numerocuenta=numerocuenta;
        this.titular=titular;
        this.saldo=saldo;
    }    
    public void depositar(double cantidad) {
        saldo += cantidad;
    }    
    public void retirar(double cantidad){
        saldo -= cantidad;
    }    
    public void consultarSaldo(double cantidad){
        System.out.println("Su saldo actual es:"+saldo);
    }
    
}

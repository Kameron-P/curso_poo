public class Cuenta{
    private String numeroCuenta;
    private double saldo;

    public Cuenta (String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    //geters
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public double mostrarSaldo(){
        return saldo;
    }
    public String toString(){
        return "Cuenta{numeroCuenta:"+numeroCuenta+"Saldo:"+saldo+"};";
    }
}
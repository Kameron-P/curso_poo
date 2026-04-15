public class Ejecut {
    public Ejecut() {
    }

    public static void main(String[] args) {
       
        //Creación del objeto Cuenta
        Cuenta objCuenta1 = new Cuenta("790032-1", 1500.0);
        Cuenta objCuenta2 = new Cuenta("400234-3", 987.0);
 
        System.out.println(objCuenta1);
        System.out.println(objCuenta2);
 
        System.out.println(objCuenta1.mostrarSaldo()); //1500.0
        System.out.println(objCuenta2.mostrarSaldo()); //987.0
       
 
        //Creación del objeto Cliente
        Cliente objCliente1 = new Cliente("1110345098", "Miguel", 2000);
        Cliente objCliente2 = new Cliente("1006821354", "Laura", 2006);
       
        System.out.println(objCliente1);
        System.out.println(objCliente2);
 
        System.out.println(objCliente1.calcularEdad(2026)); //26
        System.out.println(objCliente2.calcularEdad(2026)); //20
 
        //Creación del objeto Banco
        Banco objBanco1 = new Banco("Mis Ahorros", 26789876, objCuenta1);
        System.out.println(objBanco1);
        objBanco1.consultarCliente(objCliente2);
 
    }
}
 
 
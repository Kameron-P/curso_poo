 public class Banco {
   
    private String nombre;
    private int telefono;
    private Cuenta cuenta;
   
    public Banco(String nombre, int telefono, Cuenta cuenta) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cuenta = cuenta;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public int getTelefono() {
        return telefono;
    }
 
    public Cuenta getCuenta() {
        return cuenta;
    }
 
    public void consultarCliente(Cliente cliente){
        System.out.println(cliente.getNombre());
    }
 
    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + ", telefono=" + telefono + ", cuenta=" + cuenta + "]";
    }
 
   
}
 
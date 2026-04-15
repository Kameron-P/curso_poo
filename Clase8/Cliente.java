public class Cliente {
   
    private String cedula;
    private String nombre;
    private int anioNacimiento;
   
    public Cliente(String cedula, String nombre, int anioNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
    }
 
    public String getCedula() {
        return cedula;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
 
    public int calcularEdad(int anioActual){
        return anioActual - anioNacimiento;
    }
   
    @Override
    public String toString() {
        return "Cliente {cedula=" + cedula + " nombre:" + nombre + " anioNacimiento:" + anioNacimiento + "}";
    }
 
}
 
public class Perfume {
       // Atributos
    public String nombre;
    public String marca;
    public double capacidad; 
    public double precio;

    public Perfume(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }
    public void aplicarPerfume(double cantidadAplicada) {
        if (cantidadAplicada <= capacidad) {
            capacidad = capacidad - cantidadAplicada;
            System.out.println("Has usado " + cantidadAplicada + " ml de " + nombre);
        } else {
            System.out.println(" No queda suficiente perfume para esa aplicación.");
        }
    }
    public void ajustarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El precio de " + nombre + " se ha actualizado a: $" + precio);
    }
    public String toString() {
        return "Perfume: " + nombre + ", (" + marca + ") ,Contenido: " + capacidad + " ml  Precio: $" + precio;
    }
}
    


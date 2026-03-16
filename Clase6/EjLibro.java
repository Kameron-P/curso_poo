public class EjLibro {
    public static void main(String[] args) {
      Libro libro1 = new Libro("Cien años de soledad", "Gabo", "123-ABC", 400, false);
        Libro libro2 = new Libro("Java para Principiantes", "Profe Java", "456-XYZ", 250, false);

        System.out.println("--- Inicio de jornada ---");
        System.out.println(libro1);
        System.out.println(libro2);

        System.out.println(" Simulando Préstamos ");
        libro1.prestar();
        libro1.prestar(); 

        System.out.println(" Verificando disponibilidad ");
        libro1.estaDisponible();
        libro2.estaDisponible();

        System.out.println(" Devolución ");
        libro1.devolver();
        System.out.println(libro1); 
    }
}
    

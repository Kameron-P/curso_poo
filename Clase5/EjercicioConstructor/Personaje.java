public class Personaje {
    //Atributos
    String nombre ;
    int nivel ;
// Constructor que obliga a dar un nombre al crear el
    public Personaje ( String nombre ) {
        this . nombre = nombre ;
        this . nivel = 1; // Todos empiezan en nivel 1 por defecto
    }
    public void mostrarInfo () {
    System.out.println (" Heroe : " + nombre + " | Nivel : " +
    nivel ) ;
    }
}    
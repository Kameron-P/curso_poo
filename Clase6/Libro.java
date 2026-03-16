public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private boolean disponible;
    public Libro( String titulo, String autor, String ISBN, int numeroPaginas,boolean disponible){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.numeroPaginas=numeroPaginas;
        this.disponible =disponible;
    }
    public void prestar(){
        if (disponible==true){
            disponible=false;
            System.out.println("Has prestado el libro:"+titulo);
        }else{ System.out.println("El libro:"+titulo+" no esta disponible");} 
    }    
    public void devolver(){
        disponible=true;
        System.out.println("Has devuelto el libro:"+titulo);
    }    
    public void estaDisponible(){
        if (disponible){
            System.out.println("El libro"+titulo+"esta disponible para prestamo");}
            else{
            System.out.println("El libro"+titulo+" no esta disponible para cambio");}    
    }
    public String toString(){
        String estado =(disponible) ? "Disponible": "Prestado";
        return "Libro:" + titulo + " Autor: " + autor + " Estado: " + estado;
    }
    
}

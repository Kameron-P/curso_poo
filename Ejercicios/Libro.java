public class Libro{
    //Atributos
    String Titulo;
    String Autor ;
    int Paginas;
    public Libro(String Titulo,String Autor,int Paginas){
        this.Titulo= Titulo;
        this.Autor= Autor;
        this.Paginas=Paginas;
    }

    public void mostrarInfo(){
        System.out.println("Libro: " + Titulo + ", escrito por " + Autor);
    }

}
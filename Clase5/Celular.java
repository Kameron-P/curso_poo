public class Celular {
    //Atributos 
    String marca;
    String modelo;
    int bateria=100;
    //metodo 
    /*
    Firma del metodo
    publico
    void significa que no retorna 
    el metodo se llama llamar
    tiene un parametro y es de tipo entero */
    public void llamar(String numero){
        System.out.println("Llamando al "+numero+"....");
        this.bateria-=5;

    }
    
}

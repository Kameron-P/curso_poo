public class Animal {
    private String nombre;
    private int edad;
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){

    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void comer(){
        System.out.println(nombre+"esta comiendo");
        
    }
    public void hacerSonido(){
        System.out.println(nombre+"hacer sonido generico");

    }
    public String toString(){
        return "Animal[ nombre=" + nombre + ", Edad=" + edad + "]";
    }
}

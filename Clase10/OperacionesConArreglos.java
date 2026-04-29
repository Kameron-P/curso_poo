package Clase10;
public class OperacionesConArreglos {
    
    //Crear un arreglo de enteros
    public int[] crearArreglo(int tam){
        int[] a = new int[tam];
        return a;
    }

    //Llenar el arreglo de enteros
    public int[] llenarArreglo(int[] a, int min, int max){
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return a;
    }

    //Mostrar el arreglo de enteros
    public void mostrarArreglo(int[] a){
        for (int i = 0; i < a.length; i++) {
           System.out.println("a["+i+"]="+a[i]); 
        }
    }
}

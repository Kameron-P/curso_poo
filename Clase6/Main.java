public class Main {
    public static void main(String[] args) throws Exception {
        
        //Inicializamos el objeto
        Producto objP1 = new Producto("Teclado", 10012, 10, 230.0);
        
        //Mostrar el contenido del objeto objP1
        System.out.println(objP1);
        
        //Agregar 5 teclados y mostrar nuevemente el objeto "cantidad = 15"
        objP1.agregarStock(5);
        System.out.println(objP1);

        //Descontar 8 teclados y mostrar nuevemente el objeto "cantidad = 7"
        objP1.reducirStock(8);
        System.out.println(objP1);
        
        //Calcular el invetario
        double total= objP1.calcularValorInventario(); //Ejemplo 1
        //System.out.println(total);
        System.out.println(objP1.calcularValorInventario()); //Ejemplo2
        
    }
}
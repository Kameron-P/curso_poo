public class EjPerfume{
    public static void main(String[] args) {
        Perfume miFragancia = new Perfume("Splash", "Natura", 100.0, 120.50);
        System.out.println("Inventario Inicial");
        System.out.println(miFragancia);
        System.out.println(" Usando el perfume ");
        miFragancia.aplicarPerfume(5.5); 
        miFragancia.aplicarPerfume(2.0); 
        System.out.println("Estado actual: " + miFragancia);
        System.out.println("Ajuste de precio ");
        miFragancia.ajustarPrecio(135.0);
        System.out.println(" Estado Final");
        System.out.println(miFragancia);
    }
}
    


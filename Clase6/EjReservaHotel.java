public class EjReservaHotel {
    public static void main(String[] args) {
        ReservaHotel r1 = new ReservaHotel("Kameron", "20/03/2026", "25/03/2026", 101);
        ReservaHotel r2 = new ReservaHotel("Ana Garcia", "01/04/2026", "05/04/2026", 205);

        System.out.println(" Información de Reservas ");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Procesando Cancelación");
        r1.cancelarReserva();
        System.out.println("Estado Final de Reservas");
        System.out.println(r1);
        System.out.println(r2);
    }
}
    

public class ReservaHotel {
    // Atributos
    public String nombreCliente;
    public String fechaEntrada;
    public String fechaSalida;
    public int numeroHabitacion;
    public boolean reservaActiva;

    public ReservaHotel(String cliente, String entrada, String salida, int habitacion) {
        this.nombreCliente = cliente;
        this.fechaEntrada = entrada;
        this.fechaSalida = salida;
        this.numeroHabitacion = habitacion;
        this.reservaActiva = true; 
        System.out.println("Reserva creada para: " + cliente);
    }
    public void cancelarReserva() {
        if (reservaActiva) {
            reservaActiva = false;
            System.out.println("La reserva de " + nombreCliente + " ha sido cancelada.");
        } else {
            System.out.println("Esta reserva ya estaba cancelada anteriormente.");
        }
    }
    public String toString() {
        String estado = (reservaActiva) ? "ACTIVA" : "CANCELADA";
        return "RESERVA [" + estado + "]"+"Cliente: " + nombreCliente +
               "Habitación: " + numeroHabitacion +
               "Estadía: " + fechaEntrada + " hasta " + fechaSalida;
    }

    
}

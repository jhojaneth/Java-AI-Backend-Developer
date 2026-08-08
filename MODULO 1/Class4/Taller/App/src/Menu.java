import java.util.Scanner;

public class Menu {
     public static void mostrar() {
        System.out.println();
        System.out.println("=== GESTOR DE INVENTARIO ===");
        System.out.println("1. Agendar cita");
        System.out.println("2. Listar agenda");
        System.out.println("3. cancelar reserva");
        System.out.println("4. Ver valor total");
        System.out.println("5. Buscar cliente");
         System.out.println("6. modificar hora de reserva");
         System.out.println("7. horas disponibles");
         System.out.println("8. servicio mas pedido");
         System.out.println("8. Salir");
    }

    public static int leerOpcion(Scanner sc) {
        return Validador.leerEntero(sc, "Elige una opcion: ");
    }
    public static void servicio(){
         System.out.println("1. corte: 25.000$");
        System.out.println("2. tinter: 60.000$");
        System.out.println("3. manicure: 30.000$");
    }
    
}

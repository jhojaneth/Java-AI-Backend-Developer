import java.util.Scanner;

public class cajero {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("--- CAJERO ---");
        System.out.println("1. Nuevo pedido");
        System.out.println("2. Cerrar caja");
        System.out.print("Elige una opcion: ");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                System.out.print("Subtotal: ");
                double subtotal = sc.nextDouble();
                if (subtotal > 100000) {
                    System.out.println("Pedido con descuento");
                } else {
                    System.out.println("Pedido sin descuento");
                }
                break;
            case 2:
                System.out.println("Caja cerrada");
                break;
            default:
                System.out.println("Opcion invalida");
        }
    switch (opcion) {

        case 1 -> System.out.println("Nuevo pedido");

     case 2 -> System.out.println("Aplicar descuento");

     case 3 -> System.out.println("Cerrar caja");

        default -> System.out.println("Opcion invalida");
    }

 }
}

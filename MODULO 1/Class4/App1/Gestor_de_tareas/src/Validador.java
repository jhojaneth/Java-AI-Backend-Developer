import java.util.Scanner;

public class Validador {
    public static int leerEntero(Scanner sc,String mensaje){
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()) {
                int prioridad=sc.nextInt();
                sc.nextLine();
                return prioridad;
            }else{
                System.out.println("tiene que ser un numero entero");
                sc.nextLine();
            }

        }
    }
    public static double leerDecimal(Scanner sc, String mensaje){
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextDouble()) {
                double costo=sc.nextDouble();
                sc.nextLine();
                return costo;
            }else{
                System.out.println("tiene que ser un numero decimal");
                sc.nextLine();
            }
        }  
    }
    public static String leerString(Scanner sc, String mensaje){
            System.out.println(mensaje);
            return sc.nextLine();
        }
}

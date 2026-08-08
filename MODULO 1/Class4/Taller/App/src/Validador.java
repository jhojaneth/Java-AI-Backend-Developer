import java.util.Scanner;

public class Validador {
public static int leerEntero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Eso no es un numero entero. Intenta de nuevo.");
                sc.nextLine();
            }
        } 
    }
        public static double leerDecimal(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextDouble()) {
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } else {
                System.out.println("Eso no es un numero valido. Intenta de nuevo.");
                sc.nextLine();
            }
        }
    }

    public static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
    public static boolean horaValida(int hora){
        if (hora>=8 && hora<=17) {
            return true;
        }
        return false;

    }
    public static boolean estaOcupada(int hora){
        
        for (int i = 0; i <=Operaciones.reservas; i++) {
            if (Operaciones.horas[i]==hora) {
                return true;
            }
        }
        return false;
    }
    public static boolean nombreValido(String nombre){
        if (nombre.trim().isEmpty()) {
            return false;
        }
        return true;

    }
    public static boolean servicioValido(int servicio){
        switch (servicio) {
            case 1:
                return true;
               
             case 2:
                 return true;
                
             case 3:
                 return true;
                
            default:
                break;
        }
        return false;

    }
}

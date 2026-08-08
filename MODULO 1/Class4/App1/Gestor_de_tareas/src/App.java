import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            Menu.lista();
            opcion = Menu.opciones(sc);
            switch (opcion) {
                case 1:
                    Operaciones.listar(sc);
                    break;
                case 2:
                    Operaciones.listar();
                    break;
                case 3:
                    Operaciones.actualizarPrioridad(sc);
                    break;
                case 4:
                    Operaciones.total();
                    break;
                case 5:
                    System.out.println("Gracias por usar el gestor. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida. Elige entre 1 y 5.");
            }
        }
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 9) {
            Menu.mostrar();
            opcion = Menu.leerOpcion(sc);
        
            switch (opcion) {
                case 1:
                    Operaciones.agendar(sc);
                    break;
                case 2:
                    Operaciones.listar();
                    break;
                case 3:
                    Operaciones.cancelarReserva(sc);;
                    break;
                case 4:
                    Operaciones.reporte();
                    break;
                case 5:
                     Operaciones.buscarCliente(sc);
                    break;
                 case 6:
                   Operaciones.editarReserva(sc);
                    break;
                 case 7:
                     Operaciones.horasDisponibles();
                    break;
                case 8:
                    Operaciones.servicioMax();
                    break;
                case 9:
                     System.out.println("Gracias por usar el gestor. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida. Elige entre 1 y 5.");
            }
        }
        sc.close();
    }
}

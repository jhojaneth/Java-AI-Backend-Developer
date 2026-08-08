import java.util.Scanner;

public class Menu {
    public static void lista(){
        System.out.println("-----MENU-----------");
        System.out.println("1.Registrar tarea");
        System.out.println("2.Listar tareas");
        System.out.println("3.Modificar prioridad de una tarea");
        System.out.println("4.Ver costo total del proyecto");
        System.out.println("5.Salir");
    }
    public static int opciones(Scanner sc){
    return Validador.leerEntero(sc, "opciones");
    }
}

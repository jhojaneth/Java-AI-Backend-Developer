import java.util.Scanner;

public class Operaciones {
    static final int MAX=50;
    static  String descripcion []=new String[MAX];
    static  int prioridad []=new int[MAX];
    static  double costo []=new double[MAX];
    static int tareas=0;
    public static void listar(Scanner sc){
        if (tareas==MAX) {
            System.out.println("tareas llenas");
            return;
        }else{
            descripcion[tareas]=Validador.leerString(sc, "nombre de la tarea");
            prioridad[tareas]=Validador.leerEntero(sc, "prioridadad de la tarea");        
            costo[tareas]=Validador.leerDecimal(sc, "costo de la tarea");
            tareas++;
            System.out.println("Agregado correctamente");
        }
    }
    public static void listar(){
        if (tareas==0) {
            System.out.println("esta vacio");
            return;
        }else{
            for (int i = 0; i < tareas; i++) {
                System.out.println((i+1)+". "+"Nombre de la tarea: "+ descripcion[i]+ 
                "\n prioridad: "+ prioridad[i]+
                "\n costo: "+ costo[i]);
            }     
        }
    }
    public static void actualizarPrioridad(Scanner sc){
         if (tareas==0) {
            System.out.println("esta vacio");
            return;
        }else{
            listar();
            int opcion=Validador.leerEntero(sc, "opcion actualizar");
            if(opcion<0 || opcion>MAX){
                System.out.println("ese numero no existe en el inventario");
                return;
            }
            prioridad[opcion-1]=Validador.leerEntero(sc, "prioridad nueva");
            System.out.println("prioridad actualizada");
        }
    }
    public static void total(){
        double acu=0;
        if (tareas==0) {
            System.out.println("esta vacio");
            return;
        }else{
            for (int i = 0; i <tareas+1; i++) {
               acu+=costo[i];
            }
        }
        System.out.println("costo total: "+ acu);
    }
}

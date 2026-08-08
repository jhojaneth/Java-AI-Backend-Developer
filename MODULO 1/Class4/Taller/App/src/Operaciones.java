import java.util.Scanner;

public class Operaciones {
    static final int MAX = 10;
    static String[] nombres = new String[MAX];
    static int[] horas = new int[MAX];
    static int[] codigo_servicio = new int[MAX];
    static int reservas = 0;
    static int acu=0;
    public static void agendar(Scanner sc){
        if (reservas>=10) {
            System.out.println("ya no se puede agendar");
        }else{
            String nombre;
            do {
                nombre=Validador.leerTexto(sc, "nombre");
                if (Validador.nombreValido(nombre)) {
                    System.out.println("nombre correcto");
                    nombres[reservas]=nombre.trim();
                }else{
                    System.out.println("nombre incorrecto vuelve a ingresarlo");
                }
            } while (!Validador.nombreValido(nombre) );
          int hora;
          int codigo;
          boolean ocupado=false;
          
          do {
            hora=Validador.leerEntero(sc, "hora de agenda ( de 8 a las 17)");
            if (Validador.horaValida(hora)) {
            System.out.println("hora valida");
            System.out.println("Revisnado......");
                if (Validador.estaOcupada(hora)) {
                    System.out.println("ya esta ocupada a esta hora");
                    ocupado=true;
                }else{
                    System.out.println("hora disponible");
                    horas[reservas]=hora;
                    ocupado=false;
                }
          }else{
            ocupado=true;
            System.out.println("hora incorrecta");
          }
          } while ( ocupado );
          Menu.servicio();
          do {
            codigo=Validador.leerEntero(sc, " servicio (del 1 al 3) ");
                if (Validador.servicioValido(codigo)) {
                    System.out.println("codigo correcto");
                    codigo_servicio[reservas]=codigo;
                    switch (codigo) {
                        case 1:
                             acu+=25000;
                            break;
                        case 2:
                             acu+=60000;
                            break;
                        case 3:
                            acu+=30000;
                            break;
                        default:
                            break;
                    }
                }else{
                    System.out.println("codigo incorrecto");
                }
          } while (!Validador.servicioValido(codigo));
           reservas++;
        }
    }
    public static void listar(){
        if (reservas==0) {
            System.out.println("no hay reservas");
        }else{
            for (int i = 0; i <reservas; i++) {
                System.out.println((i+1)+"-nombre: "+ nombres[i]+"\n -hora: "+ horas[i]
                    +"\n -codigo: "+ codigo(codigo_servicio[i])
                 );
            }
        }
    }
    public static String codigo(int codigo){
      switch (codigo) {
        case 1:
            return "corte";
            
        case 2:
            return"tinte";
            
        case 3:
            return"manicure";
          
      
        default:System.out.println("no tiene codigo del 1 al 3");
            break;
      }
        return null;

    }
    public static void cancelarReserva(Scanner sc){
        if (reservas==0 ) {
            System.out.println("no hay reservas");
            return;
        }
        if (reservas==10) {
            System.out.println("ya estan llenas las reservas");
        }
        int numero=Validador.leerEntero(sc, "numero de la reserva");
          if (numero>reservas) {
            System.out.println("no hay reservas con ese numero");
            return;
        }
        for (int i = 0; i <reservas; i++) {
            if (i==(numero-1)) {
                nombres[i]="";
                horas[i]=0;
                codigo_servicio[i]=0;
    
            }else if (i>(numero-1) && i <reservas) {
                nombres[i-1]= nombres[i];
                horas[i-1]=horas[i];
                codigo_servicio[i-1]=codigo_servicio[i];
               
                nombres[i]="";
                horas[i]=0;
                codigo_servicio[i]=0;
                
            }
        }
         reservas--;
    }
    public static void reporte(){
        if (reservas==0) {
            System.out.println("no hay reservas");
            return;
        }
        System.out.println("dinero ganado: "+ acu);
        System.out.println("citas totales: "+ reservas);
    }
    public static void buscarCliente(Scanner sc){
         if (reservas==0) {
            System.out.println("no hay reservas");
            return;
        }
        String busca=Validador.leerTexto(sc, "nombre a buscar");
        for (int i = 0; i < reservas; i++) {
            if (nombres[i].equalsIgnoreCase(busca.trim())) {
                 System.out.println((i+1)+"-nombre: "+ nombres[i]+"\n -hora: "+ horas[i]
                    +"\n -codigo: "+ codigo(codigo_servicio[i])
                 );
            }
        }
    }
    public static void editarReserva(Scanner sc){
         if (reservas==0) {
            System.out.println("no hay reservas");
            return;
        }
        listar();
        int cita;
        do {
             cita=Validador.leerEntero(sc, "numero de la cita");
        if (cita>reservas) {
            System.out.println("no hay reservas con ese numero");
        }
        } while (cita>reservas);
        int hora;
        do {
            hora=Validador.leerEntero(sc, "hora nueva");
             System.out.println("verificando...");
        if (Validador.estaOcupada(hora)) {
            System.out.println("ya esta ocupada esta hora");
        }
        
        } while (Validador.estaOcupada(hora));
        System.out.println("actualizado");
       horas[cita-1]=hora;

    }
    public static void horasDisponibles(){
         if (reservas==0) {
            System.out.println("no hay reservas");
            return;
        }else if (reservas==10) {
        System.out.println("ya estan llenas las reservas");
        }else{
            int diponible[]={8,9,10,11,12,13,14,15,16,17};
            for (int i = 0; i < reservas; i++) {
              switch (horas[i]) {
                case 8:
                diponible[0]=0;
                    break;
                case 9:diponible[1]=0;
                    break;
                case 10:diponible[2]=0;
                    break;
                case 11:diponible[3]=0;
                    break;
                case 12:diponible[4]=0;
                    break;
                case 13:diponible[5]=0;
                    break;
                case 14:diponible[6]=0;
                    break;
                case 15:diponible[7]=0;
                    break;
                case 16:diponible[8]=0;
                    break;
                case 17:diponible[9]=0;
                    break;
                default:
                    break;
              }
            }
            for (int i = 0; i < diponible.length; i++) {
                if (diponible[i]!=0) {
                    System.out.println(diponible[i]);
                }
            }
        }
    }
    public static void servicioMax(){
        if (reservas==0) {
            System.out.println("no hay reservas");
            return;
        }
        int c1=0;
        int c2=0;
        int c3=0;
        for (int i = 0; i < reservas; i++) {
            switch (codigo_servicio[i]) {
                case 1:
                    c1++;
                    break;
                 case 2:
                    c2++;
                    break;
                 case 3:
                    c3++;
                    break;
            
                default:
                    break;
            }
        }
        if (c1==c2 && c1==c3) {
            System.out.println("los servicios mas pedidos son: ");
           System.out.println(codigo(1)); 
            System.out.println(codigo(2)); 
            System.out.println(codigo(3));   
        }
       if (c1==c2) {
        if (c1>c3) {
            System.out.println("los servicios mas pedidos son: ");
           System.out.println(codigo(1)); 
            System.out.println(codigo(2)); 
        }
       }else if (c1==3) {
        if (c1>c2) {
            System.out.println("los servicios mas pedidos son: ");
           System.out.println(codigo(1)); 
            System.out.println(codigo(3));   
        }
       }else if (c2==c3) {
        if (c2>c1) {
            System.out.println("los servicios mas pedidos son: ");
           System.out.println(codigo(2)); 
           System.out.println( codigo(3)); codigo(3);
        }
       }
        if (c1>c2 && c1>c3) {
            System.out.println("el mas servicio pedido es: ");
            System.out.println(codigo(1)); 
        }else if (c2>c1 && c2>c3) {
             System.out.println("el mas servicio pedido es: ");
           System.out.println( codigo(2));
        }else if (c3>c1 && c3>c2) {
             System.out.println("el mas servicio pedido es: ");
           System.out.println( codigo(3));
        }
        
    }
}

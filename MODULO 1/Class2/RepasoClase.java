import java.util.Scanner;

public class RepasoClase{
    public static void main(String[] args) {
        final double IVA=0.19;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese un número:");
        int numero = sc.nextInt(); 
        System.out.println("El número ingresado es: " + numero);
        System.out.println("El nombre ingresado es: " + nombre);
        
    }
}
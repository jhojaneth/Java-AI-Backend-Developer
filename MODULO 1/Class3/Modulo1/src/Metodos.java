public class Metodos {
public static void main(String[] args) {
    double propina=calcularPropina(88000, 0.15);
    System.out.println(propina);

}
 public static double calcularPropina(double subtotal, double porcentaje){
    return subtotal*porcentaje;
 }
 public static double carcularTotal(double subtotal,double porcentaje){
    double propina=calcularPropina(subtotal, porcentaje);
    return subtotal + propina;
 }
}

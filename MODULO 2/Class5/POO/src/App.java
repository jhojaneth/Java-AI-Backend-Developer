import cuentaBancaria.CuentaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        //  Perro miPerro = new Perro();
        // miPerro.nombre = "Firulais";
        // miPerro.raza = "Labrador";
        // miPerro.ladrar();

        // Perro otroPerro = new Perro();
        // otroPerro.nombre = "Rocky";
        // otroPerro.ladrar();

        // Libro libro = new Libro();
        // libro.titulo = "Clean Code";
        // libro.autor = "Robert Martin";
        // libro.paginas = 464;
        // System.out.println(libro.descripcion());
        
        // Producto vacio = new Producto();
        // vacio.mostrar();

        // Producto cafe = new Producto("Cafe", 12000.0);
        // cafe.mostrar();
        CuentaBancaria cuenta=new CuentaBancaria("hoal","1123",200);
       System.out.println(cuenta.getSaldo());
    }
}

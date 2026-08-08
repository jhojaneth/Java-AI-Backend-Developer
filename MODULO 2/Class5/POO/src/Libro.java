public class Libro {
    String titulo;
    String autor;
    int paginas;
    Libro(){
        this.titulo="sin nombre";
        this.paginas=0;
        this.autor="sin nombre";
    }
    
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    String descripcion() {
        return titulo + " de " + autor + " (" + paginas + " paginas)";
    }
}

package model;

public class Socio {
    private int id;
    private String nombre;
    private String plan;
    public Socio(int id,String nombre, String plan) {
        this.nombre = nombre;
        this.plan=plan;
        this.id=id;
    }

    public Socio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }
}

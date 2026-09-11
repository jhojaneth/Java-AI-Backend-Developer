package com.devSenior.campusFlow.cursos.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

import com.devSenior.campusFlow.usuarios.model.Usuario;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Usuario instructor;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "curso_estudiante",
        joinColumns = @JoinColumn(name = "curso_id"),
        inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
private List<Usuario> estudiantes = new ArrayList<>(); 

    public Curso() {
    }

    public Usuario getInstructor() {
        return instructor;
    }

    public void setInstructor(Usuario instructor) {
        this.instructor = instructor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Usuario> estudiantes) {
        this.estudiantes = estudiantes;
    }
}

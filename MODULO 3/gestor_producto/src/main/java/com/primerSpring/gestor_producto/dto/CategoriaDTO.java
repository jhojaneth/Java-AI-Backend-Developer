package com.primerSpring.gestor_producto.dto;

import com.primerSpring.gestor_producto.model.Categoria;

public class CategoriaDTO {
    private  String nombre;
    private Long id;

    public CategoriaDTO(Categoria categoria)  {
        this.id=categoria.getId();
        this.nombre=categoria.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }
}

package com.primerSpring.gestor_producto.dto;

import com.primerSpring.gestor_producto.model.Producto;

public class ProductoDTO {
    private Long id;
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;
    private String marca;

    public ProductoDTO(Producto producto) {
        this.id = producto.id();
        this.nombre = producto.nombre();
        this.precio = producto.precio();
        this.stock = producto.stock();
        this.categoria = producto.categoria() != null
                ? producto.categoria().getNombre() : null;
        this.marca = producto.marca() != null
                ? producto.marca().getNombre() : null;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }
}

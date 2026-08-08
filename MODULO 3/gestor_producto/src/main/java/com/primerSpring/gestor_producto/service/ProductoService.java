package com.primerSpring.gestor_producto.service;


import com.primerSpring.gestor_producto.model.Categoria;
import com.primerSpring.gestor_producto.model.Marca;
import com.primerSpring.gestor_producto.model.Producto;
import com.primerSpring.gestor_producto.repository.CategoriaRepository;
import com.primerSpring.gestor_producto.repository.MarcaRepository;
import com.primerSpring.gestor_producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;
    private final CategoriaRepository categoriaRepository;
    private final MarcaRepository marcaRepository;
@Autowired
    public ProductoService(ProductoRepository productoRepository,
                           CategoriaRepository categoriaRepository,
                           MarcaRepository marcaRepository) {
        this.productoRepository = productoRepository;
        this.categoriaRepository = categoriaRepository;
        this.marcaRepository = marcaRepository;
    }

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public List<Producto> listarPorCategoria(Long categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId);
    }

    public Producto agregarProducto(Producto producto) {
        resolverCategoria(producto);
        resolverMarca(producto);
        return productoRepository.save(producto);
    }
    private void resolverCategoria(Producto producto) {
        if (producto.categoria() != null
                && producto.categoria().getId() != null) {
            Categoria categoria = categoriaRepository
                    .findById(producto.categoria().getId())
                    .orElse(null);
            producto.setCategoria(categoria);
        }
    }

    private void resolverMarca(Producto producto) {
        if (producto.marca() != null
                && producto.marca().getId() != null) {
            Marca marca = marcaRepository
                    .findById(producto.marca().getId())
                    .orElse(null);
            producto.setMarca(marca);
        }
    }
}

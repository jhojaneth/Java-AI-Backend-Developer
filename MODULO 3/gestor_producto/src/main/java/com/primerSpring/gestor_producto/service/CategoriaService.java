package com.primerSpring.gestor_producto.service;

import com.primerSpring.gestor_producto.model.Categoria;
import com.primerSpring.gestor_producto.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }
    public Categoria agregarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}

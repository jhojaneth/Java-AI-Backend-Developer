package com.primerSpring.gestor_producto.controller;

import com.primerSpring.gestor_producto.model.Categoria;
import com.primerSpring.gestor_producto.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    @GetMapping
    public List<Categoria> obtenerCategorias() {
        return categoriaService.listarCategorias();
    }
    @PostMapping
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return categoriaService.agregarCategoria(categoria);
    }
}

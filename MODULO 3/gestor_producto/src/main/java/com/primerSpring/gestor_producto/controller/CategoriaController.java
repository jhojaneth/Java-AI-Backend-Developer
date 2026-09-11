package com.primerSpring.gestor_producto.controller;

import com.primerSpring.gestor_producto.dto.CategoriaDTO;
import com.primerSpring.gestor_producto.dto.ProductoDTO;
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
    public List<CategoriaDTO> obtenerCategorias() {
        return categoriaService.listarCategorias().stream()
                .map(CategoriaDTO::new)
                .toList();
    }
    @PostMapping("/crear")
    public CategoriaDTO crearCategoria(@RequestBody Categoria categoria) {
        Categoria guardado=categoriaService.agregarCategoria(categoria);
        return new CategoriaDTO(guardado);
    }
}

package com.primerSpring.gestor_producto.service;


import com.primerSpring.gestor_producto.model.Marca;
import com.primerSpring.gestor_producto.repository.MarcaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {
    private final MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<Marca> listarMarcas() {
        return marcaRepository.findAll();
    }

    public Marca agregarMarca(Marca marca) {
        return marcaRepository.save(marca);
    }
}

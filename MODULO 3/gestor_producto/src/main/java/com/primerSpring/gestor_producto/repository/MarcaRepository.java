package com.primerSpring.gestor_producto.repository;

import com.primerSpring.gestor_producto.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca,Long> {

}

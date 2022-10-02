package com.articulos.ap2.repository;

import com.articulos.ap2.modelo.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository  extends JpaRepository<Articulo, Integer> {
}

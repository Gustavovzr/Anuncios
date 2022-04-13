package com.aplicacao.anuncios.repositories;

import com.aplicacao.anuncios.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado,Integer> {
}

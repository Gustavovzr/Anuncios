package com.aplicacao.anuncios.repositories;

import com.aplicacao.anuncios.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}

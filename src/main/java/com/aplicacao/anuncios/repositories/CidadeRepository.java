package com.aplicacao.anuncios.repositories;

import com.aplicacao.anuncios.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade,Integer> {
}

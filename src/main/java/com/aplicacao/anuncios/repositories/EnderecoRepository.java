package com.aplicacao.anuncios.repositories;

import com.aplicacao.anuncios.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
}

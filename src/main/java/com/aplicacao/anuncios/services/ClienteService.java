package com.aplicacao.anuncios.services;

import com.aplicacao.anuncios.domain.Cliente;
import com.aplicacao.anuncios.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;

    public Cliente find(Integer id){
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public List<Cliente> findAll(){
        List<Cliente> list = repo.findAll();
        return list;
    }

}

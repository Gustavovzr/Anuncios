package com.aplicacao.anuncios;

import com.aplicacao.anuncios.domain.Cidade;
import com.aplicacao.anuncios.domain.Cliente;
import com.aplicacao.anuncios.domain.Endereco;
import com.aplicacao.anuncios.domain.Estado;
import com.aplicacao.anuncios.domain.enums.TipoCliente;
import com.aplicacao.anuncios.repositories.CidadeRepository;
import com.aplicacao.anuncios.repositories.ClienteRepository;
import com.aplicacao.anuncios.repositories.EnderecoRepository;
import com.aplicacao.anuncios.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Arrays;

@SpringBootApplication
public class Anuncios implements CommandLineRunner {
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidade;
	@Autowired
	private ClienteRepository cliente;
	@Autowired
	private EnderecoRepository endereco;

	public static void main(String[] args) {
		SpringApplication.run(Anuncios.class, args);
	}

@Override
	public void run(String... args)throws Exception{
		Estado e = new Estado(null,"sao paulo");
		Cidade c = new Cidade(null,"limeira",e);

		estadoRepository.saveAll(Arrays.asList(e));
		cidade.saveAll(Arrays.asList(c));


		Cliente cli = new Cliente(null,"tavinho","gustavo@gmail.com","44573099824", TipoCliente.PESSOAFISICA);
		cli.getTelefone().add("987454909");
		Cliente cli2 = new Cliente(null,"big","big@gmail.com","44573099824", TipoCliente.PESSOAFISICA);
		cli2.getTelefone().add("555555555");
		Endereco en = new Endereco(null,"perola","337","","vila queiroz","13485039",cli,c);

		cliente.saveAll(Arrays.asList(cli,cli2));
		endereco.saveAll(Arrays.asList(en));

	}
}

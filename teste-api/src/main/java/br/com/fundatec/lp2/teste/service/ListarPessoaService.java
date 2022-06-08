package br.com.fundatec.lp2.teste.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.PessoaRepository;
import br.com.fundatec.lp2.teste.repository.impl.PessoaRepositoryImpl;

@Service
public class ListarPessoaService {

	private final PessoaRepository pessoaRepository;

	public ListarPessoaService() {
		this.pessoaRepository = new PessoaRepositoryImpl();
	}
	
	public List<Pessoa> listar() {
		return pessoaRepository.listar();
	}

}

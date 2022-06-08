package br.com.fundatec.lp2.teste.service;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.PessoaRepository;
import br.com.fundatec.lp2.teste.repository.impl.PessoaRepositoryImpl;

@Service
public class CriarPessoaService {
	
	private final PessoaRepository pessoaRepository;

	public CriarPessoaService() {
		this.pessoaRepository = new PessoaRepositoryImpl();
	}
	
	public Pessoa criar(Pessoa pessoa) {
		// regras validação
		return pessoaRepository.criar(pessoa);
	}
}

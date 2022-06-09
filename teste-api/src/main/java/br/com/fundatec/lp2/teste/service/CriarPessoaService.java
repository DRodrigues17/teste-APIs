package br.com.fundatec.lp2.teste.service;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.PessoaRepository;

@Service
public class CriarPessoaService {
	
	private final PessoaRepository pessoaRepository;

	public CriarPessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public Pessoa criar(Pessoa pessoa) {
		// regras validação
		return pessoaRepository.save(pessoa);
	}
}

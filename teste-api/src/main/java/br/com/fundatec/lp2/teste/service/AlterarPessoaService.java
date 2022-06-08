package br.com.fundatec.lp2.teste.service;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.PessoaRepository;
import br.com.fundatec.lp2.teste.repository.impl.PessoaRepositoryImpl;

@Service
public class AlterarPessoaService {

	private final PessoaRepository pessoaRepository;

	public AlterarPessoaService() {
		this.pessoaRepository = new PessoaRepositoryImpl();
	}
	
	public void alterar(String cpf, Pessoa pessoa) {
		// regras de validação
		// alterar dados da pessoa
		pessoaRepository.alterar(pessoa);
	}
}

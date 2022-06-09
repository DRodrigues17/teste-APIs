package br.com.fundatec.lp2.teste.service;

import br.com.fundatec.lp2.teste.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.OldPessoaRepository;
import br.com.fundatec.lp2.teste.repository.impl.OldPessoaRepositoryImpl;

@Service
public class AlterarPessoaService {

	private final PessoaRepository pessoaRepository;

	public AlterarPessoaService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public void alterar(String cpf, Pessoa pessoa) {
		// regras de validação
		// alterar dados da pessoa
		//pessoaRepository.alterar(pessoa);
	}
}

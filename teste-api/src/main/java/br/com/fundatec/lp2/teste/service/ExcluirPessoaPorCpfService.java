package br.com.fundatec.lp2.teste.service;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.repository.PessoaRepository;


@Service
public class ExcluirPessoaPorCpfService {

	private final PessoaRepository pessoaRepository;

	public ExcluirPessoaPorCpfService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}

	public void excluirPorCpf(String cpf) {
		pessoaRepository.deleteByCpf(cpf);
	}
}

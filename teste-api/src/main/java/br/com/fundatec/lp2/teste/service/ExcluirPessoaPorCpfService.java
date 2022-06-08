package br.com.fundatec.lp2.teste.service;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.repository.PessoaRepository;
import br.com.fundatec.lp2.teste.repository.impl.PessoaRepositoryImpl;

@Service
public class ExcluirPessoaPorCpfService {

	private final PessoaRepository pessoaRepository;

	public ExcluirPessoaPorCpfService() {
		this.pessoaRepository = new PessoaRepositoryImpl();
	}
	
	public void excluirPorCpf(String cpf) {
		pessoaRepository.excluirPorCpf(cpf);
	}
}

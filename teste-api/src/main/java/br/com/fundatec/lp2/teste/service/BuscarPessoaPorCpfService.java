package br.com.fundatec.lp2.teste.service;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.exception.NotFoundException;
import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.PessoaRepository;
import br.com.fundatec.lp2.teste.repository.impl.PessoaRepositoryImpl;

@Service
public class BuscarPessoaPorCpfService {

	private final PessoaRepository pessoaRepository;

	public BuscarPessoaPorCpfService() {
		this.pessoaRepository = new PessoaRepositoryImpl();
	}

	public Pessoa buscarPorCpf(String cpf) {
		return pessoaRepository.buscarPorCpf(cpf)
				.orElseThrow(() -> new NotFoundException("Pessoa não encontrada"));
	}

}

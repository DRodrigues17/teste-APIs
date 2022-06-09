package br.com.fundatec.lp2.teste.service;

import org.springframework.stereotype.Service;

import br.com.fundatec.lp2.teste.exception.NotFoundException;
import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.PessoaRepository;

@Service
public class BuscarPessoaPorCpfService {

	private final PessoaRepository pessoaRepository;

	public BuscarPessoaPorCpfService(PessoaRepository pessoaRepository) {
		this.pessoaRepository = pessoaRepository;
	}


	public Pessoa buscarPorCpf(String cpf) {
		return pessoaRepository.findByCpf(cpf)
				.orElseThrow(() -> new NotFoundException("Pessoa não encontrada"));
	}

}

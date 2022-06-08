package br.com.fundatec.lp2.teste.repository.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.repository.PessoaRepository;

public class PessoaRepositoryImpl implements PessoaRepository {
	
	private static final Map<String, Pessoa> PESSOAS = new HashMap<>();
	
	static {
		String cpf = "0123456789";
		Pessoa pessoa = Pessoa.builder()
				.id(1)
				.cpf(cpf)
				.nome("João")
				.dataNascimento(LocalDate.of(2000, 1, 1))
				.build();
		
		PESSOAS.put(cpf, pessoa);
	}

	@Override
	public List<Pessoa> listar() {
		return new ArrayList<>(PESSOAS.values());
	}

	@Override
	public Optional<Pessoa> buscarPorCpf(String cpf) {
		return Optional.ofNullable(PESSOAS.get(cpf));
	}

	@Override
	public Pessoa criar(Pessoa pessoa) {
		return PESSOAS.put(pessoa.getCpf(), pessoa);
	}

	@Override
	public void alterar(Pessoa pessoa) {
		PESSOAS.put(pessoa.getCpf(), pessoa);
	}

	@Override
	public void excluirPorCpf(String cpf) {
		PESSOAS.remove(cpf);
	}

}

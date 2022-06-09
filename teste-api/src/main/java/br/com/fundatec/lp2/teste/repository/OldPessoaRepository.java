package br.com.fundatec.lp2.teste.repository;

import java.util.List;
import java.util.Optional;

import br.com.fundatec.lp2.teste.model.Pessoa;

public interface OldPessoaRepository {
	
	List<Pessoa> listar();
	
	Optional<Pessoa> buscarPorCpf(String cpf);
	
	Pessoa criar(Pessoa pessoa);
	
	void alterar(Pessoa pessoa);
	
	void excluirPorCpf(String cpf);

}

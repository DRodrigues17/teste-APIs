package br.com.fundatec.lp2.teste.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fundatec.lp2.teste.controller.AlterarPessoaController;
import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.service.AlterarPessoaService;

@RestController
public class AlterarPessoaControllerImpl implements AlterarPessoaController {

	private final AlterarPessoaService service;

	@Autowired
	public AlterarPessoaControllerImpl(AlterarPessoaService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<Void> alterar(String cpf, Pessoa pessoa) {
		service.alterar(cpf, pessoa);
		return ResponseEntity.noContent().build();
	}
}

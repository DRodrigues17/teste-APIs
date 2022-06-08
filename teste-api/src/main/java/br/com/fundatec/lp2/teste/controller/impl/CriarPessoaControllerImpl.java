package br.com.fundatec.lp2.teste.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fundatec.lp2.teste.controller.CriarPessoaController;
import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.service.CriarPessoaService;

@RestController
public class CriarPessoaControllerImpl 
	implements CriarPessoaController {

	private final CriarPessoaService service;

	@Autowired
	public CriarPessoaControllerImpl(CriarPessoaService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<Pessoa> criar(Pessoa pessoa) {
		Pessoa pessoaCriada = service.criar(pessoa);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(pessoaCriada);
	}
	
}

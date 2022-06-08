package br.com.fundatec.lp2.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fundatec.lp2.teste.model.Pessoa;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/pessoas")
public interface CriarPessoaController {

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	ResponseEntity<Pessoa> criar(@RequestBody Pessoa pessoa);
}

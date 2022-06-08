package br.com.fundatec.lp2.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.fundatec.lp2.teste.model.Pessoa;

@RequestMapping("/api/pessoas")
public interface AlterarPessoaController {

	@PutMapping("/{cpf}")
	@ResponseStatus(HttpStatus.OK)
	ResponseEntity<Void> alterar(
			@PathVariable("cpf") String cpf, 
			@RequestBody Pessoa pessoa);

}

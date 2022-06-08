package br.com.fundatec.lp2.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/pessoas")
public interface ExcluirPessoaPorCpfController {

	@DeleteMapping("/{cpf}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	ResponseEntity<Void> excluir(@PathVariable("cpf") String cpf);
}

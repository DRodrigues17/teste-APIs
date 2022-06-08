package br.com.fundatec.lp2.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fundatec.lp2.teste.model.Pessoa;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/pessoas")
public interface BuscarPessoaPorCpfController {

	@GetMapping("/{cpf}")
	@ResponseStatus(HttpStatus.FOUND)
	ResponseEntity<Pessoa> buscarPorCpf(@PathVariable("cpf") String cpf);
}

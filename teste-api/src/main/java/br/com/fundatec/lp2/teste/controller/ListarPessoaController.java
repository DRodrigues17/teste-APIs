package br.com.fundatec.lp2.teste.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fundatec.lp2.teste.dto.response.PessoaResponseDTO;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/pessoas")
public interface ListarPessoaController {

	@GetMapping
	@ResponseStatus(HttpStatus.ACCEPTED)
	ResponseEntity<List<PessoaResponseDTO>> listar();
}

package br.com.fundatec.lp2.teste.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fundatec.lp2.teste.controller.ListarPessoaController;
import br.com.fundatec.lp2.teste.converter.response.PessoaResponseConverter;
import br.com.fundatec.lp2.teste.dto.response.PessoaResponseDTO;
import br.com.fundatec.lp2.teste.service.ListarPessoaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ListarPessoaControllerImpl 
	implements ListarPessoaController {

	private final ListarPessoaService service;
	private final PessoaResponseConverter responseConverter;

	@Override
	public ResponseEntity<List<PessoaResponseDTO>> listar() {
		return ResponseEntity.ok(service.listar()
				.stream()
				.map(responseConverter::convert)
				.collect(Collectors.toList()));
	}
	
}

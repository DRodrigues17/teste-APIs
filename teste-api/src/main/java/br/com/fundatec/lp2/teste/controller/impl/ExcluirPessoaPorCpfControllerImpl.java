package br.com.fundatec.lp2.teste.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fundatec.lp2.teste.controller.ExcluirPessoaPorCpfController;
import br.com.fundatec.lp2.teste.service.ExcluirPessoaPorCpfService;

@RestController
public class ExcluirPessoaPorCpfControllerImpl
	implements ExcluirPessoaPorCpfController {

	private final ExcluirPessoaPorCpfService service;

	@Autowired
	public ExcluirPessoaPorCpfControllerImpl(
			ExcluirPessoaPorCpfService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<Void> excluir(String cpf) {
		service.excluirPorCpf(cpf);
		return ResponseEntity.noContent().build();
	}
}

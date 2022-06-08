package br.com.fundatec.lp2.teste.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.fundatec.lp2.teste.controller.BuscarPessoaPorCpfController;
import br.com.fundatec.lp2.teste.model.Pessoa;
import br.com.fundatec.lp2.teste.service.BuscarPessoaPorCpfService;

@RestController
public class BuscarPessoaPorCpfControllerImpl
	implements BuscarPessoaPorCpfController {

	private final BuscarPessoaPorCpfService service;

	@Autowired
	public BuscarPessoaPorCpfControllerImpl(BuscarPessoaPorCpfService service) {
		this.service = service;
	}
	
	@Override
	public ResponseEntity<Pessoa> buscarPorCpf(String cpf) {
		return ResponseEntity.ok(service.buscarPorCpf(cpf));
	}
}

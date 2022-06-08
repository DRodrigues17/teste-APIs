package br.com.fundatec.lp2.teste.dto.request;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PessoaRequestDTO {

	private final String cpf;
	private final String nome;
	private final LocalDate dataNascimento;
}

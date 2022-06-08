package br.com.fundatec.lp2.teste.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pessoa implements Model {
	
	private Integer id;
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;

}

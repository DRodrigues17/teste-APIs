package br.com.fundatec.lp2.teste.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
public class Pessoa implements Model {

	@Id
	@GeneratedValue
	private Integer id;
	private String cpf;
	private String nome;
	private LocalDate dataNascimento;

}

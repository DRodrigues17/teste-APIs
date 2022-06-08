package br.com.fundatec.lp2.teste.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaResponseDTO implements ResponseDTO {

	private String cpf;
	private String nome;
}

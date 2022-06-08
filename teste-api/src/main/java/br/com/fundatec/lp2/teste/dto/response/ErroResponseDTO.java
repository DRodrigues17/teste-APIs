package br.com.fundatec.lp2.teste.dto.response;

import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class ErroResponseDTO implements ResponseDTO {

	private final String mensagem;
	private final LocalDateTime dataHora;
	
	public ErroResponseDTO(String mensagem) {
		this.mensagem = mensagem;
		this.dataHora = LocalDateTime.now();
	}
	
}

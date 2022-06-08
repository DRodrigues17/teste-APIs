package br.com.fundatec.lp2.teste.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BadRequestException 
	extends RuntimeException {

	private final String mensagem;

	public BadRequestException(String message, String mensagem) {
		super(message);
		this.mensagem = mensagem;
	}

	public BadRequestException(String message, Throwable cause, String mensagem) {
		super(message, cause);
		this.mensagem = mensagem;
	}
}

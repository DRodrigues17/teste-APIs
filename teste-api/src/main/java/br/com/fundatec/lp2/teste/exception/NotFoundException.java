package br.com.fundatec.lp2.teste.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class NotFoundException
	extends RuntimeException {

	private String mensagem;
	private HttpStatus httpStatus;
	private ZonedDateTime timestamp;

	public NotFoundException(String mensagem, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timestamp) {
		this.mensagem = mensagem;
		this.httpStatus = httpStatus;
		this.timestamp = timestamp;
	}

	public NotFoundException(String pessoa_não_encontrada) {
	}

	public String getMensagem() {
		return mensagem;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public ZonedDateTime getTimestamp() {
		return timestamp;
	}
}

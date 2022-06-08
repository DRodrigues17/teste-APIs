package br.com.fundatec.lp2.teste.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.fundatec.lp2.teste.dto.response.ErroResponseDTO;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestControllerAdvice
public class RestExceptionHandler 
	extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<ErroResponseDTO> handleBadRequestException(
			BadRequestException exception) {
		ErroResponseDTO erro = new ErroResponseDTO(exception.getMensagem());
		return new ResponseEntity<>(erro, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErroResponseDTO> handleNotFoundException(
			NotFoundException exception) {
		ErroResponseDTO erro = new ErroResponseDTO(exception.getMensagem());
		return new ResponseEntity<>(erro, HttpStatus.NOT_FOUND);
	}

}

package br.com.fundatec.lp2.teste.converter.response;

import br.com.fundatec.lp2.teste.dto.response.ResponseDTO;
import br.com.fundatec.lp2.teste.model.Model;

public interface ResponseConverter<M extends Model, R extends ResponseDTO> {

	R convert(M model);
}

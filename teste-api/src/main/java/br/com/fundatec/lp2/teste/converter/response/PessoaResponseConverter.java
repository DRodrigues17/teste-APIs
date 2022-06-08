package br.com.fundatec.lp2.teste.converter.response;

import org.springframework.stereotype.Component;

import br.com.fundatec.lp2.teste.dto.response.PessoaResponseDTO;
import br.com.fundatec.lp2.teste.model.Pessoa;

@Component
public class PessoaResponseConverter 
	implements ResponseConverter<Pessoa, PessoaResponseDTO> {

	@Override
	public PessoaResponseDTO convert(Pessoa pessoa) {
		return PessoaResponseDTO.builder()
				.cpf(pessoa.getCpf())
				.nome(pessoa.getNome())
				.build();
	}

}

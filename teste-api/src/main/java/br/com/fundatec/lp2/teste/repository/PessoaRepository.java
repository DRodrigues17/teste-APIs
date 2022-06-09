package br.com.fundatec.lp2.teste.repository;

import br.com.fundatec.lp2.teste.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    Optional<Pessoa> findByCpf(String cpf);

    void deleteByCpf(String cpf);

}

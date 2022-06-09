package com.fundatec.aula10.repository;

import com.fundatec.aula10.model.Cidade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CidadeRepository extends CrudRepository<Cidade, Integer> {

    Optional<Cidade> findCidadeByNAme(String name);

    Optional<Cidade> findCidadeByNomeContains(String nome);
}

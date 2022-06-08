package com.fundatec.lp2.avaliativo5.repository;

import com.fundatec.lp2.avaliativo5.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}

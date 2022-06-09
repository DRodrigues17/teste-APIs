package com.fundatec.aula10.repository;

import com.fundatec.aula10.model.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Integer> {

}

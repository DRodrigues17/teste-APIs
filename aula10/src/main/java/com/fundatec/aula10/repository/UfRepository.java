package com.fundatec.aula10.repository;

import com.fundatec.aula10.model.Uf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UfRepository extends CrudRepository<Uf, Integer> {
}

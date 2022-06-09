package com.fundatec.aula10.service;

import com.fundatec.aula10.model.Pais;
import com.fundatec.aula10.repository.PaisRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaisService {

    private final PaisRepository repository;

    public PaisService(PaisRepository repository) {
        this.repository = repository;
    }

    public Optional<Pais> fingById(Integer id){
        return repository.findById(id);
    }

    public Iterable<Pais> findAll(){
        return repository.findAll();
    }

    public Pais salvar(Pais pais){
        return repository.save(pais);
    }

    public Pais atualizar(Pais pais){
        return repository.save(pais);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}

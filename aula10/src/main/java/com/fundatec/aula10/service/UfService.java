package com.fundatec.aula10.service;

import com.fundatec.aula10.model.Uf;
import com.fundatec.aula10.repository.UfRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UfService {

    private final UfRepository repository;

    public UfService(UfRepository repository) {
        this.repository = repository;
    }


    public Optional<Uf> fingById(Integer id){
        return repository.findById(id);
    }

    public Iterable<Uf> findAll(){
        return repository.findAll();
    }

    public Uf salvar(Uf uf){
        return repository.save(uf);
    }

    public Uf atualizar(Uf uf){
        return repository.save(uf);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}

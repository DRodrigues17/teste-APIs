package com.fundatec.aula10.service;

import com.fundatec.aula10.model.Cidade;
import com.fundatec.aula10.repository.CidadeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    private final CidadeRepository repository;

    public CidadeService(CidadeRepository repository) {
        this.repository = repository;
    }

    public Optional<Cidade> fingById(Integer id){
        return repository.findById(id);
    }

    public Iterable<Cidade> findAll(){
        return repository.findAll();
    }

    public Cidade salvar(Cidade cidade){
        return repository.save(cidade);
    }

    public Cidade atualizar(Cidade cidade){
        return repository.save(cidade);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

    public Optional<Cidade> findByLike(String nome){
        return  repository.findCidadeByNomeContains(nome);
    }
}

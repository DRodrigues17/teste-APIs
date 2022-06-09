package com.fundatec.aula10.service;

import com.fundatec.aula10.model.Endereco;
import com.fundatec.aula10.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoService {

    private final EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    public Optional<Endereco> fingById(Integer id){
        return repository.findById(id);
    }

    public Iterable<Endereco> findAll(){
        return repository.findAll();
    }

    public Endereco salvar(Endereco endereco){
        return repository.save(endereco);
    }

    public Endereco atualizar(Endereco endereco){
        return repository.save(endereco);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }

}

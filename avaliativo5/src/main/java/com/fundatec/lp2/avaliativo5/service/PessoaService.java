package com.fundatec.lp2.avaliativo5.service;

import com.fundatec.lp2.avaliativo5.model.Pessoa;
import com.fundatec.lp2.avaliativo5.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Optional<Pessoa> fingById(Integer id){
        return repository.findById(id);
    }

    public Iterable<Pessoa> findAll(){
        return repository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa){
        return repository.save(pessoa);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}

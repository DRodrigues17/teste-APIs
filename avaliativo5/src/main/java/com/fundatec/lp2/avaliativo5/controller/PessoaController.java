package com.fundatec.lp2.avaliativo5.controller;

import com.fundatec.lp2.avaliativo5.model.Pessoa;
import com.fundatec.lp2.avaliativo5.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/pessoa")
public class PessoaController {


    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping("/{id}")
    public Pessoa findCountryById(@PathVariable("id") Integer id){
        Optional<Pessoa> optionalPessoa = pessoaService.fingById(id);
        if (optionalPessoa.isPresent())
            return optionalPessoa.get();

        return null;
    }

    @GetMapping
    public  Iterable<Pessoa> findAll(){
        return  pessoaService.findAll();
    }

    @PostMapping
    public Pessoa salvar(@RequestBody Pessoa pessoa){
        return pessoaService.salvar(pessoa);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        pessoaService.delete(id);
    }
}

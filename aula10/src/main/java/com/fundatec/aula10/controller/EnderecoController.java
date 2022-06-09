package com.fundatec.aula10.controller;


import com.fundatec.aula10.model.Endereco;
import com.fundatec.aula10.model.Pais;
import com.fundatec.aula10.service.EnderecoService;
import com.fundatec.aula10.service.PaisService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/endereco")
public class
EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @GetMapping("/{id}")
    public Endereco findAdressById(@PathVariable("id") Integer id){
        Optional<Endereco> optionalAdress = enderecoService.fingById(id);
        if (optionalAdress.isPresent())
            return optionalAdress.get();

        return null;
    }

    @GetMapping
    public  Iterable<Endereco> findAll(){
        return  enderecoService.findAll();
    }

    @PostMapping
    public Endereco salvar(@RequestBody Endereco endereco){
        return enderecoService.salvar(endereco);
    }


    @PutMapping
    public Endereco atualizar(@RequestBody Endereco endereco){
        return enderecoService.atualizar(endereco);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        enderecoService.delete(id);
    }
}

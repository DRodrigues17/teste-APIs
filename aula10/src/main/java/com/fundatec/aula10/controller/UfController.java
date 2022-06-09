package com.fundatec.aula10.controller;


import com.fundatec.aula10.model.Uf;
import com.fundatec.aula10.service.UfService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/uf")
public class
UfController {

    private final UfService ufService;

    public UfController(UfService ufService) {
        this.ufService = ufService;
    }


    @GetMapping("/{id}")
    public Uf findUfById(@PathVariable("id") Integer id){
        Optional<Uf> optionalUf = ufService.fingById(id);
        if (optionalUf.isPresent())
            return optionalUf.get();

        return null;
    }

    @GetMapping
    public  Iterable<Uf> findAll(){
        return  ufService.findAll();
    }

    @PostMapping
    public Uf salvar(@RequestBody Uf uf){
        return ufService.salvar(uf);
    }


    @PutMapping
    public Uf atualizar(@RequestBody Uf uf){
        return ufService.atualizar(uf);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        ufService.delete(id);
    }
}

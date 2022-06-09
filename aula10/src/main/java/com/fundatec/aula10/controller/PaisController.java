package com.fundatec.aula10.controller;

import com.fundatec.aula10.model.Pais;
import com.fundatec.aula10.service.PaisService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/pais")
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping("/{id}")
    public Pais findCountryById(@PathVariable("id") Integer id){
        Optional<Pais> optionalCountry = paisService.fingById(id);
        if (optionalCountry.isPresent())
            return optionalCountry.get();

        return null;
    }

    @GetMapping
    public  Iterable<Pais> findAll(){
        return  paisService.findAll();
    }

    @PostMapping
    public Pais salvar(@RequestBody Pais pais){
        return paisService.salvar(pais);
    }


    @PutMapping
    public Pais atualizar(@RequestBody Pais pais){
        return paisService.atualizar(pais);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        paisService.delete(id);
    }
}

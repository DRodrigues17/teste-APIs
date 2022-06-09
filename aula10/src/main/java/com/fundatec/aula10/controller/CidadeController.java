package com.fundatec.aula10.controller;

import com.fundatec.aula10.model.Cidade;
import com.fundatec.aula10.service.CidadeService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/cidade")
public class CidadeController {

    private final CidadeService cidadeService;

    public CidadeController(CidadeService cidadeService) {
        this.cidadeService = cidadeService;
    }

    @GetMapping("/{id}")
    public Cidade findCityById(@PathVariable("id") Integer id){
        Optional<Cidade> optionalCity = cidadeService.fingById(id);
        if (optionalCity.isPresent())
            return optionalCity.get();

        return null;
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Sucesso na busca"),
            @ApiResponse(responseCode = "403", description = "Erro de permissao"),
            @ApiResponse(responseCode = "500", description = "Erro de infraestrutura"),
    })
    @Parameters(
            value = {
                    @Parameter(name = "xxxxxxß")
            }
    )

    @GetMapping
    public  Iterable<Cidade> findAll(){
        return  cidadeService.findAll();
    }

    @PostMapping
    public Cidade salvar(@RequestBody Cidade cidade){
        return cidadeService.salvar(cidade);
    }


    @PutMapping
    public Cidade atualizar(@RequestBody Cidade cidade){
        return cidadeService.atualizar(cidade);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        cidadeService.delete(id);
    }

    @GetMapping("/")
    public Cidade findByLike(@RequestParam("name") String nome){
        Optional<Cidade> optionalCity = cidadeService.findByLike(nome);
        if (optionalCity.isPresent())
            return optionalCity.get();

        return null;
    }
}

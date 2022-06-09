package com.fundatec.aula10.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column
    private Pais pais;

//    @Column
    private Uf uf;

//    @Column
    private Cidade cidade;

//    @Column
    private String logradouro;
}

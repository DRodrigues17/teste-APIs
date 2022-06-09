package com.fundatec.aula10.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Uf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "uf", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("uf")
    private Set<Cidade> cidades;

//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "pais_id", referencedColumnName = "id")
//    @JsonIgnoreProperties("ufs")
//    private Pais pais;}
}
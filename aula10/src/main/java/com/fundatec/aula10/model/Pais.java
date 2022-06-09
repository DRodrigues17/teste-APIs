package com.fundatec.aula10.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private Long population;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pais", cascade = CascadeType.ALL)
//    @JsonIgnoreProperties("pais")
//    private Set<UF> ufs;
}

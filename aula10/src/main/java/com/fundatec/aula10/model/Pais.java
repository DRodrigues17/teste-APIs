package com.fundatec.aula10.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Long population;

//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "pais", cascade = CascadeType.ALL)
//    @JsonIgnoreProperties("pais")
//    private Set<UF> ufs;
}

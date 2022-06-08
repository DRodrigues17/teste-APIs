package com.fundatec.lp2.avaliativo5.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_pessoa")
@Inheritance(strategy =  InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_pessoa", discriminatorType = DiscriminatorType.STRING)
public abstract class Pessoa {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Endereco endereco;
}

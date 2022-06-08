package com.fundatec.lp2.avaliativo5.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_pessoa_fisica")
@DiscriminatorValue("PF")
@EqualsAndHashCode(callSuper = true)
public class PesoaFisica extends Pessoa{

    @Column(nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private LocalDate dataNascimento;
}

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
@Table(name = "tb_pessoa_juridica")
@DiscriminatorValue("PJ")
@EqualsAndHashCode(callSuper = true)
public class PessoaJuridica extends Pessoa{

    @Column(nullable = false, length = 11)
    private String cnpj;

    @Column(nullable = false)
    private String razaoSocial;

    @Column(nullable = false)
    private LocalDate dataCriacao;
}

package com.fundatec.lp2.avaliativo5.model;

import com.fundatec.lp2.avaliativo5.Enum.TipoLogradouro;
import com.fundatec.lp2.avaliativo5.Enum.UnidadeFederativa;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Endereco {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoLogradouro tipoLogradouro;

    @Column(nullable = false)
    private String nomeLogradouro;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false)
    private String complemento;

    @Column(nullable = false, length = 11)
    private String cep;

    @Column(nullable = false)
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UnidadeFederativa uf;
}

package com.tdscompany.desafio.dominio;

import java.time.LocalDateTime;

public class FinancaEntity {

    private String nome;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataVencimento;
    private TagEntity tipoTag;
    private PessoaEntity pessoa;
}

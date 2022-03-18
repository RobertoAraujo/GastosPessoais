package com.tdscompany.desafio.dominio;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "financa")
public class FinancaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "dataEntrada")
    private LocalDateTime dataEntrada;
    @Column(name = "dataVencimento")
    private LocalDateTime dataVencimento;

    @Column(name = "TAG_id")
    private TagEntity tipoTag;

    @Column(name = "PESSOA_id")
    private PessoaEntity pessoa;

    @Column(name = "saldo")
    private double saldo;

    public FinancaEntity() {
    }

    public FinancaEntity(String descricao, LocalDateTime dataEntrada, LocalDateTime dataVencimento, TagEntity tipoTag, PessoaEntity pessoa, double saldo) {
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.dataVencimento = dataVencimento;
        this.tipoTag = tipoTag;
        this.pessoa = pessoa;
        this.saldo = saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public TagEntity getTipoTag() {
        return tipoTag;
    }

    public void setTipoTag(TagEntity tipoTag) {
        this.tipoTag = tipoTag;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancaEntity that = (FinancaEntity) o;
        return Double.compare(that.saldo, saldo) == 0 && Objects.equals(descricao, that.descricao) && Objects.equals(dataEntrada, that.dataEntrada) && Objects.equals(dataVencimento, that.dataVencimento) && Objects.equals(tipoTag, that.tipoTag) && Objects.equals(pessoa, that.pessoa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, dataEntrada, dataVencimento, tipoTag, pessoa, saldo);
    }

    @Override
    public String toString() {
        return "FinancaEntity{" +
                "descricao='" + descricao + '\'' +
                ", dataEntrada=" + dataEntrada +
                ", dataVencimento=" + dataVencimento +
                ", tipoTag=" + tipoTag +
                ", pessoa=" + pessoa +
                ", saldo=" + saldo +
                '}';
    }
}

package com.tdscompany.desafio.dominio;

import com.tdscompany.desafio.cosntatns.Sexo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "pessoa")
public class PessoaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cpf")
    private Long cpf;

    @Column (name = "nome")
    private String nome;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public PessoaEntity() {
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaEntity that = (PessoaEntity) o;
        return Objects.equals(cpf, that.cpf) && Objects.equals(nome, that.nome) && sexo == that.sexo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, sexo);
    }

    @Override
    public String toString() {
        return "PessoaEntity{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}

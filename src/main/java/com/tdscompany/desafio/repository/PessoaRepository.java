package com.tdscompany.desafio.repository;

import com.tdscompany.desafio.dominio.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, String> {
}

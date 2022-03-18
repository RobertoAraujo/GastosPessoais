package com.tdscompany.desafio.repository;

import com.tdscompany.desafio.dominio.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, String> {

//    List<PessoaEntity> findAllByNomeIsLike(String nome);
//
//    Optional<PessoaEntity> findById(Long id);
//
//    Optional<PessoaEntity> findAllById(Long id);
}

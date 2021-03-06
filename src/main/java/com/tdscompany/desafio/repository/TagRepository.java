package com.tdscompany.desafio.repository;

import com.tdscompany.desafio.dominio.TagEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<TagEntity, Long> {

}

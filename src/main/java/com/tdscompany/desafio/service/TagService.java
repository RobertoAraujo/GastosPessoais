package com.tdscompany.desafio.service;

import com.tdscompany.desafio.dominio.TagEntity;
import com.tdscompany.desafio.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagRepository repository;

    public void save(TagEntity tag){
        repository.save(tag);
    }

    public List<TagEntity> findAll(){
      return repository.findAll();
    }
}

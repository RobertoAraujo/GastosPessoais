package com.tdscompany.desafio.service;

import com.tdscompany.desafio.dominio.PessoaEntity;
import com.tdscompany.desafio.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;

    public void save(PessoaEntity pessoa){
        repository.save(pessoa);
    }

    public List<PessoaEntity> findAll(){
       return repository.findAll();
    }
}

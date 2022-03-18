package com.tdscompany.desafio.controller;

import com.tdscompany.desafio.dominio.PessoaEntity;
import com.tdscompany.desafio.repository.PessoaRepository;
import com.tdscompany.desafio.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @PostMapping(value = "/cadastro")
    public ResponseEntity<PessoaEntity> cadastra(@RequestBody PessoaEntity pessoa, UriComponentsBuilder uriBuilder){
        service.save(pessoa);
        URI uri = uriBuilder.path("/pessoa/{id}").buildAndExpand(pessoa.getCpf()).toUri();
        return ResponseEntity.created(uri).body(
                new PessoaEntity(pessoa.getId(),pessoa.getCpf(),pessoa.getNome(),pessoa.getSexo()));
    }

    @GetMapping(value = "/listar")
    public ResponseEntity<List<PessoaEntity>> listarTodos(){
        return ResponseEntity.ok(service.findAll());
    }

}

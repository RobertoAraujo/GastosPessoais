package com.tdscompany.desafio.controller;

import com.tdscompany.desafio.dominio.TagEntity;
import com.tdscompany.desafio.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.swing.text.html.HTML;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/vi/tag")
public class TagController {

    @Autowired
    private TagService service;

    @PostMapping(value = "/cadastro")
    public ResponseEntity<TagEntity> cadastrar(@RequestBody TagEntity tag, UriComponentsBuilder uriBuilder) {
        service.save(tag);
        URI uri = uriBuilder.path("/tag/{id}").buildAndExpand(tag.getId(), tag.getDescricao()).toUri();
        return ResponseEntity.created(uri).body(
                new TagEntity(tag.getId(), tag.getDescricao()));
    }

    @GetMapping (value = "/listar")
    public ResponseEntity<List<TagEntity>> listarTodos(){
        return ResponseEntity.ok(service.findAll());
    }

}

package com.iridavis.api.controller;

import com.iridavis.api.model.Pesquisa;
import com.iridavis.api.repository.PesquisaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pesquisa")
public class PesquisaController {

    @Autowired
    private PesquisaRepository repository;

    @GetMapping
    public List<Pesquisa> pesquisas() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pesquisa> detalhar(@PathVariable Long id) {
        Optional<Pesquisa> topico = repository.findById(id);
        if (topico.isPresent()) {
            return ResponseEntity.ok(topico.get());
        }
        return ResponseEntity.notFound().build();
    }
}

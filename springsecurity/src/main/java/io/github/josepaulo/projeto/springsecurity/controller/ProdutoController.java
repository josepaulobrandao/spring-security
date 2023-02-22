package io.github.josepaulo.projeto.springsecurity.controller;

import io.github.josepaulo.projeto.springsecurity.domain.Produto;
import io.github.josepaulo.projeto.springsecurity.domain.dto.ProdutoDTO;
import io.github.josepaulo.projeto.springsecurity.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {


    @Autowired
    private ProdutoRepository produtoRepository;
    @GetMapping( value = "/{id}")
    ResponseEntity<ProdutoDTO> findById(@PathVariable Integer id) {
        Optional<Produto> obj = produtoRepository.findById(id);
        return ResponseEntity.ok().body(new ProdutoDTO(obj));


    }
}

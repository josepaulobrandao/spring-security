package io.github.josepaulo.projeto.springsecurity.service;

import io.github.josepaulo.projeto.springsecurity.domain.Produto;
import io.github.josepaulo.projeto.springsecurity.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class DabaseService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void instancia() {
        Produto prod  = new Produto(1,"asdfasdf");
        produtoRepository.saveAll(Arrays.asList(prod));

    }
}

package io.github.josepaulo.projeto.springsecurity.domain.dto;

import io.github.josepaulo.projeto.springsecurity.domain.Produto;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public class ProdutoDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;


    public ProdutoDTO() {
    }

    public ProdutoDTO(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
    }

    public ProdutoDTO(Optional<Produto> obj) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}

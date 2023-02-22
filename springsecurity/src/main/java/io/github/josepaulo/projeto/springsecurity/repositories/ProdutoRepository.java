package io.github.josepaulo.projeto.springsecurity.repositories;

import io.github.josepaulo.projeto.springsecurity.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}

package io.github.josepaulo.projeto.springsecurity;

import io.github.josepaulo.projeto.springsecurity.domain.Produto;
import io.github.josepaulo.projeto.springsecurity.domain.dto.ProdutoDTO;
import io.github.josepaulo.projeto.springsecurity.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringsecurityApplication  {
	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityApplication.class, args);
	}
}

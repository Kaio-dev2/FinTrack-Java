package com.fintrack.fintrack.repository;

// imports sempre no topo, fora da classe
import com.fintrack.fintrack.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// interface, não class
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // vazio — Spring implementa os métodos automaticamente

}
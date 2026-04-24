package com.fintrack.fintrack.repository;

// imports sempre no topo, fora da classe
import com.fintrack.fintrack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// interface, não class
public interface UserRepository extends JpaRepository<User, Long> {

    // vazio — Spring implementa os métodos automaticamente

}
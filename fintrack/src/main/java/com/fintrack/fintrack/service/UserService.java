package com.fintrack.fintrack.service;

import com.fintrack.fintrack.repository.UserRepository;
import com.fintrack.fintrack.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // Spring injeta o UserRepository automaticamente aqui
    // você não precisa fazer "new UserRepository()"
    private final UserRepository userRepository;

    // Construtor — o Spring vê isso e injeta o repository
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // método que salva um usuário no banco
    public User salvar(User user) {
        return userRepository.save(user); // repository.save() já vem do JpaRepository
    }

}
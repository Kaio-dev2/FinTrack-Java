package com.fintrack.fintrack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

// @Configuration = Spring lê essa classe na inicialização
// ela contém instruções de como o sistema deve se comportar
@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        // libera todas as rotas temporariamente para testes
                        .anyRequest().permitAll()
                )
                // desativa CSRF temporariamente — reativa quando tiver login real
                .csrf(csrf -> csrf.disable());

        return http.build();
    }
}
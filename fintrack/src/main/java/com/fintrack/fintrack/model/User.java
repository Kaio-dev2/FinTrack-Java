package com.fintrack.fintrack.model;

// Aqui temos a importação de Get e Set automáticos do Lombok

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

// Importei essa bíblioteca para ter o valor correto do saldo

@Getter//declarei aqui o lembok get
@Setter// e aqui o set


public class User {

    private String nome;
    private String email;
    private String senha;
    private BigDecimal saldo;

}
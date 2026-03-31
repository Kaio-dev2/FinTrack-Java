package com.fintrack.fintrack.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class User {

    private String nome;
    private String email;
    private String senha;
    private BigDecimal saldo;

}
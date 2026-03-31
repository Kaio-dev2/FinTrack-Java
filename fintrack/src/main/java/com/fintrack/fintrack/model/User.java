package com.fintrack.fintrack.model;

import java.math.BigDecimal;

public class User {

    private String nome;
    private String email;
    private String senha;
    private BigDecimal saldo;


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public BigDecimal getSaldo(){
        return saldo;
    }
    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }
}

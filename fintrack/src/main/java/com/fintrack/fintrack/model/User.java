package com.fintrack.fintrack.model;


import jakarta.persistence.*;       //aqui importa o jakarta no caso o * importa tudo para os pacotes
import lombok.Getter;               //Lombok Get
import lombok.Setter;               //Lombok Set


// Importei essa bíblioteca para ter o valor correto do saldo
import java.math.BigDecimal;


// Aqui temos a importação de Get e Set automáticos do Lombok

@Getter     //declarei aqui o lembok get
@Setter     // e aqui o set

@Entity         //ele fala: essa classe vira tabela no banco
@Table(name = "usuarios") //ela fala: "o nome dessa tabela fica assim: "
public class User {



    @Id //Esse atributo é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Esse GeneratedValue ele gera o ID automaticamente
    private Long id;


    //declarei a classe privada para nn ser atribuida em outro lugar
    private String nome;
    private String email;
    private String senha;
    private BigDecimal saldo;

}
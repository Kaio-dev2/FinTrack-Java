package com.fintrack.fintrack.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;


@Setter
@Getter
@Entity
@Table(name = "produtos")
public class Produto {

 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String nome;
 private BigDecimal preco;
 private int quantidade;
}

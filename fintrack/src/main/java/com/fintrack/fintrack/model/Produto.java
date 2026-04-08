package com.fintrack.fintrack.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Getter


public class Produto {

 private String nome;
 private BigDecimal preco;
 private int quantidade;
}

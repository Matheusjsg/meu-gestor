package com.devprime.meuGestor.infrastructure.business.entities;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_entrada_itens")
public class EntradaItensEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoEntity produto;

    private Integer quantidade;

    private LocalDate dataEntrada = LocalDate.now();

    private BigDecimal precoCustoUnidade;




}

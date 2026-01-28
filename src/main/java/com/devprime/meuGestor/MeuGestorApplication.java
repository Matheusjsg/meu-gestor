package com.devprime.meuGestor;

import com.devprime.meuGestor.core.entities.Categoria;
import com.devprime.meuGestor.core.entities.Produto;
import com.devprime.meuGestor.core.gateway.ProdutoGateway;
import com.devprime.meuGestor.core.usecase.produto.BuscarProdutoNomeUsecase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class MeuGestorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeuGestorApplication.class, args);

        List<Categoria> minhasCategorias = new ArrayList<>();

        minhasCategorias.add (new Categoria(1, "Destilado"));
        minhasCategorias.add (new Categoria(2, "cerveja"));
        minhasCategorias.add (new Categoria(3, "energetico"));
        minhasCategorias.add (new Categoria(4, "suco"));


        ArrayList<Produto> produtosNovos = new ArrayList<>();

        produtosNovos.add(new Produto(1, "Skol", 1, 20, 96.20, 5));


    }
}
package com.devprime.meuGestor.core.exceptions;

public class ProdutoJaCadastradoException extends RuntimeException {
    public ProdutoJaCadastradoException(String nome) {
        super(nome + " Já cadastrado no sistema");
    }
}

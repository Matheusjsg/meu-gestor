package com.devprime.meuGestor.core.exceptions;

public class NomeNaoEncontradoException extends RuntimeException {

    public NomeNaoEncontradoException(String nome) {
        super(nome + " não foi localizado");
    }
}

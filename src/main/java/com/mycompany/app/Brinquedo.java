package com.mycompany.app;

public abstract class Brinquedo {
    private final String nome;
    
    public Brinquedo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void mover();
}


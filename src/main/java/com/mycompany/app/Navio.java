package com.mycompany.app;

public class Navio extends Brinquedo {
    public Navio (String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println("O navio " + getNome() + " está navegando.");
    }
}
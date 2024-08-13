package com.mycompany.app;

public class Helicoptero extends Brinquedo {

    public Helicoptero (String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println("O Helicoptero " + getNome() + " está voando.");
    }
}

package com.mycompany.app;

public class Caminhao extends Brinquedo {
    public Caminhao(String nome) {
        super(nome);
    }

    @Override
    public void mover() {
        System.out.println("O caminhão " + getNome() + " está se movendo.");
    }
}

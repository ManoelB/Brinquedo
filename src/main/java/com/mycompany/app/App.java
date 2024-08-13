package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        Brinquedo Caminhao = new Caminhao("Caminhãozinho");
        Brinquedo Helicoptero = new Helicoptero("Helicopterozinho");
        Brinquedo Navio = new Navio("Naviozinho");

        ControleRemoto controleCaminhao = new ControleRemoto(Caminhao);
        ControleRemoto controleHelicoptero = new ControleRemoto(Helicoptero);
        ControleRemoto controleNavio = new ControleRemoto(Navio);

        controleCaminhao.mover();
        controleHelicoptero.mover();
        controleNavio.mover();
    }
}

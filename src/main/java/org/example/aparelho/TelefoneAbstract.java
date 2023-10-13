package org.example.aparelho;

public abstract class TelefoneAbstract implements TelefoneInterface {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    @Override
    public void desligar() {
        System.out.println("desligando a ligação.");
    }


    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz.");
    }

}

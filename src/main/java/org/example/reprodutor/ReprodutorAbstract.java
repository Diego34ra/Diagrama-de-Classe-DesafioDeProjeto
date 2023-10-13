package org.example.reprodutor;

public abstract class ReprodutorAbstract implements ReprodutorInterface{

    @Override
    public void tocar() {
        System.out.println("Tocando a música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música.");
    }

    @Override
    public void selecionarMusica(String nome) {
        System.out.println(nome + " selecionada");
    }
}

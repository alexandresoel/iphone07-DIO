package com.alexandresoel.modelo;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, Camera, Navegador{
    @Override
    public void ligar(String Numero) {
        System.out.println("Realizando a ligação");
    }

    @Override
    public void atender() {
        System.out.println("Recebendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Correio de voz!");
    }

    @Override
    public void fotografar() {
        System.out.println("Fotografia realizada");
    }

    @Override
    public void filmar() {
        System.out.println("Filmagem realizada");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: "+url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso");

    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando!");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica "+musica+" escolhida");
        tocar();

    }
}

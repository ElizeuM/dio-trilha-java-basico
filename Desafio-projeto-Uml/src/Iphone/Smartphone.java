package Iphone;

import Iphone.Apps.Ipod.ReprodutorMusical;
import Iphone.Apps.MeuNavegador.NavegadorInternet;
import Iphone.Apps.Telefone.AparelhoTelefonico;

public class Smartphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página web");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}

package Iphone;

import Iphone.Apps.Ipod.AppMusica;
import Iphone.Apps.MeuNavegador.AppNavegador;
import Iphone.Apps.Telefone.AppTelefone;


public class Teste {
    public static void main(String[] args) {

        AppMusica appMusica = new AppMusica();

        appMusica.tocar();
        appMusica.pausar();
        appMusica.selecionarMusica();

        AppNavegador meuNavegador = new AppNavegador();
            
        meuNavegador.exibirPagina();
        meuNavegador.adicionarNovaAba();
        meuNavegador.atualizarPagina();

        AppTelefone appTelefone = new AppTelefone();

        appTelefone.ligar();
        appTelefone.atender();
        appTelefone.iniciarCorreioVoz();

        


    }
}


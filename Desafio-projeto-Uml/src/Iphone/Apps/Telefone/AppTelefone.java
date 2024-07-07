package Iphone.Apps.Telefone;

public class AppTelefone implements AparelhoTelefonico {

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

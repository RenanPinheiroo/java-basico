package Aparelho;

public class AparelhoApple extends AparelhoTelefonico{
    public void ligar (String numero){

        System.out.println("Voce esta ligando para o numero: " + numero);
    }

    public void atender(){

        System.out.println("Voce esta atendendo o telefone");
    }

    public void iniciarCorreioVoz(){

        System.out.println("Voce esta iniciando o Correio de Voz Apple");
    }
}

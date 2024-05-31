import Aparelho.AparelhoApple;
import Aparelho.AparelhoTelefonico;
import Navegador.Navegador;
import Navegador.NavegadorApple;
import Reprodutor.ReprodutorApple;
import Reprodutor.ReprodutorMusical;


public class Dispositivo {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorApple();

        reprodutor.pausar();
        reprodutor.tocar();
        reprodutor.selecionarMusica("Sozinho - Caetano Veloso");

        AparelhoTelefonico aparelho = new AparelhoApple();

        aparelho.ligar("9-9101-1084");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        Navegador navegador = new NavegadorApple();

        navegador.exibirPagina("www.google.com.br");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}

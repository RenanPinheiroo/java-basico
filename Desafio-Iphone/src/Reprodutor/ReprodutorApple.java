package Reprodutor;
public class ReprodutorApple extends ReprodutorMusical {

    public void tocar(){

        System.out.println("O reprodutor Musical Apple está tocando");
    }

    public void pausar(){

        System.out.println("O reprodutor musical esta pausado");
    }

    public void selecionarMusica(String musica){

        System.out.println("O reprodutor musical esta tocando: " + musica);
    }

}

package Navegador;

public class NavegadorApple extends Navegador{
    public void exibirPagina (String url){

        System.out.println("Voce esta conectando a pagina " + url);
    }

    public void adicionarNovaAba(){

        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(){

        System.out.println("Pagina atualizada");
    }

}

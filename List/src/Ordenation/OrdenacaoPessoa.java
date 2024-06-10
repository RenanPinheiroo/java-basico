package Ordenation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){

        pessoaList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collection.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    



}

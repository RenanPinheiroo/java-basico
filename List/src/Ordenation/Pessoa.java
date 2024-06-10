package Ordenation;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    
    private String name;

    private int idade;

    private double altura;

    public Pessoa(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;
    }
    public int compareTo(Pessoa p){
        return  Intereger.compare(idade, p.getIdade());
    }

    public String getName() {
        return name;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("name=").append(name);
        sb.append(", idade=").append(idade);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }


    
    
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        // TODO Auto-generated method stub
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

    


}
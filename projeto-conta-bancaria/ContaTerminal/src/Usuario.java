import java.util.Locale;
import java.util.Scanner;


public class Usuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome?");
        String nomeCliente = scanner.next();

        System.out.println("Qual é o seu sobrenome?");
        String sobreNomeCliente = scanner.next();

        System.out.println("Qual é o número de sua conta?");
        int numero = scanner.nextInt();

        System.out.println("Qual é a sua Agência?");
        String agencia = scanner.next();

        double saldo = 237.48;



    System.out.println("Olá, Sr. "+ nomeCliente + " " + sobreNomeCliente + " . Você possui um saldo de" + saldo +  " na conta " + numero + "de Agência " + agencia);


    }
}

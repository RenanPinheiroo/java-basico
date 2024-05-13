public class Usuario {
    public static void main(String[] args) {
    
        String nomeCliente = args[0];
        String sobreNomeCliente = args[1];
        int numero = Integer.valueOf(args[2]);
        String agencia = args[3];
        double saldo = Double.valueOf(args[4]);

    System.out.println("Olá, Sr. "+ nomeCliente+ " " + sobreNomeCliente);
    System.out.println("A sua agência é a: " + agencia);
    System.out.println("De número de conta: " + numero);
    System.out.println("O seu saldo atual é de: " + saldo);


    }
}

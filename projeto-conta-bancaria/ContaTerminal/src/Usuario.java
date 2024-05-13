public class Usuario {
    public static void main(String[] args) throws Exception {
    
        int Numero = Integer.valueOf(args[0]);
        String Agencia = args[1];
        String NomeCliente = args[2];
        String SobreNomeCliente = args[3];
        float Saldo = Float.valueOf(args[4]);

    System.out.println("Olá, Sr. "+ NomeCliente+ " " + SobreNomeCliente);
    System.out.println("A sua agência é a: " + Agencia);
    System.out.println("De número de conta: " + Numero);
    System.out.println("O seu saldo atual é de: " + Saldo);


    }
}

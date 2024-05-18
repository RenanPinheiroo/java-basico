public class ContaBancaria{

public static void main(String[] args) {
    
    double SaldoConta = 250.00;
    double SaldoResgate = 300;

    if(SaldoConta>SaldoResgate){

        SaldoConta = SaldoConta - SaldoResgate;

        System.out.println("Resgate concluido. O seu saldo atual e de: " + SaldoConta);
    }else
    System.out.println("Saldo insuficiente");
    
}


}
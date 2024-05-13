public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeiroNome = "Renan";
        String segundoNome = "Almeida";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "O resultado do método é: " + primeiroNome.concat(" ").concat(segundoNome);
    }

}

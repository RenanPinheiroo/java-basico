public class PlanoCelular {
    public static void main(String[] args) throws Exception {
        String plano = "Business"; //Economico, Standart e Business

        switch (plano) {
            case "Business" :{
            System.out.println("5 gb de Youtube"); 
            }      
        
            case "Standart": {

                System.out.println("Whatsapp e Instagram Livre");
            }
            
            case "Economico":{

                System.out.println("100 minutos de ligacao");
            }
            default:
           
        }
    }
}

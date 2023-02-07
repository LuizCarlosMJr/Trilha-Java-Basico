import java.util.Scanner;

public class ContFluxo2 {
    
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana!" );
        String dia = scanner.nextLine();

        switch (dia) {

            case "segunda":
            System.out.println("Esse é o segundo dia da semana!");
            break;
            case "terça":
            System.out.println("Esse é o segundo dia da semana!");
            break;
            case "quarta":
            System.out.println("Esse é o segundo dia da semana!");
            break;
            case "quinta":
            System.out.println("Esse é o segundo dia da semana!");
            break;
            case "sexta":
            System.out.println("Esse é o segundo dia da semana!");
            break;
            case "sábado":
            System.out.println("Esse é o segundo dia da semana!");
            break;
            case "domingo":
            System.out.println("Esse é o segundo dia da semana!");
            break;
            default:
            System.out.println("Não é um dia da semana, por favor, escolha um dia!");
            System.out.println("--------------------------");
            System.out.println("Digite um dia da semana!" ); 
            dia = scanner.nextLine();
        }
        

        System.out.println("--------------------------");
        identificarNumeros();
   
    }



    private static void identificarNumeros() {
         int numero = 5;

         switch (numero) {
            case 1:
            case 2:
            case 3:
            System.out.println("Certo");
            break;

            case 4:
            System.out.println("Errado");
            break;

            case 5:
            System.out.println("Talvez");
         
            default:
                break;
         }
        
    }
}

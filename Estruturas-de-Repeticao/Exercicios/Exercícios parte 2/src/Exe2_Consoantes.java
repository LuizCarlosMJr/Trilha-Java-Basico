import java.util.Scanner;

/*Faça um  programa que leia um valor de 6 caracteres
 e diga quanntas consoantes foram lidas. */ 

public class Exe2_Consoantes {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       String[] consoantes = new String[6];
       int quantidadeConsoantes = 0;

       int count = 0;
       do{
          System.out.println("Digite a Letra: ");
          String letra = scan.next();

          if( !(letra.equalsIgnoreCase("a")|| //IgnoreCase => ignora se é maiúscula ou minúscula
                letra.equalsIgnoreCase("e")||
                letra.equalsIgnoreCase("i")||
                letra.equalsIgnoreCase("o")||
                letra.equalsIgnoreCase("u")) ){

               consoantes[count] = letra;
               quantidadeConsoantes++;

             }

          count++;
         }while(count < consoantes.length);

         System.out.print("Consoantes: ");
         for (String consoante : consoantes) {
            if(consoante != null){
               System.out.print(consoante + " ");
            }

         }

         System.out.println("\nQuantidade de consoantes: "+ quantidadeConsoantes);

    }
}

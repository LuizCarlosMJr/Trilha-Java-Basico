import java.util.Scanner;

public class DowloadPacotes {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      
       int count = 0;
       System.out.print("Digite um número:");
       int tamanho = scan.nextInt();
       
       while (count<tamanho) {
        String barraDownload = "/";
        System.out.print(barraDownload);
        count++;
       }

       

    }
}

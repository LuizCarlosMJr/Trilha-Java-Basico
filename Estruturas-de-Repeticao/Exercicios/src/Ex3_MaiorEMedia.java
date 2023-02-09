/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int count = 0;
        int maiorNumero = 0;
        int soma = 0;
       

        do{
        System.out.println("Digite um número:");
        num = scan.nextInt();

        soma = num + soma;

        if(num>maiorNumero) maiorNumero = num;
        
        count++;

        }while(count<5);
        
        double media = soma/5;
        System.out.println("O maior número é: "+maiorNumero);
        System.out.println("O valor da soma é: " + soma);
        System.out.println("o valor da média é igual: " + media);
    }
}

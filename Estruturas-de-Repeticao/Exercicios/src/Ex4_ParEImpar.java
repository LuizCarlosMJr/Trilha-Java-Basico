/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int quantidade;
         int numero;
         int cont = 0;
         int qtdPares = 0;
         int qtdImpares = 0; 

        System.out.println("Digite a quantidade de números que vc quer somar:");
         quantidade = scan.nextInt();

        do{
            System.out.println("Digite um Número:");
            numero = scan.nextInt();

            if(numero % 2 == 0) qtdPares++; else qtdImpares++;

         cont++;
        }while(cont < quantidade);

        
        System.out.println("Você digitou " + quantidade + " números.");
        System.out.println("A quantidade de números pares são: " + qtdPares);
        System.out.println("A quantidade de números ímpares são: " + qtdImpares);
    }
}

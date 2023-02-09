/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int multiplica = 1;

        System.out.println("Digite o número que você deseja calcular o fatorial:");
        int numero = scan.nextInt();

        for(int i = numero; i >= 1; i--){

            System.out.println(i+" * "+multiplica);
            multiplica = multiplica*i;
            
        }
       
        System.out.println(numero + "! é igual a: " + multiplica);
    }
}

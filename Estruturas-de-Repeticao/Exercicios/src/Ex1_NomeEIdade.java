import java.util.Scanner; //Sempre que utilizar a classe Scanner, tem que fzer o import

/**
 * Faça um programa que leia conjunlto de valores,
 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa insereindo o valor 0 no campo nome.) */

 
public class Ex1_NomeEIdade {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

       String nome;
       int idade;
        //Utilizando o While

       while(true){ //enquanto for true, ficará repetindo
        System.out.println("Escreva o nome: ");
        nome = scan.next();
        if(nome.equals("0")) break;//condicional para que o laço pare

        System.out.println("Escreva a idade: ");
        idade = scan.nextInt();
       } 
       

    }
}

import java.util.Random;

/*Faça um programa que leia 20 números aleatórios (entre 0 e 100), armazene-os em um vetor. 
 * Ao final, mostre os números e seus sucessores.
*/

public class Exe3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i=0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        
        //ForEach
        System.out.println("Números Aleatórios, seus antecessores e sucessores: ");
        for (int numerosAleatorio : numerosAleatorios){ 
            System.out.print((numerosAleatorio - 1) + " - " + numerosAleatorio + " - " + (numerosAleatorio + 1) +  "\n");
        }
        
    }
}

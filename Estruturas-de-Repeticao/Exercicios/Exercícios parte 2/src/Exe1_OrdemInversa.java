public class Exe1_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {10, 9, 8, 7, 6, 5};
        
        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor Ordem inversa: ");
        for(int i = (vetor.length -1); i>=0; i--){
            System.out.print(vetor[i] + " ");
        };
    } 
        
}
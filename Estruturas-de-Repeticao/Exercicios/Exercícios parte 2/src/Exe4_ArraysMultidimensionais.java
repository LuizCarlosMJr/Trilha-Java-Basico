import java.util.Random;

/*Gere uma matriz M 4X4 com valores aleatórios entre 0-9. */

public class Exe4_ArraysMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        //Navegará pela Linha
        for(int li = 0; li < M.length; li++){

            //For que percorrerá as colunas
            for(int col = 0; col < M[li].length; col++){

                M[li][col] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
           System.out.println(); 
        }


    }
    
}

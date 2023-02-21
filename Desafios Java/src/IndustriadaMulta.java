/*
 * Desafio
A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e a prefeitura não deu conta de enviar as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h.
O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma mensagem dizendo se o motorista será multado ou não.
 */
import java.util.Scanner;

public class IndustriadaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a velocidade:");
        int velocidade = leitor.nextInt();

        if (velocidade <= 60) System.out.println("Você não foi multado!");
        else System.out.println("Você foi multado!!!");
    }
}

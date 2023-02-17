

public class Main {

    public static void main(String[] args) {
        
        //Importando a Class Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.somar(3, 6);
        Calculadora.subtrair(10, 5);
        Calculadora.multipicar(8,9);
        Calculadora.dividir(30,5);
   
        System.out.println("----------------------------------");    
        
        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(19);

        System.out.println("----------------------------------"); 
   
        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasPracelas());
        Emprestimo.calcular(1000, Emprestimo.getTresPracelas());
        Emprestimo.calcular(1000, 10);
   
    }


    
}
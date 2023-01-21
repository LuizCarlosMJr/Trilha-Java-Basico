public class Ternario {
    public static void main(String[] args) {
        // classe Operadores.java
        int a, b, c;

        a = 5;
        b = 6;
        c = 5;
        String resultado;
        
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         if(a==b){
         resultado = "verdadeiro";
        } else {
         resultado = "falso";
        }
        System.out.println(resultado);

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado2 = (a == c) ? "verdadeiro" : "false";

        System.out.println(resultado2);
    }
}

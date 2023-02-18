public class Quadrilateros{

    public static void area(double lado){
        System.out.println("A área do Quadrado é: "+ lado*lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("A área do Retângulo é: "+ lado1*lado2);
    }

    public static void area(double baseMaior, double basemenor, double altura){
        System.out.println("A área do Trapézio é: "+ (baseMaior+basemenor)*altura);
    }

    //Nesse caso para mudar a assinatura, tem que mudar os nomes das variáveis e os tipos de dados, se não o sistema não reconhece a troca de ass
    public static void area(Float diagonal1, float diagonal2){
        System.out.println("A área do Losango é: "+ (diagonal1*diagonal2)/2);
    }




}
public class QuadrilaterosMetodoEspecifico {

    public static double area(double lado){
        return  lado*lado;
    }

    public static double area(double lado1, double lado2){
        return lado1*lado2;
    }

    public static double area(double baseMaior, double basemenor, double altura){
        return (baseMaior+basemenor)*altura;
    }

    //Nesse caso para mudar a assinatura, tem que mudar os nomes das variáveis e os tipos de dados, se não o sistema não reconhece a troca de ass
    public static float area(float diagonal1, float diagonal2){
        return (diagonal1*diagonal2)/2;
    }
    
}

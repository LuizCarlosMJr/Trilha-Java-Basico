public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-------------------------------");
        System.out.println("Exercício de Quadriláteros");
        System.out.println("-------------------------------");
        Quadrilateros.area(5);
        System.out.println("-------------------------------");
        Quadrilateros.area(5, 10);
        System.out.println("-------------------------------");
        Quadrilateros.area(5, 3, 4);
        System.out.println("-------------------------------");
        Quadrilateros.area(10f, 20f);
        System.out.println("-------------------------------");
        System.out.println();

        System.out.println("Métodos armazenados em variáveis!!!");
        System.out.println();

        double areaQuadrado = QuadrilaterosMetodoEspecifico.area(10);
        System.out.println("A área do Quadrado é: "+ areaQuadrado);
        System.out.println();

        double areaRetangulo = QuadrilaterosMetodoEspecifico.area(5d, 10d);
        System.out.println("A área do Retangulo é: "+ areaRetangulo);
        System.out.println();

        double areaTrapezio = QuadrilaterosMetodoEspecifico.area(10, 5, 10 );
        System.out.println("A área do Trapezio é: "+ areaTrapezio);
        System.out.println();

        float areaLosango = QuadrilaterosMetodoEspecifico.area(20f,10f);
        System.out.println("A área do Losango é: "+ areaLosango);




    }


}

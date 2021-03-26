package _01_introducao.figuras;

public class Main {
    public static void main(String[] args) {
        double lado = 10;
        System.out.println(calcularAreaQuadrado(lado));
        System.out.println(calcularPerimetroQuadrado(lado));

        Quadrado q1 = new Quadrado(10);
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro());

    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }

}

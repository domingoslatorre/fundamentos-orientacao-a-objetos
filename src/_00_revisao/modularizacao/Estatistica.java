package _00_revisao.modularizacao;

public class Estatistica {

    public static double media(double[] valores) {
        double total = 0.0;

        for (int i = 0; i < valores.length; i++) {
            total += valores[i];
        }

        double media = total / valores.length;

        return media;
    }

    // TODO: calcular mínimo
    // public static double minimo(double[] valor)

    // TODO: calcula máximo
}
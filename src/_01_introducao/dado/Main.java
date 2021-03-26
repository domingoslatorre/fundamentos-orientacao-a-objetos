package _01_introducao.dado;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(rolarDado());

        Dado d6 = new Dado(6);
        d6.rolar();
        System.out.println(d6.getFace());

    }

    public static int rolarDado() {
        Random random = new Random();
        int resultado = random.nextInt(6) + 1;
        return resultado;
    }
}

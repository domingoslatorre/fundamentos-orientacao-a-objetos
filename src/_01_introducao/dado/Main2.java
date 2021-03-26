package _01_introducao.dado;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        
        int soma = 0;
        soma = rolarDado();
        soma += rolarDado();
        soma += rolarDado(); 
        System.out.println(soma);


        Dado d1 = new Dado(6);
        Dado d2 = new Dado(6);

        // Rolagem rolagem = new Rolagem();
        // rolagem.adicionarDado(d1);
        // rolagem.adicionarDado(d2);

        Rolagem rolagem = new Rolagem(d1, d2);

        System.out.println(rolagem.executar());

    }

    public static int rolarDado() {
        Random random = new Random();
        int resultado = random.nextInt(6) + 1;
        return resultado;
    }
}

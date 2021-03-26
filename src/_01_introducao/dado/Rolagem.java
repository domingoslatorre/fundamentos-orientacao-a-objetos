package _01_introducao.dado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rolagem {
    // private Dado dado1;
    // private Dado dado2;
    private List<Dado> dados;

    // public Rolagem(Dado d1, Dado d2) {
    //     this.dados = new ArrayList<>();
    //     this.dados.add(d1);
    //     this.dados.add(d2);
    // }

    public Rolagem(Dado... dados) {
        this.dados = Arrays.asList(dados);
        this.rolarDados();
    }

    // public void adicionarDado(Dado dado) {
    //     this.dados.add(dado);
    // }

    private void rolarDados() {
        for(Dado dado: dados) {
            dado.rolar();
        }
    }

    public int getSoma() {
        int soma = 0;
        for(Dado dado: dados) {
            soma += dado.getFace();
        }
        return soma;
    }

}

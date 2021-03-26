package _01_introducao.dado;

import java.util.Random;

public class Dado {
    private int numeroFaces;
    private int face;

    public Dado(int numeroFaces) {
        this.numeroFaces = numeroFaces;
        this.face = 1;
    }

    public void rolar() {
        this.face = new Random().nextInt(numeroFaces) + 1;
    }

    public int getFace() {
        return this.face;
    }
}

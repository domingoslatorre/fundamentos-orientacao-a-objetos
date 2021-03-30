package _03_criacao_objetos.dado;

import java.util.Random;

public class Dado {
    private int numeroFaces;
    private int face;

    public Dado(int numeroFaces) {
        this.numeroFaces = numeroFaces;
        this.face = 1;
    }

    public static Dado criarDado4Faces() {
        return new Dado(4);
    }

    public static Dado criarDado6Faces() {
        return new Dado(6);
    }

    public static Dado criarDado10Faces() {
        return new Dado(10);
    }

    public void rolar() {
        this.face = new Random().nextInt(numeroFaces) + 1;
    }

    public int getFace() {
        return this.face;
    }
}

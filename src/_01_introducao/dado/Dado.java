package _01_introducao.dado;

import java.util.Random;

public class Dado {
    private int faces;

    public Dado(int faces) {
        this.faces = faces;
    }

    public int rolar() {
       return new Random().nextInt(faces) + 1;
    }
}

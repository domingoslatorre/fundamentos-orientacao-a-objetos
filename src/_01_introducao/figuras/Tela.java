package _01_introducao.figuras;

import java.util.ArrayList;
import java.util.List;

public class Tela {
    private double area;
    private List<Quadrado> quadrados;

    public Tela(double area) {
        this.quadrados = new ArrayList<>();
        this.area = area;
    }

    public double areaAtual() {
        double areaAtual = 0.0;
        for(Quadrado q: quadrados) {
            areaAtual = areaAtual + q.calcularArea();
        }
        return areaAtual;
    }

    public void adicionarQuadrado(Quadrado quadrado) {
        if((areaAtual() + quadrado.calcularArea()) > area) {
            throw new RuntimeException("O quadrado na cabe na tela");
        } else {
            this.quadrados.add(quadrado);
        }
    }
}

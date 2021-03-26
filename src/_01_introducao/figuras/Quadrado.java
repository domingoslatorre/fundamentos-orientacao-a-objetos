package _01_introducao.figuras;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }

    public double calcularPerimetro() {
        return 4 * this.lado;
    }    
}



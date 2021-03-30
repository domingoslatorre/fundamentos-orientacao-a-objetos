package _03_criacao_objetos.dado;

public class Main {
    public static void main(String[] args) {
        Dado d6 = Dado.criarDado6Faces();

        for(int i = 0; i < 10; i++) {
            d6.rolar();
            System.out.println(d6.getFace());
        }
        
    }
}

package _00_revisao.modularizacao;

class Main2 {
    public static void main(String[] args) {

        validarDadosEntrada(args);

        String nome = obterNome(args);
        double[] notas = obterNotas(args);

        double media = calcularMedia(notas);

        exibirMediaNotas(nome, media, notas);

    }

    public static void validarDadosEntrada(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("A entrada deve conter o nome e pelo menos duas notas");
        }

        if (args[0].isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        if (args[0].length() < 2) {
            throw new IllegalArgumentException("Nome deve ter pelo menos dois caracteres");
        }

        double[] notas = new double[args.length - 1];

        for (int i = 1; i < args.length; i++) {
            try {
                notas[i - 1] = Double.parseDouble(args[i]);
            } catch (NumberFormatException ex) {
                throw new IllegalArgumentException("As notas deve ser enviadas em formato double. ex: 2.5 10.0");
            }
        }

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) {
                throw new IllegalArgumentException("As notas devem estar entre o intervalo de 0.0 e 10.0");
            }
        }
    }

    public static String obterNome(String[] args) {
        return args[0].trim();
    }

    public static double[] obterNotas(String[] args) {
        double[] notas = new double[args.length - 1];

        for (int i = 1; i < args.length; i++) {
            notas[i - 1] = Double.parseDouble(args[i]);
        }

        return notas;
    }

    public static double calcularMedia(double[] notas) {
        double total = 0.0;

        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }

        double media = total / notas.length;

        return media;
    }

    public static void exibirMediaNotas(String nome, double media, double[] notas) {
        System.out.println(nome + " ficou com média: " + media);

        System.out.println("Notas: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }
}
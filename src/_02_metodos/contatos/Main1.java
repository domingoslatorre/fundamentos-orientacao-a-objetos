package _02_metodos.contatos;

import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Contato c1 = new Contato("João", new Telefone("11", "11111111"));
        Contato c2 = new Contato("Maria", new Telefone("12", "12121212"));

        Agenda agenda = new Agenda();
        agenda.adicionar(c1);
        agenda.adicionar(c2);

        List<Contato> contatos1 = agenda.obterPorNome("João");
        System.out.println(contatos1.size());
        System.out.println(contatos1.get(0).getNome());

        List<Contato> contatos2 = agenda.obterPorNome("Maria");
        System.out.println(contatos2.size());
        System.out.println(contatos2.get(0).getNome());

        List<Contato> contatos3 = agenda.obterPorNome("Pedro");
        System.out.println(contatos3.size());
    }
}

package _02_metodos.contatos;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionar("João", "11", "11111111");
        agenda.adicionar("Maria", "12", "12121212");

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

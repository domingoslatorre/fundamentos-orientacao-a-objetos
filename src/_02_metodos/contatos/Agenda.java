package _02_metodos.contatos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionar(Contato contato) {
        this.contatos.add(contato);
    }

    public List<Contato> obterPorNome(String nome) {
        List<Contato> contatosEncontrados = new ArrayList<>();
        for(Contato contato: contatos) {
            if(contato.getNome().equals(nome)) {
                contatosEncontrados.add(contato);
            }
        }
        return contatosEncontrados;
    }

}

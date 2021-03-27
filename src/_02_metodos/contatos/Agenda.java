package _02_metodos.contatos;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public int numeroContatos() {
        return contatos.size();
    }

    public void adicionar(Contato contato) {
        this.contatos.add(contato);
    }

    // sobrecarga
    public void adicionar(String nome, String ddd, String telefone) {
        this.contatos.add(new Contato(nome, new Telefone(ddd, telefone)));
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

    // TODO: obterPorTelefone

    // TODO: remover contato

    // TODO: editar contato
}

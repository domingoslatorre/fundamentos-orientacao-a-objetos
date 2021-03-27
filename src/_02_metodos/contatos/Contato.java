package _02_metodos.contatos;

public class Contato {
    private String nome;
    private Telefone telefone;

    public Contato(String nome, Telefone telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Telefone getTelefone() {
        return telefone;
    }

}

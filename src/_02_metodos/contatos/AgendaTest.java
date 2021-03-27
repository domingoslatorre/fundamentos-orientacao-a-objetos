package _02_metodos.contatos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class AgendaTest {
 
    @Test    
    public void criarAgendaComZeroContatos() {
        Agenda agenda = new Agenda();

        assertEquals(0, agenda.numeroContatos());
    }

    @Test
    public void adicionarObjetoContatoNaAgenda() {
        Agenda agenda = new Agenda();
        Contato contato1 = new Contato("João", new Telefone("11", "111111"));
        Contato contato2 = new Contato("Maria", new Telefone("12", "121212"));
        agenda.adicionar(contato1);
        agenda.adicionar(contato2);
        

        assertEquals(2, agenda.numeroContatos());
        assertSame(contato1, agenda.obterPorNome("João").get(0));
        assertSame(contato2, agenda.obterPorNome("Maria").get(0));
    }

    @Test
    public void adicionarDadosDoContatoNaAgenda() {
        Agenda agenda = new Agenda();
        agenda.adicionar("João", "11", "111111");
        agenda.adicionar("Maria", "12", "121212");
        

        assertEquals(2, agenda.numeroContatos());
    }

}

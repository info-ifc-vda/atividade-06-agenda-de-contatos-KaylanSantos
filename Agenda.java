import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }
    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }
    public boolean removerContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(c);
                return true;
            }
        }
        return false;
    }
    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }

        for (Contato c : contatos) {
            System.out.println("----------------------------");
            System.out.println(c);
        }
    }
}

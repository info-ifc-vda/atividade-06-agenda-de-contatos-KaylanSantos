import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private List<Telefone> telefones;
    private List<Email> emails;

    public Contato(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void adicionarEmail(Email email) {
        emails.add(email);
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + nome + "\n");

        sb.append("Telefones:\n");
        for (Telefone t : telefones) {
            sb.append(" - " + t + "\n");
        }

        sb.append("Emails:\n");
        for (Email e : emails) {
            sb.append(" - " + e + "\n");
        }

        return sb.toString();
    }
}

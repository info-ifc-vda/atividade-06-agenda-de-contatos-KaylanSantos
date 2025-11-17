public class Menu {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

       
        Contato contato1 = new Contato("Ana Silva");
        contato1.adicionarTelefone(new Telefone("Celular", "99999-1234"));
        contato1.adicionarTelefone(new Telefone("Casa", "3521-7788"));
        contato1.adicionarEmail(new Email("Pessoal", "ana@gmail.com"));

     
        agenda.adicionarContato(contato1);

      
        Contato contato2 = new Contato("Bruno Santos");
        contato2.adicionarTelefone(new Telefone("Trabalho", "4002-8922"));
        contato2.adicionarEmail(new Email("Trabalho", "bruno@empresa.com"));
        contato2.adicionarEmail(new Email("Pessoal", "bruno@hotmail.com"));

        agenda.adicionarContato(contato2);

    
        agenda.listarContatos();

    
        System.out.println("Removendo Ana...");
        agenda.removerContato("Ana Silva");

   
        agenda.listarContatos();
    }
}

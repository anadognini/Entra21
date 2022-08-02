import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Entre com o nome da agenda: ");
        String nome = entradas.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for (int index = 0; index < contatos.length; index++) {
            System.out.println("Entre com as informações do contato " + (index + 1) + ":");
            Contato c = new Contato();

            System.out.println("Entre com o nome do contato: ");
            String nomeContato = entradas.nextLine();
            c.setNome(nomeContato);

            System.out.println("Entre com o telefone do contato: ");
            String telefone = entradas.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o e-mail do contato: ");
            String email = entradas.nextLine();
            c.setEmail(email);

            contatos[index] = c;
        }

        agenda.setContatos(contatos);

        System.out.println(agenda.obterInfo());

        entradas.close();
    }
}

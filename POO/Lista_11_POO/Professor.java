import java.util.Scanner;

public class Professor extends Funcionario implements Pesquisador {
    // Atributos
    private String titulacao;
    private String areaDePesquisa;
    private String[] nomesProfessores;

    // Construtor
    public Professor() {
        nomesProfessores = popularVetor(nomesProfessores);
    }

    public Professor(Scanner entradas) {
        // Setando o nome do professor
        setNome(this.getNome(), nomesProfessores, entradas);
	    
	// Setando o endereço do professor
        setEndereco(this.getEndereco(), entradas);
	    
	// Setando o CPF do professor
        setCpf(this.getCpf(), entradas);
	    
	// Setando o telefone do professor
        setTelefone(this.getTelefone(), entradas);

        /**
	 * private float salario;
         * private String ctps;
         * private String titulacao;
         * private String areaDePesquisa;
         * private String[] nomesProfessores;
         */

    }

    public String[] getNomesProfessores() {
        return nomesProfessores;
    }

    public void setNomesProfessores(String[] nomesProfessores) {
        this.nomesProfessores = nomesProfessores;
    }

    // Getters e setters
    @Override
    public void setNome(String nome, String[] nomesProfessores, Scanner entradas) {
        String nomeProfe = "";
        String profResponsavelProjeto;

        System.out.println("Informe o nome do professor (é importante que seja um dos nomes da lista): ");

        nomesProfessores = popularVetor(nomesProfessores);

        for (int i = 0; i < 3; i++) {
            System.out.println(nomesProfessores[i]);
        }

        profResponsavelProjeto = entradas.next();

        boolean flag = verificarProf(profResponsavelProjeto, entradas, nomesProfessores);

        if (flag != true) {
            System.out.println("O nome informado não consta na lista. Favor informar outro nome.");
            profResponsavelProjeto = entradas.next();
        } else {
            nomeProfe = this.getNome();
            nomeProfe = profResponsavelProjeto;
        }
    }

    @Override
    public void setEndereco(String endereco, Scanner entradas) {
        System.out.println("Informe o endereço do professor.\nRua: ");
        String rua = entradas.next();

        System.out.println("Bairro: ");
        String bairro = entradas.next();

        System.out.println("Número: ");
        int numero = entradas.nextInt();

        System.out.println("Complemento: ");
        String complemento = entradas.next();

        System.out.println("CEP: ");
        String cep = entradas.next();

        System.out.println("Cidade: ");
        String cidade = entradas.next();

        System.out.println("Estado: ");
        String estado = entradas.next();

        endereco = rua + ", " + bairro + ", " + numero + ", " + complemento + ", "
                + cep + ", " + cidade + " - " + estado;

        String enderecoProfe = this.getEndereco();

        enderecoProfe = endereco;
    }

    @Override
    public void setCpf(String cpf, Scanner entradas) {
        System.out.println("Informe o cpf do professor: ");
        cpf = entradas.next();

        String cpfProfe = this.getCpf();

        cpfProfe = cpf;
    }

    @Override
    public void setTelefone(String telefone, Scanner entradas) {
        System.out.println("Informe o telefone do professor: ");
        telefone = entradas.next();

        String telefoneProfe = this.getTelefone();

        telefoneProfe = telefone;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getAreaDePesquisa() {
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa) {
        this.areaDePesquisa = areaDePesquisa;
    }

    // Métodos implementados
    @Override
    public float calcSalario(float vHora) {
        return 0;
    }

    @Override
    public String getTipo() {
        return "Professor";
    }

    // Método para popular a lista de professor
    public String[] popularVetor(String[] nomesProfessores) {
        nomesProfessores = new String[3];

        nomesProfessores[0] = "Fernando";
        nomesProfessores[1] = "Carlos";
        nomesProfessores[2] = "Andrea";

        return nomesProfessores;
    }

    // Método que verifica se o nome do professor responsável consta na lista
    private boolean verificarProf(String profResponsavelProjeto, Scanner entradas, String[] nomesProfessores) {
        boolean flag;

        if (profResponsavelProjeto.equals("Fernando") || profResponsavelProjeto.equals("Carlos")
                || profResponsavelProjeto.equals("Andrea")) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
    }
}

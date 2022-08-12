import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoPesquisa {
    // Atributos
    private String codigo;
    private String titulo;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String profResponsavel;
    private List<Pesquisador> equipe = new ArrayList<Pesquisador>();

    // Construtor
    public ProjetoPesquisa(Scanner entradas) {
        // Setando o código
        setCodigo(codigo, entradas);

        // Setando o título
        setTitulo(titulo, entradas);

        // Setando a data de início
        setDataInicio(dataInicio, entradas);

        // Setando a data de fim
        setDataFim(dataFim, entradas);

        // Setando o professor responsável
        setProfResponsavel(profResponsavel, entradas);
    }

    // Getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigoProjeto, Scanner entradas) {
        System.out.println("Informe o código do projeto: ");
        codigoProjeto = entradas.next();

        this.codigo = codigoProjeto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloProjeto, Scanner entradas) {
        System.out.println("Informe o título do projeto: ");
        tituloProjeto = entradas.next();

        this.titulo = tituloProjeto;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicioProjeto, Scanner entradas) {
        System.out.println("Informe o dia, mês e ano de início do projeto, nessa ordem."
                + "\nDia:");
        int diaInicio = entradas.nextInt();

        System.out.println("Mês: ");
        int mesInicio = entradas.nextInt();

        System.out.println("Ano: ");
        int anoInicio = entradas.nextInt();

        dataInicioProjeto = LocalDate.of(anoInicio, mesInicio, diaInicio);

        this.dataInicio = dataInicioProjeto;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFimProjeto, Scanner entradas) {
        System.out.println("Informe o dia, mês e ano de término do projeto, nessa ordem."
                + "\nDia:");
        int diaFim = entradas.nextInt();

        System.out.println("Mês: ");
        int mesFim = entradas.nextInt();

        System.out.println("Ano: ");
        int anoFim = entradas.nextInt();

        dataFimProjeto = LocalDate.of(anoFim, mesFim, diaFim);

        this.dataFim = dataFimProjeto;
    }

    public String getProfResponsavel() {
        return profResponsavel;
    }

    public void setProfResponsavel(String profResponsavelProjeto, Scanner entradas) {
        System.out.println(
                "Informe o nome do professor responsável (é importante que seja um dos professores da lista): ");

        Professor opcaoProfessor = new Professor();

        String[] nomesProfessores = opcaoProfessor.getNomesProfessores();

        for (int i = 0; i < 3; i++) {
            System.out.println(nomesProfessores[i]);
        }

        profResponsavelProjeto = entradas.next();

        boolean flag = verificarProf(profResponsavelProjeto, entradas, nomesProfessores);

        if (flag != true) {
            System.out.println("O nome informado não consta na lista. Favor informar outro nome.");
            profResponsavelProjeto = entradas.next();
        } else {
            this.profResponsavel = profResponsavelProjeto;
        }
    }

    public List<Pesquisador> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Pesquisador> equipe) {
        this.equipe = equipe;
    }

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

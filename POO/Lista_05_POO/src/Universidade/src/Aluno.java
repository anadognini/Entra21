import java.util.Scanner;

public class Aluno {
    // Atributos
    private String nome;
    private String matricula;
    private String cpf;
    private Curso curso;

    // Construtor
    public Aluno(Scanner entradas) {
        System.out.println("\nInsira as informações sobre o aluno:");

        System.out.println("Informe o nome: ");
        String nomeAluno = entradas.next();
        this.setNome(nomeAluno);

        System.out.println("Insira a matrícula: ");
        String matriculaAluno = entradas.next();
        this.setMatricula(matriculaAluno);

        System.out.println("Informe o CPF: ");
        String cpfAluno = entradas.next();
        this.setCpf(cpfAluno);

        System.out.println("\nInsira as informações sobre o curso que o aluno frequenta: ");

        Curso cursoAluno = new Curso(entradas);
        this.setCurso(cursoAluno);
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    // Método toString
    @Override
    public String toString() {
        return "\nNome do aluno: " + nome
                + "\nMatrícula: " + matricula
                + "\nCPF do aluno: " + cpf
                + "\nCurso que frequenta: " + curso;
    }
}

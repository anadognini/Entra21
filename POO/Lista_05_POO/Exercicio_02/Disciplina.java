import java.util.Scanner;

public class Disciplina {
    // Atributos
    private String codigo;
    private String nome;
    private double cargaHoraria;
    private Professor professor;

    // Construtor
    public Disciplina(Scanner entradas) {
        System.out.println("\nInsira as informações da disciplina: ");

        System.out.println("Informe o código: ");
        String codigoDisciplina = entradas.next();
        this.setCodigo(codigoDisciplina);

        System.out.println("Informe o nome: ");
        String nomeDisciplina = entradas.next();
        this.setNome(nomeDisciplina);

        System.out.println("Informe a carga horária, em hrs/dia: ");
        double cargaDisciplina = entradas.nextDouble();
        this.setCargaHoraria(cargaDisciplina);

        System.out.println("\nInsira as informações do professor dessa disciplina: ");

        Professor professorDisciplina = new Professor(entradas);
        this.setProfessor(professorDisciplina);
    }

    // Getters e setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Método toString
    @Override
    public String toString() {
        return "\nDisciplina:"
                + "\nCódigo da disciplina: " + codigo
                + "\nNome da disciplina: " + nome
                + "\nCarga horária: " + cargaHoraria + " horas/dia"
                + "\nProfessor: " + professor;
    }
}

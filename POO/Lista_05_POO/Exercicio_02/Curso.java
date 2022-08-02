import java.util.Scanner;

public class Curso {
    // Atributos
    private String codigo;
    private String nome;
    private int duracao;

    // Construtor
    public Curso(Scanner entradas) {
        System.out.println("Informe o código: ");
        String codigoCurso = entradas.next();
        this.setCodigo(codigoCurso);

        System.out.println("Informe o nome: ");
        String nomeCurso = entradas.next();
        this.setNome(nomeCurso);

        System.out.println("Informe a duração do curso, em semestres: ");
        int duracaoCurso = entradas.nextInt();
        this.setDuracao(duracaoCurso);
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // Método toString
    @Override
    public String toString() {
        return "\nCódigo: " + codigo
                + "\nDuração: " + duracao + " semestres"
                + "\nNome do curso: " + nome;
    }
}

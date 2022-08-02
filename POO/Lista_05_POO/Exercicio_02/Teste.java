import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nInforme a opção que deseja realizar, de acordo com a lista abaixo:"
                    + " \n1 - Cadastrar técnico administrativo"
                    + "\n2 - Cadastrar professor"
                    + "\n3 - Cadastrar aluno"
                    + "\n4 - Cadastrar curso"
                    + "\n5 - Cadastrar disciplina"
                    + "\n0 - Finalizar o sistema!");
            opcao = entradas.nextInt();

            switch (opcao) {
                case 1:
                    Tecnico tecnico = new Tecnico(entradas);
                    System.out.println(tecnico);
                    break;
                case 2:
                    System.out.println("\nInsira as informações sobre o professor: ");
                    Professor professor = new Professor(entradas);
                    System.out.println(professor);
                    break;
                case 3:
                    Aluno aluno = new Aluno(entradas);
                    System.out.println(aluno);
                    break;
                case 4:
                    System.out.println("\nInsira as informações sobre o curso: ");
                    Curso curso = new Curso(entradas);
                    System.out.println(curso);
                    break;
                case 5:
                    Disciplina disciplina = new Disciplina(entradas);
                    System.out.println(disciplina);
                    break;
                default:
                    System.out.println("A opção inserida não existe.");
                    break;
            }
        } while (opcao != 0);

        System.out.println("Sistema finalizado.");

        entradas.close();
    }
}

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Entre com o nome do curso: ");
        String nome = entradas.nextLine();

        System.out.println("Entre com o horário do curso: ");
        String horario = entradas.nextLine();

        System.out.println("Entre com o nome do professor: ");
        String nomeProfessor = entradas.nextLine();

        System.out.println("Entre com o departamento do professor: ");
        String depProfessor = entradas.nextLine();

        System.out.println("Entre com o e-mail do professor: ");
        String emailProfessor = entradas.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(depProfessor);
        professor.setEmail(emailProfessor);

        curso.setProfessor(professor);

        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < alunos.length; i++) {
            entradas.nextLine();

            System.out.println("Entre com o nome do aluno " + (i + 1) + ":");
            String nomeAluno = entradas.nextLine();

            System.out.println("Entre com a matrícula do aluno " + (i + 1) + ":");
            String matriculaAluno = entradas.nextLine();

            double notas[] = new double[4];

            for (int j = 0; j < notas.length; j++) {
                System.out.println("Entre com a nota " + (j + 1) + ":");
                notas[j] = entradas.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;
        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

        entradas.close();
    }
}

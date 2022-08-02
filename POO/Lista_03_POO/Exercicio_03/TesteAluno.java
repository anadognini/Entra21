package ListaNovePOO;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		String nome = entradas.next();
		aluno1.setNome(nome);
		
		System.out.println("Informe o n�mero da matr�cula: ");
		int matricula = entradas.nextInt();
		aluno1.setMatricula(matricula);
		
		System.out.println("Informe o curso no qual o aluno est� matriculado: ");
		String curso = entradas.next();
		aluno1.setCurso(curso);
		
		String[] disciplinas = aluno1.imprimirNomesDisciplinas(entradas);
		aluno1.verificarNota(entradas, disciplinas);

		entradas.close();
	}

}

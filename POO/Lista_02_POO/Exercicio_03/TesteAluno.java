package ListaNovePOO;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		aluno1.nome = entradas.next();
		
		System.out.println("Informe o número da matrícula: ");
		aluno1.matricula = entradas.nextInt();
		
		System.out.println("Informe o curso no qual o aluno está matriculado: ");
		aluno1.curso = entradas.next();
		
		String[] disciplinas = aluno1.imprimirNomesDisciplinas(entradas);
		aluno1.verificarNota(entradas, disciplinas);

		entradas.close();
	}
}

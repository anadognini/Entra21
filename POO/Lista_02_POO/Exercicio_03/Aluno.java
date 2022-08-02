package ListaNovePOO;

import java.util.Scanner;

public class Aluno {
	String nome;
	int matricula;
	String curso;
	double[][] notas;
	
	String[] imprimirNomesDisciplinas (Scanner entradas) {
		String[] disciplinas = new String[3];
		
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("Informe o nome da " + (i + 1) + "ª disciplina: ");
			disciplinas[i] = entradas.next();
		}
		
		return disciplinas;
	}
	
	void verificarNota (Scanner entradas, String[] disciplinas) {
		double[][] notas = new double[3][3];
		double[] media = new double[3];
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Informe a " + (j + 1) + "ª nota de " + disciplinas[i] + ": ");
				notas[i][j] = entradas.nextDouble();
				
				media[0] = (notas[0][0] + notas[0][1] + notas[0][2]) / 3;
				media[1] = (notas[1][0] + notas[1][1] + notas[1][2]) / 3;
				media[2] = (notas[2][0] + notas[2][1] + notas[2][2]) / 3;
			}
		}
		
		for (int i = 0; i < disciplinas.length; i++) {
			System.out.println("\nA média da disciplina " + disciplinas[i] + " é: " + media[i]);
			
			if (media[i] >= 7) {
				System.out.println("O aluno está aprovado na disciplina " + disciplinas[i] + ".");
			} else {
				System.out.println("O aluno está reprovado na disciplina " + disciplinas[i] + ".");
			}
		}
		
	}
}
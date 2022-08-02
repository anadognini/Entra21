package ListaExtraMatrizes;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int[] gabarito = { '1', '1', '3', '2', '4' };
		//                  0    1    2    3    4
		
		int[][] alunos = new int[1][5];
		int posicao = 0;
		int contador = 0;
		int resposta = 0;
		
		int matricula = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			
			System.out.println("Informe o número de matrícula do aluno: ");
			alunos[i][posicao] = entradas.nextInt();
			
			matricula = alunos[i][posicao];
			
			for (int j = 0; j < alunos[i].length; j++) {
				System.out.println("Informe a resposta da questão " + (j + 1) + " (a - 1, b - 2, c - 3, d - 4, e - 5): ");
				alunos[i][j] = entradas.nextInt();

				if (alunos[i][j] == gabarito[i]) {
					contador++;
				} else {
					contador+= 0;
				}
			}
			
			System.out.println("Aluno: " + matricula + "\nNota: " + contador);
		}
	 
		entradas.close();
	}
}

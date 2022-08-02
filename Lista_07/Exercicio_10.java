package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		float nota1[] = new float[10];
		float nota2[] = new float[10];
		float result[] = new float[10];
		float mediaAluno = 0;
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Informe a primeira nota do aluno " + (i + 1));
			nota1[i] = entradas.nextFloat();
		}
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Informe a segunda nota do aluno " + (i + 1));
			nota2[i] = entradas.nextFloat();
		}
		
		for (int i = 0; i < result.length; i++) {
			mediaAluno = (nota1[i] + nota2[i]) / 2;
			result[i] = mediaAluno;
			
			System.out.print("\nAluno " + (i + 1) + " - Média final: " + result[i]);
			
			if (mediaAluno >= 7) {
				System.out.print(" <-- Aprovado!");
			} else {
				System.out.print(" <-- Reprovado!");
			}
		}
		
		entradas.close();
	}
}

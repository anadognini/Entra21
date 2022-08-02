package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);

		int vetorA[] = new int[10];
		int somaInferioresA15 = 0;
		int contador1 = 0;
		int somaMaioresQue15 = 0;
		int contador2 = 0;
		float mediaSuperioresA15;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i);
			vetorA[i] = entradas.nextInt();
			
			if (vetorA[i] < 15) {
				somaInferioresA15 += vetorA[i];
			} else if (vetorA[i] == 15) {
				contador1++;
			} else if (vetorA[i] > 15 ){
				somaMaioresQue15 += vetorA[i];
				contador2++;
			}
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("\n" + i + " - " + vetorA[i]);
			

			if (vetorA[i] < 15) {
				System.out.println(" <-- Este elemento � menor do que 15");
			} else if (vetorA[i] == 15) {
				System.out.println(" <-- Este elemento � igual 15");
			} else {
				System.out.println(" <-- Este elemento � maior do que 15");
			}
		}
		
		mediaSuperioresA15 = somaMaioresQue15 / contador2;
		
		System.out.println("\n\nA soma dos elementos que s�o inferiores a 15 �: " + somaInferioresA15
				+ "\nA quantidade de elementos que s�o iguais a 15 �: " + contador1
				+ "\nA m�dia dos elementos que s�o superiores a 15 �: " + mediaSuperioresA15);
		
		entradas.close();
	}
}
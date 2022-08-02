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
				System.out.println(" <-- Este elemento é menor do que 15");
			} else if (vetorA[i] == 15) {
				System.out.println(" <-- Este elemento é igual 15");
			} else {
				System.out.println(" <-- Este elemento é maior do que 15");
			}
		}
		
		mediaSuperioresA15 = somaMaioresQue15 / contador2;
		
		System.out.println("\n\nA soma dos elementos que são inferiores a 15 é: " + somaInferioresA15
				+ "\nA quantidade de elementos que são iguais a 15 é: " + contador1
				+ "\nA média dos elementos que são superiores a 15 é: " + mediaSuperioresA15);
		
		entradas.close();
	}
}
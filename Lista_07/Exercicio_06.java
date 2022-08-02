package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);

		int vetorA[] = new int[10];
		int soma = 0;
		int total = 0;
		float mediaSimples;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i);
			vetorA[i] = entradas.nextInt();
			
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				total++;
			}
		}
		
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("\n" + i + " - " + vetorA[i]);
			
			if (vetorA[i] % 2 != 0) {
				System.out.print(" <-- Este número é ímpar");
			}
		}
		
		mediaSimples = soma / total;
		
		System.out.println("\n\nA média aritmética dos elementos ímpares é: " + mediaSimples);
		
		entradas.close();
	}
}
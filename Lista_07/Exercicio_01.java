package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[15];
		int vetorB[] = new int[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor do elemento " + i);
			vetorA[i] = entradas.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(i + " - " + vetorA[i]);
		}
		
		System.out.println("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(i + " - " + vetorB[i]);
		}
		
		entradas.close();
	}
}

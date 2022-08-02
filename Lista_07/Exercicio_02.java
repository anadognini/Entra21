package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i);
			vetorA[i] = entradas.nextInt();
			
			vetorB[i] = vetorA[i] * i;
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] % 2;
		}
		
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(i + " - " + vetorA[i]);
		}
		
		System.out.println("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(i + " - " + vetorB[i]);
		}
		
		System.out.println("\nVetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(i + " - " + vetorC[i]);
		}
		
		entradas.close();
	}
}

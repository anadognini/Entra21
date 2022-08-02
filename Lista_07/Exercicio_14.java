package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int vetorC[] = new int[20];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i + " do vetor A");
			vetorA[i] = entradas.nextInt();
			
			vetorC[i] = vetorA[i];
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Informe o elemento " + i + " do vetor B");
			vetorB[i] = entradas.nextInt();
			
			vetorC[i + 10] = vetorB[i];
		}
		
		System.out.println("\nVetor C:");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(i + " - " + vetorC[i]);
		}
		
		entradas.close();
	}
}
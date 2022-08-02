package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		
		int j = vetorA.length - 1;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i + " do vetor A");
			vetorA[i] = entradas.nextInt();
			
			vetorB[j] = vetorA[i];
			j--;
			}
		
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(i +  " - " + vetorA[i]);
		}
		
		System.out.println("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(i +  " - " + vetorB[i]);
		}
		
		entradas.close();
	}
}

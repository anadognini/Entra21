package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		
		int vetorC[] = new int[10];
		int vetorD[] = new int[10];
		int vetorE[] = new int[10];
		int vetorF[] = new int[10];
		
		System.out.println("Vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = entradas.nextInt();
		}
		
		System.out.println("\nVetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorB[i] = entradas.nextInt();
		}
		
		System.out.println("\nVetor C: ");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			
			System.out.println(i + " - " + vetorC[i]);
		}
		
		System.out.println("\nVetor D: ");
		for (int i = 0; i < vetorD.length; i++) {
			vetorD[i] = vetorA[i] - vetorB[i];
			
			System.out.println(i + " - " + vetorD[i]);
		}
		
		System.out.println("\nVetor E: ");
		for (int i = 0; i < vetorE.length; i++) {
			vetorE[i] = vetorA[i] * vetorB[i];
			
			System.out.println(i + " - " + vetorE[i]);
		}
		
		System.out.println("\nVetor F: ");
		for (int i = 0; i < vetorF.length; i++) {
			vetorF[i] = vetorA[i] / vetorB[i];
			
			System.out.println(i + " - " + vetorF[i]);
		}
		
		entradas.close();
	}
}
package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[20];
		int auxiliar = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor " + i);
			vetorA[i] = entradas.nextInt();
		}
		
		System.out.println("\nVetor A compactado");
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > 0) {
				System.out.println((auxiliar) + " - " + vetorA[i]);
				auxiliar++;
			}
		}
		
		entradas.close();
	}

}
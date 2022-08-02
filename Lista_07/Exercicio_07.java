package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);

		int vetorA[] = new int[10];
		int contadorPares = 0;
		int contadorImpares = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i);
			vetorA[i] = entradas.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				contadorPares++;
			} else if (vetorA[i] % 2 != 0) {
				contadorImpares++;
			}
		}
		
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("\n" + i + " - " + vetorA[i]);
			
		if (vetorA[i] % 2 == 0 ) {
			System.out.print(" <-- Este n�mero � par");
		} else if (vetorA[i] % 2 != 0) {
				System.out.print(" <-- Este n�mero � �mpar");
			}
		}
		
		System.out.println("\n\nA quantidade de n�meros pares no vetor �: " + contadorPares
				+ "\nA quantidade de n�meros �mpares no vetor �: " + contadorImpares);
		
		entradas.close();
	}
}

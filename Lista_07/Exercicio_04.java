package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int n = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor " + i);
			vetorA[i] = entradas.nextInt();
			
			if (vetorA[i] % 2 == 0) {
				n++;
		}
		}
		
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(i + " - " + vetorA[i]);
		}
		
		System.out.println("\nA quantidade de elementos pares neste vetor é: " + n);
		
		entradas.close();
	}
}
 
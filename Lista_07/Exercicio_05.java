package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		int soma = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i);
			vetorA[i] = entradas.nextInt();
			
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		
		System.out.println("\nVetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(i + " - " + vetorA[i]);			
		}
		
		System.out.println("\nA soma dos elementos múltiplos de 5 é: " + soma);
		
		entradas.close();
	}
}
package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[2];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor " + i);
			vetorA[i] = entradas.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("\n\nPosição: " + i + " - " + vetorA[i] + "\n");
			
			System.out.print("Os divisores de " + vetorA[i] + " são:\n");
			for (int divisor = 1; divisor <= vetorA[i]; divisor++) {
				if (vetorA[i] % divisor == 0) {
					System.out.print(divisor + " | ");
				}
			}
		}
		
		
		entradas.close();
	}
}
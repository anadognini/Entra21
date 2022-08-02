package ListaExtraMatrizes;

import java.util.Random;

public class Exercicio_04 {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int[][] numeros = new int[10][5];
		int qtdadeMultiplosDeSete = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = aleatorio.nextInt(100);

				if (numeros[i][j] % 7 == 0) {
					qtdadeMultiplosDeSete++;
				}
			}
		}

		int[] multiplosDeSete = new int[qtdadeMultiplosDeSete];

		System.out.println("Matriz: ");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(" " + numeros[i][j] + "\t");

				if (numeros[i][j] % 7 == 0) {
					multiplosDeSete[i] = numeros[i][j];
				}
			}

			System.out.println();
		}

		System.out.println("\n\nVetor com os múltiplos de 7: ");
		for (int i = 0; i < multiplosDeSete.length; i++) {

			System.out.println(" " + multiplosDeSete[i] + "\t");
		}
	}
}

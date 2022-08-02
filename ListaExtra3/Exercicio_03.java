package ListaExtraMatrizes;

import java.util.Random;

public class Exercicio_03 {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int[][] numeros = new int[4][4];

		boolean matrizSimetrica = true;
		String resultado = "";

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				numeros[i][j] = aleatorio.nextInt(10);

				if (numeros[i][j] != numeros[j][i]) {
					matrizSimetrica = false;
				}
			}
		}

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(" " + numeros[i][j] + "\t");
			}

			System.out.println();
		}

		resultado = (matrizSimetrica == true) ? "é" : "não é";
		System.out.println("\nA matriz " + resultado + " simétrica.");
	}
}

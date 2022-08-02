package ListaExtraMatrizes;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int[][][] cuboA = new int[10][3][5];
		int[][][] cuboB = new int[10][3][5];
		int[][][] cuboC = new int[10][3][5];
		
		System.out.println("Informe um valor para o cubo A: ");
		int valorA = entradas.nextInt();
		
		for (int i = 0; i < cuboA.length; i++) {
			for (int j = 0; j < cuboA[i].length; j++) {
				for (int k = 0; k < cuboA[i][j].length; k++) {
					cuboA[i][j][k] = valorA;
				}
			}
		}
		
		System.out.println("Informe um valor para o cubo B: ");
		int valorB = entradas.nextInt();
		
		for (int i = 0; i < cuboB.length; i++) {
			for (int j = 0; j < cuboB[i].length; j++) {
				for (int k = 0; k < cuboB[i][j].length; k++) {
					cuboB[i][j][k] = valorB;
					
					cuboC[i][j][k] = cuboA[i][j][k] + cuboB[i][j][k];
				}
			}
		}
		
		System.out.println("Cubo C: ");
		for (int i = 0; i < cuboB.length; i++) {
			for (int j = 0; j < cuboB[i].length; j++) {
				for (int k = 0; k < cuboB[i][j].length; k++) {
					System.out.println(i + ", " + j + ", " + k + " - " + cuboC[i][j][k]);
				}
			}
		}
		
		entradas.close();
	}

}

/** cuboA e cuboB com Tamanhos [10][3][5] */
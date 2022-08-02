package ListaUm;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double valorFinal;

		System.out.println("Insira a quantidade de folhas que deseja copiar");
		int quantFolhas = entradas.nextInt();

		System.out.println("Insira se deseja ou não copiar a frente e o verso das folhas(responda com TRUE caso deseje ou FALSE caso não deseje)");
		boolean frenteEVerso = entradas.nextBoolean();

		if (frenteEVerso == true) {
		   valorFinal = quantFolhas * 2 * (0.08);
		} else {
		   valorFinal = quantFolhas * (0.08);
		}

		System.out.println("Valor a  pagar é: " + valorFinal + " R$");

		entradas.close();
	}

}

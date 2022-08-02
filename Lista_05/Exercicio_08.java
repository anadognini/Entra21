package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		float litros, valorFinal;
		char combustivel;
		
		System.out.println("Insira quantos litros deseja abastecer: ");
		litros = entradas.nextFloat();
		
		System.out.println("Insira qual tipo de combustível deseja:\nG ou g para gasolina\nE ou e para etanol\nD ou d para diesel");
		combustivel = Character.toLowerCase(entradas.next().charAt(0));
		
		if (combustivel == 'g') {
			valorFinal = litros * 2.53f;
			System.out.println("O valor a pagar é: " + valorFinal + " R$");
		} else if (combustivel == 'd') {
			valorFinal = litros * 2.09f;
			System.out.println("O valor a pagar é: " + valorFinal + " R$");
		} else if (combustivel == 'e' && litros <= 30) {
			valorFinal = litros * 1.92f;
			System.out.println("O valor a pagar é: " + valorFinal + " R$");
		} else if (combustivel == 'e' && litros > 30) {
			valorFinal = litros * 1.92f;
			System.out.println("O valor final a pagar é: " + valorFinal + " R$. Você ganhou uma troca de óleo de graça! Parabéns!");
		}
		
		entradas.close();
	}
}

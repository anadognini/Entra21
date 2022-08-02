package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Determinar se um número inteiro qualquer é primo."
				+ "\nInforme um número inteiro maior que 1 ou digite 0 para finalizar: ");
		int numero = entradas.nextInt();
		
		while (numero > 1 && numero != 0) {
			
			if (numero % 1 == 0 && numero % numero == 0) {
				if (numero == 2 || numero == 3 || numero == 7) { 
				System.out.println("É um número primo."); 
				} else if (numero % 3 != 0 && numero % 5 != 0 && numero != 7 && numero % 2 != 0) {
				System.out.println("É um número primo.");
			} else {
				System.out.println("Não é um número primo.");
				   }
			}
			
			System.out.println("Informe um número inteiro maior que 1 ou digite 0 para finalizar: ");
			numero = entradas.nextInt();
		}
		
		entradas.close();
	}
}

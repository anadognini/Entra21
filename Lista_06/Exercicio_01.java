package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Digite um número positivo e para terminar um número negativo ou 0 para finalizar: ");
		int numero = entradas.nextInt();
		
		int produto = 1;
		int soma = 0;
		
		while (numero > 0 && numero != 0) {
			if (numero % 2 == 1) {
				produto *= numero;
			} else if (numero % 2 == 0) {
				soma += numero;
			}
			
			System.out.println("Digite um número positivo e para terminar um número negativo ou 0: ");
			numero = entradas.nextInt();
		}
		
		System.out.println("Produto dos números ímpares: " + produto 
				+ "\nSoma dos números pares: " + soma);
		
		entradas.close();
	}

}

package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Determinar qual o maior e qual o menro número dada uma sequência aleatória.\nDigite um número inteiro positivo qualquer ou -1 para finalizar: ");
		int numero = entradas.nextInt();
		
		int maiorNumero = numero;
		int menorNumero = numero;
		
		while (numero != -1) {
			System.out.println("Digite um número inteiro positivo qualquer ou -1 para finalizar: ");
			numero = entradas.nextInt();
			
			if (numero > maiorNumero) {
				maiorNumero = numero;
			} 
			
			if (numero < menorNumero && numero != -1) {
				menorNumero = numero;
			}
		}
		
		System.out.println("O maior número é " + maiorNumero + " e o menor número é " + menorNumero);
		
		entradas.close();
	}

}

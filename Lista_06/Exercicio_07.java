package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.println("Informe um número inteiro qualquer ou digite 0 para finalizar: ");
		int numero = entradas.nextInt();
		
		while (numero != 0) {
			if (numero > 100 && numero < 200) {
				contador++;
			}
			
			System.out.println("Informe um número inteiro qualquer ou digite 0 para finalizar: ");
			numero = entradas.nextInt();
		}
		
		System.out.println("A quantidade de números entre 100 e 200 é: " + contador);
		
		entradas.close();
	}

}

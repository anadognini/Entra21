package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número inteiro");
		numero = entradas.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é ímpar");
		}
		
		entradas.close();
	}

}

package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número inteiro");
		numero = entradas.nextInt();
		
		if (numero < 0) {
			System.out.println("O número é negativo");
		} else if (numero > 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é neutro");
		}
		
		entradas.close();
	}

}

package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Determinar a tabuada de um número qualquer.\nDigite um número inteiro maior que 0: ");
		int numero = entradas.nextInt();
		
		int contadorTabuada = 0;
		int resultado = 0;
		
		while (numero != 0) {
			for (int i = 1; contadorTabuada < 10; i++) {
				contadorTabuada += 1;
				resultado = (numero * contadorTabuada);
				System.out.println(numero + " * " + i + " = " + resultado);
			}
		}
		
		
		entradas.close();
	}

}


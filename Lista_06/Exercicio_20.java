package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Determinar o intervalo de números dois outros números aleatórios: "
				+ "\nInforme o primeiro número: ");
		int limiteInferior = entradas.nextInt();
		
		System.out.println("Informe o último número: ");
		int limiteSuperior = entradas.nextInt();
		
		for (int i = limiteInferior + 1; i < limiteSuperior; i++) {
			System.out.println(i);
			soma += i;
		}
		
		System.out.println("A soma dos números no intervalo entre " + limiteInferior + " e " + limiteSuperior + " é: " + (soma));
		
		entradas.close();

	}

}

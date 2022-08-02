package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Determinar o intervalo de números pares entre dois outros números limitantes e sua somatória: "
				+ "\nInforme o limite inferior: ");
		int limiteInferior = entradas.nextInt();
		
		System.out.println("Informe o limite superior: ");
		int limiteSuperior = entradas.nextInt();
		
		System.out.print("Pares: ");
		
		while (limiteInferior < limiteSuperior) {
			limiteInferior++;
			
			if ((limiteInferior % 2 == 0) && (limiteInferior != limiteSuperior)) {
				soma += limiteInferior;
				
				System.out.print(limiteInferior + " ");
			}
		}
		
//		for (int i = limiteInferior + 1; i < limiteSuperior; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//				somatorio += i;
//			}
//		}
		
		System.out.println("\nA soma dos números pares no intervalo entre " + limiteInferior + " e " + limiteSuperior + " é: " + soma);
		
		entradas.close();
	}

}

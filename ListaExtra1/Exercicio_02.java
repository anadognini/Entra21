package ListaExtra;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Informe o pre�o do primeiro produto: ");
		float precoProduto1 = entradas.nextFloat();
		
		System.out.println("Informe o pre�o do segundo produto: ");
		float precoProduto2 = entradas.nextFloat();
		
		System.out.println("Informe o pre�o do terceiro produto: ");
		float precoProduto3 = entradas.nextFloat();
		
		if (precoProduto1 < precoProduto2 && precoProduto1 < precoProduto3) {
			System.out.println("O primeiro produto � o mais barato.");
		} else if (precoProduto2 < precoProduto1 && precoProduto2 < precoProduto3) {
			System.out.println("O segundo produto � o mais barato.");
		} else if (precoProduto3 < precoProduto1 && precoProduto3 < precoProduto2) {
			System.out.println("O terceiro produto � o mais barato.");
		}
		
		entradas.close();
	}

}
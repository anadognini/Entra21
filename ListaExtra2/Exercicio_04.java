package ListaExtra2;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Informe o número total de mercadorias no estoque: ");
		int totalMercadorias = entradas.nextInt();
		
		for (int i = 0; i < totalMercadorias; i++) {
			System.out.println("Informe o valor da mercadoria: ");
			float valorMercadoria = entradas.nextFloat();
			
			soma += valorMercadoria;
		}
		
		float media = soma / totalMercadorias;
		
		System.out.println("O valor total em estoque é: R$ " + soma
				+ "\nA média do valor das mercadorias é: R$" + media);

		entradas.close();
	}
}
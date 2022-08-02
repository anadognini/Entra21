package ListaExtra2;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int soma = 0;
		int contador = 0;
		
		System.out.println("Deseja iniciar o cadastramento das mercadorias? S/N?");
		char maisMercadorias = Character.toUpperCase(entradas.next().charAt(0));
		
		while (maisMercadorias == 'S') {
			System.out.println("Informe o valor da mercadoria: ");
			float valorMercadoria = entradas.nextFloat();
			
			soma += valorMercadoria;
			
			System.out.println("Mais mercadorias? S/N?");
			maisMercadorias = Character.toUpperCase(entradas.next().charAt(0));
			
			contador++;
		}
		
		float media = soma / contador;
		
		System.out.println("O valor total em estoque é: R$ " + soma
				+ "\nA média do valor das mercadorias é: R$" + media);

		entradas.close();

	}
}
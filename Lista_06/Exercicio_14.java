package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		float valorTotal = 0;
		
		System.out.println("Determinar o valor total investido na coleção de CDs.\nInforme a quantidade de CDs: ");
		int quantidade = entradas.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Informe o valor do CD: ");
			float valorCD = entradas.nextFloat();
			
			valorTotal += valorCD;
		}
		
		System.out.println("O valor total investido na coleção foi: R$ " + valorTotal);
		
		entradas.close();
	}

}

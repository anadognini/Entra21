package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int idade;
		String classificacao;
		
		System.out.println("Informe a idade do nadador conforme a tabela baixo: "
				+ "\n5 até 7 anos - Infantil A"
				+ "\n8 até 10 anos - Infantil B"
				+ "\n11 até 13 - Juvenil A"
				+ "\n14 até 17 - Juvenil B"
				+ "\nMaiores de 18 anos - Adulto");
		idade = entradas.nextInt();
		
		switch (idade) {
		case 5, 6, 7:
			classificacao = "Infantil A";
			System.out.println(classificacao);
			break;
		case 8, 9, 10:
			classificacao = "Infantil B";
			System.out.println(classificacao);
			break;
		case 11, 12, 13:
			classificacao = "Juvenil A";
			System.out.println(classificacao);
			break;
		case 14, 15, 16, 17:
			classificacao = "Juvenil B";
			System.out.println(classificacao);
			break;
		default:
			classificacao = "Adulto";
			System.out.println(classificacao);
		}
		
		entradas.close();
	}
}

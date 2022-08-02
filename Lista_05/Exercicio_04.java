package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int codigo;
		String classificacao;
		
		System.out.println("Informe o código do produto conforme a tabela abaixo:"
				+ "\n1 - Alimento não-perecível"
				+ "\n2, 3 ou 4 - Alimento perecível"
				+ "\n5 ou 6 - Vestuário"
				+ "\n7 - Higiene pessoal"
				+ "\n8 a 15 - Limpeza e utensílios domésticos"
				+ "\nQualquer outro código - Inválido");
		codigo = entradas.nextInt();
		
		switch (codigo) {
		case 1:
			classificacao = "Alimento não-perecível";
			System.out.println(classificacao);
			break;
		case 2, 3, 4:
			classificacao = "Alimento perecível";
			System.out.println(classificacao);
			break;
		case 5, 6:
			classificacao = "Vestuário";
			System.out.println(classificacao);
			break;
		case 7:
			classificacao = "Higiene pessoal";
			System.out.println(classificacao);
			break;
		case 8, 9, 10, 11, 12, 13, 14, 15:
			classificacao = "Limpeza e utensílios domésticos";
			System.out.println(classificacao);
			break;
		default: 
			classificacao = "Inválido";
			System.out.println(classificacao);
		}
		
		entradas.close();
	}
}

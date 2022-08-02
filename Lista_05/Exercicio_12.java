package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		String nome;
		char conceito;
		int nota1, nota2, nota3;
		float mediaExercicios, mediaAproveitamento;
		
		System.out.println("Informe o seu nome: ");
		nome = entradas.nextLine();
		
		System.out.println("Informe a nota da primeira prova: ");
		nota1 = entradas.nextInt();
		
		System.out.println("Informe a nota da segunda prova: ");
		nota2 = entradas.nextInt();
		
		System.out.println("Informe a nota da terceira prova: ");
		nota3 = entradas.nextInt();
		
		System.out.println("Informe a sua média dos exercícios: ");
		mediaExercicios = entradas.nextFloat();
		
		mediaAproveitamento = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;
				
		if (mediaAproveitamento >= 9.0) {
			conceito = 'A';
			System.out.println(conceito);
		} else if (mediaAproveitamento < 9.0 && mediaAproveitamento >= 7.0) {
			conceito = 'B';
			System.out.println(conceito);
		} else if (mediaAproveitamento < 7.0 && mediaAproveitamento >= 6.0 ) {
			conceito = 'C';
			System.out.println(conceito);
		} else {
			conceito = 'D';
			System.out.println(conceito);
		} 
		
		entradas.close();
	}

}

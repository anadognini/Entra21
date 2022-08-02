package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro qualquer: ");
		int numero = entradas.nextInt();
		
		int resultado = 0;
		int auxiliar = 0;
		int auxiliar1 = 1;
		int auxiliar2 = 0;
		
		while (resultado < numero) {
			auxiliar++;
			resultado = auxiliar * (auxiliar + 1) * (auxiliar + 2);
			}
		
		auxiliar1 = auxiliar + 1;
		auxiliar2 = auxiliar1 + 1;
		
		if (resultado == numero) {
			System.out.println("O número " + numero + " é produto de: " + auxiliar + " * " + auxiliar1 + " * " + auxiliar2);
		} else {
			System.out.println("Não é um número triangular.");
		}
	
		
		entradas.close();
	}

}

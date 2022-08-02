package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double area;
		
		System.out.println("Insira a medida do lado do quadrado");
		double lado = entradas.nextDouble();

		area = lado * lado;

		System.out.println("A área do quadrado de lado " + lado + " é: " + area);

		entradas.close();
	}

}

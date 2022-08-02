package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int dias;
		
		System.out.println("Insira o seu nome: ");
		String nome = entradas.next();
		
		System.out.println("Insira a sua idade: ");
		int idade = entradas.nextInt();

		dias = idade * 365;

		System.out.println(nome + ", você já viveu " + dias + " dias!");
		
		entradas.close();
	}

}

package ListaUm;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Informe uma idade");
		int idade = entradas.nextInt();
		
		System.out.println("A sua idade é: " + idade + " anos.");
		
		entradas.close();
	}

}

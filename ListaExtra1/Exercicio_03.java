package ListaExtra;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);

		System.out.println("Informe um ano qualquer: ");
		int ano = entradas.nextInt();
		
		Boolean anoBissexto;
		
		if (ano % 400 == 0) {
			anoBissexto = true;
			System.out.println(anoBissexto);
		} else if (ano % 4 == 0 && ano % 100 != 0) {
			anoBissexto = true;
			System.out.println(anoBissexto);
		} else {
			anoBissexto = false;
			System.out.println(anoBissexto);
		}
		
		entradas.close();
	}

}
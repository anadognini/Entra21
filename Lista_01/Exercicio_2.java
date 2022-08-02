package ListaUm;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Informe uma quantidade de minutos");
		double minutos = entradas.nextDouble();

		valor = minutos * ((1/60) * 2.3);

		System.out.println("O total a pagar é: " + valor);

		entradas.close();
	}

}

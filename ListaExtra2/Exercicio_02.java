package ListaExtra2;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);

		int i = 2;
		boolean primos = true;
		
		System.out.println("Informe dois números inteiros e positivos: ");
		int valorA = entradas.nextInt();
		int valorB = entradas.nextInt();
		
		while (i <= valorB) {
			if (valorB % i == 0) {
				if (valorA % i == 0) {
					primos = false;
				}
			}
			i++;
		}
		
		if (primos == true) {
			System.out.println("A e B são primos entre si.");
		} else {
			System.out.println("A e B não são primos entre si.");
		}
		
		entradas.close();
	}
}
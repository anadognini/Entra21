package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Informe a medida do primeiro lado: ");
		lado1 = entradas.nextInt();
		
		System.out.println("Informe a medida do segundo lado: ");
		lado2 = entradas.nextInt();
		
		System.out.println("Informe a medida do terceiro lado: ");
		lado3 = entradas.nextInt();
		
		if ((lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2) {
			if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
				System.out.println("� um tri�ngulo equil�tero");
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("� um tri�ngulo is�celes");
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println("� um tri�ngulo escaleno");
			}
		} else {
			System.out.println("N�o � um tri�ngulo");
		}
		
		entradas.close();
	}

}
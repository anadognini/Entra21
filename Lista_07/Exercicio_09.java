package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int idades[] = new int[10];
		int contador = 0;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Informe a idade da pessoa " + i);
			idades[i] = entradas.nextInt();
			
			if (idades[i] > 35) {
				contador++;
			}
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.print("\n" + i + " - " + idades[i]);
			
			if (idades[i] > 35) {
				System.out.print(" <-- A idade desta pessoa é superior a 35");
			} 
		}
		
		System.out.println("\n\nA quantidade de pessoas com idade superior a 35 é: " + contador);
		
		entradas.close();
	}
}
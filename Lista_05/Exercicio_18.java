package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Informe uma letra qualquer: ");
		letra = Character.toLowerCase(entradas.next().charAt(0));
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'y') {
			System.out.println("A letra é uma vogal");
		} else {
			System.out.println("A letra é uma consoante");
		}
		
		entradas.close();
	}

}
package ListaExtra2;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Informe a senha para acessar: ");
		int senha = entradas.nextInt();
		
		if (senha != 1234) {
			while (senha != 1234) {
				System.out.println("ACESSO NEGADO. Favor inserir novamente a senha: ");
				senha = entradas.nextInt();
			}
		} else {
			System.out.println("ACESSO PERMITIDO");
		}
			
		System.out.println("ACESSO PERMITIDO");
	
		entradas.close();
	}
}

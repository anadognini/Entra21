package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Atrasado {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Informe o hor�rio de chegada: ");
		int a = entradas.nextInt();
		
		String b = (a > 14) ? "Atrasado" : (a < 14) ? "Adiantado" : "No hor�rio";
		
		System.out.println("Resultado: " + b);
		
		entradas.close();
	}

}

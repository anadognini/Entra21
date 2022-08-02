package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Insira um número de 1 a 7");
		int dia = entradas.nextInt();
		
		String diaDaSemana;
		
		switch (dia) {
			case 1:
				diaDaSemana = "Domingo";
				System.out.println(diaDaSemana);
				break;
			case 2:
				diaDaSemana = "Segunda-feira";
				System.out.println(diaDaSemana);
				break;
			case 3:
				diaDaSemana = "Terça-feira";
				System.out.println(diaDaSemana);
				break;
			case 4:
				diaDaSemana = "Quarta-feira";
				System.out.println(diaDaSemana);
				break;
			case 5:
				diaDaSemana = "Quinta-feira";
				System.out.println(diaDaSemana);
				break;
			case 6:
				diaDaSemana = "Sexta-feira";
				System.out.println(diaDaSemana);
				break;
			case 7:
				diaDaSemana = "Sábado";
				System.out.println(diaDaSemana);
				break;
		}
		
		entradas.close();

	}

}

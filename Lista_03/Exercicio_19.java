package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double minutos, segundos;
		
		System.out.println("Insira quantas horas");
		double horas = entradas.nextDouble();

		minutos = horas * 60;
		segundos = minutos * 60;

		System.out.println("Horas: " + horas + ", minutos: " + minutos + ", segundos: " + segundos);

		entradas.close();
	}

}

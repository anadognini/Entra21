package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double lucro, percentual;
		
		System.out.println("Informe a receita da empresa");
		double receita = entradas.nextDouble();
		
		System.out.println("Informe as despesas da empresa");
		double despesas = entradas.nextDouble();

		lucro = receita - despesas;
		percentual = (lucro / receita) * 100;

		System.out.println("Lucro: " + lucro + "\nPercentual das despesas em relação à receita: " + percentual);

		entradas.close();
	}

}

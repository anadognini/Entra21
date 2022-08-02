package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		float peso, altura, IMC;
		
		System.out.println("Informe o seu peso: ");
		peso = entradas.nextFloat();
		
		System.out.println("Informe a sua altura: ");
		altura = entradas.nextFloat();
		
		IMC = peso / (altura * altura);
		
		if (IMC < 18.5) {
			System.out.println("IMC: " + IMC + " | Abaixo do peso");
		} else if (IMC >= 18.5 && IMC < 25) {
			System.out.println("IMC: " + IMC + " | Peso normal");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("IMC: " + IMC + " | Acima do peso");
		} else {
			System.out.println("IMC: " + IMC + " | Obeso");
		}

		
		entradas.close();
	}

}

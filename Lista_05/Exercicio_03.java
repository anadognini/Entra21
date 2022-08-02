package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		float altura, peso;
		char genero;
		
		System.out.println("Informe a sua altura: ");
		altura = entradas.nextFloat();
		
		System.out.println("Informe o seu gênero (M ou m para mulheres, H ou h para homens): ");
		genero = entradas.next().charAt(0);
		
		if (genero == 'M' || genero == 'm') {
			peso = (62.1f * altura) - 44.7f;
			System.out.println("Seu peso ideal é: " + peso + "kg");
		} else {
			peso = (72.7f * altura) - 58;
			System.out.println("Seu peso ideal é: " + peso + "kg");
		}
		
		entradas.close();
	}

}

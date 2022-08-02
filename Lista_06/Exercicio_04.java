package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int contador1 = 0;
		int contador2 = 0;
		
		System.out.println("Informe a sua altura: ");
		float altura = entradas.nextFloat();
		
		System.out.println("Informe o seu gênero (0 para masculino e 1 para feminino): ");
		int genero = entradas.nextInt();
		
		float maiorAltura = Float.MIN_VALUE;
		float menorAltura = Float.MAX_VALUE;
		float somaMulheres = altura;
		float somaPopulacao = altura;
		float somaHomens = 0;

		for (int i = 1; i <= 5; i++) {
			contador2 += 1;
			somaPopulacao += altura;
			
			// Maior e menor altura:
			if (altura > maiorAltura) {
				maiorAltura = altura;
			} else if (altura < menorAltura) {
				menorAltura = altura;
			}
			
			// Média da altura das mulheres
			if (genero == 1) {
				contador1 += 1;
				somaMulheres += altura;
			} else if (genero == 0) {
				somaHomens += 1;
			}
			
			System.out.println("Informe a sua altura: ");
			altura = entradas.nextFloat();
			
			System.out.println("Informe o seu gênero (0 para masculino e 1 para feminino): ");
			genero = entradas.nextInt();
			
		}
		
		float mediaAlturaMulheres = (somaMulheres / contador1);
		float mediaAlturaPopulacao = (somaPopulacao / contador2);
		float percentualHomens = (100 * somaHomens) / contador2;
		
		System.out.println("A maior altura encontrada foi: " + maiorAltura
				+ "\nA menor altura encontrada foi: " + menorAltura 
				+ "\nO resultado da média da altura das mulheres foi: " + mediaAlturaMulheres
				+ "\nO resultado da médida a altura da população foi: " + mediaAlturaPopulacao
				+ "\nO percentual de homens na população é: " + percentualHomens + "%");
		
		entradas.close();
	}

}

/* Para obter os valores mínimo e máximo, a classe Java Wrapped fornece as constantes MIN_VALUE e MAX_VALUE. Essas constantes contêm os valores que um objeto Wrapped 
pode conter como valores mínimo e máximo, no caso o tipo primitivo aquivalente àquela classe Wrapped específica.

No caso de float, esses valores são

menor valor: 1.40239846e-46
maior valor: 3.40282347e+38
*/

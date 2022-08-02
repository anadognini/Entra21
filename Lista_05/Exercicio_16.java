package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int operando1, operando2;
		char operacao;
		float resultado;
		String parOuImpar, negativoOuPositivo;
		
		System.out.println("Informe o primeiro operando: ");
		operando1 = entradas.nextInt();
		
		System.out.println("Informe o segundo operando: ");
		operando2 = entradas.nextInt();
		
		System.out.println("Selecione a operação que deseja realizar: \nSoma: +\nSubtração: -\nMultiplicação: *\nDivisão: /");
		operacao = entradas.next().charAt(0);
		
		switch (operacao) {
			case '+': 
				resultado = operando1 + operando2;
				System.out.println("Soma: " + resultado);
				
				parOuImpar = (resultado % 2 == 0) ? "par" : "ímpar";
				negativoOuPositivo = (resultado > 0) ? "positivo" : "negativo";
				
				System.out.println("O resultado da soma é " + parOuImpar + ".");
				System.out.println("O resultado da soma é " + negativoOuPositivo + ".");
				
				break;
				
			case '-':
				resultado = operando1 - operando2;
				System.out.println("Subtração: " + resultado);
				
				parOuImpar = (resultado % 2 == 0) ? "par" : "ímpar";
				negativoOuPositivo = (resultado > 0) ? "positivo" : "negativo";
				
				System.out.println("O resultado da soma é " + parOuImpar + ".");
				System.out.println("O resultado da soma é " + negativoOuPositivo + ".");
				
				break;
				
			case '*':
				resultado = operando1 * operando2;
				System.out.println("Multiplicação: " + resultado);
				
				parOuImpar = (resultado % 2 == 0) ? "par" : "ímpar";
				negativoOuPositivo = (resultado > 0) ? "positivo" : "negativo";
				
				System.out.println("O resultado da soma é " + parOuImpar + ".");
				System.out.println("O resultado da soma é " + negativoOuPositivo + ".");
				
				break;
				
			case '/':
				resultado = operando1 / operando2;
				System.out.println("Divisão: " + resultado);
				
				parOuImpar = (resultado % 2 == 0) ? "par" : "ímpar";
				negativoOuPositivo = (resultado > 0) ? "positivo" : "negativo";
				
				System.out.println("O resultado da soma é " + parOuImpar + ".");
				System.out.println("O resultado da soma é " + negativoOuPositivo + ".");
				
				break;
				
			default:
				System.out.println("Operação inválida");
			}
				
		entradas.close();
	}
}

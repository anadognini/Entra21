package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Selecione a operação que deseja realizar: \nSoma: +\nSubtração: -\nMultiplicação: *\nDivisão: /");
		char operacao = entradas.next().charAt(0);
		
		System.out.println("Informe o primeiro operando: ");
		int operando1 = entradas.nextInt();
		
		System.out.println("Informe o segundo operando: ");
		int operando2 = entradas.nextInt();
		
		if (operacao == '+') {
			int soma = operando1 + operando2;
			System.out.println(soma);
		} else if (operacao == '-') {
			int subtracao = operando1 - operando2;
			System.out.println(subtracao);
		} else if (operacao == '*') {
			int multiplicacao = operando1 * operando2;
			System.out.println(multiplicacao);
		} else if (operacao == '/') {
			float divisao = operando1 / operando2;
			System.out.println(divisao);
		}
		
		entradas.close();
	}

}

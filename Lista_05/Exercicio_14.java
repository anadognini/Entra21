package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int saldoMedio;
		float credito, percentual;
		
		System.out.println("Informe o saldo médio do cliente: ");
		saldoMedio = entradas.nextInt();
		
		if (saldoMedio <= 200) {
			System.out.println("Seu saldo médio foi de " + saldoMedio + ". Infelizmente, você não recebeu nenhum crédito.");
		} else if (saldoMedio > 201 && saldoMedio <= 400) {
			percentual = 0.20f;
			credito = saldoMedio * percentual;
			System.out.println("Seu saldo médio foi de " + saldoMedio + ". Você recebeu um crédito de " + credito + "!");
		} else if (saldoMedio > 401 && saldoMedio <= 600) {
			percentual = 0.30f;
			credito = saldoMedio * percentual;
			System.out.println("Seu saldo médio foi de " + saldoMedio + ". Você recebeu um crédito de " + credito + "!");
		} else if (saldoMedio > 601) {
			percentual = 0.40f;
			credito = saldoMedio * percentual;
			System.out.println("Seu saldo médio foi de " + saldoMedio + ". Você recebeu um crédito de " + credito + "!");
		}
		
		entradas.close();
	}

}
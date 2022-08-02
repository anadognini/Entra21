package ListaNoveExercicio5;

import java.util.Scanner;

public class Conta {
	int numero;
	double saldo;
	String status;
	double limite;
	
	// Método para realizar saques
	void realizarSaque(Scanner entradas) {
		System.out.println("Sacar dinheiro.");
		
		System.out.println("Quanto deseja sacar?");
		double quantiaASacar = entradas.nextDouble();
		
		if (saldo > 0) {
			if (quantiaASacar <= saldo) {
				System.out.println("Foram sacados " + quantiaASacar + " reais da conta " + numero + ".");
				
				saldo = saldo -  quantiaASacar;
				
				System.out.println("Seu saldo agora é: " + saldo + " reais.");
			} else if (quantiaASacar > saldo) {
				
				while (quantiaASacar > saldo) {					
					System.out.println("Ocorreu um erro. A quantia a ser sacada é maior do que o saldo da conta. Tente novamente: ");
					quantiaASacar = entradas.nextDouble();
					
					if (quantiaASacar <= saldo) {
						System.out.println("Foram sacados " + quantiaASacar + " reais da conta " + numero);
						
						saldo = saldo -  quantiaASacar;
						
						System.out.println("O saldo agora é: " + saldo + " reais.");
					}
				}
			}
			

		} else if (saldo <= 0) {
			System.out.println("Não é possível sacar dinheiro da sua conta, pois seu saldo não permite.");
		}
	}
	
	// Método para depositar dinheiro na conta
	void depositarDinheiro (Scanner entradas) {
		System.out.println("Depositar dinheiro");
		System.out.println("Quanto deseja depositar?");
		double quantiaADepositar = entradas.nextDouble();
		
		saldo = saldo + quantiaADepositar;
		
		System.out.println("O saldo agora é: " + saldo + " reais.");
	}
	
	// Método para consultar saldo
	void consultarSaldo () {
		System.out.println("Consultar saldo");
		System.out.println("O saldo da conta " + numero +  " é: " + saldo + " reais.");
	}
	
	// Método para verificar se há cheque especial
	void verificarChequeEspecial (Scanner entradas) {
		System.out.println("Verificar se há cheque especial");
		
		if (status.equals("Sim")) {
			System.out.println("A conta " + numero + " possui cheque especial.");
		} else if (status.equals("Não")) {
			System.out.println("A conta " + numero + " não possui cheque especial.");
		} else {
			while (!status.equals("Sim") && !status.equals("Não")) {
				System.out.println("Ocorreu um erro. Informe novamente o status da conta. Lembrando que só é possível digitar <Sim> ou <Não>: ");
				status = entradas.next();
			}
		}
	}
}

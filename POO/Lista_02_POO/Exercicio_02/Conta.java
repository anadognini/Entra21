package ListaNoveExercicio5;

import java.util.Scanner;

public class Conta {
	int numero;
	double saldo;
	String status;
	double limite;
	
	// M�todo para realizar saques
	void realizarSaque(Scanner entradas) {
		System.out.println("Sacar dinheiro.");
		
		System.out.println("Quanto deseja sacar?");
		double quantiaASacar = entradas.nextDouble();
		
		if (saldo > 0) {
			if (quantiaASacar <= saldo) {
				System.out.println("Foram sacados " + quantiaASacar + " reais da conta " + numero + ".");
				
				saldo = saldo -  quantiaASacar;
				
				System.out.println("Seu saldo agora �: " + saldo + " reais.");
			} else if (quantiaASacar > saldo) {
				
				while (quantiaASacar > saldo) {					
					System.out.println("Ocorreu um erro. A quantia a ser sacada � maior do que o saldo da conta. Tente novamente: ");
					quantiaASacar = entradas.nextDouble();
					
					if (quantiaASacar <= saldo) {
						System.out.println("Foram sacados " + quantiaASacar + " reais da conta " + numero);
						
						saldo = saldo -  quantiaASacar;
						
						System.out.println("O saldo agora �: " + saldo + " reais.");
					}
				}
			}
			

		} else if (saldo <= 0) {
			System.out.println("N�o � poss�vel sacar dinheiro da sua conta, pois seu saldo n�o permite.");
		}
	}
	
	// M�todo para depositar dinheiro na conta
	void depositarDinheiro (Scanner entradas) {
		System.out.println("Depositar dinheiro");
		System.out.println("Quanto deseja depositar?");
		double quantiaADepositar = entradas.nextDouble();
		
		saldo = saldo + quantiaADepositar;
		
		System.out.println("O saldo agora �: " + saldo + " reais.");
	}
	
	// M�todo para consultar saldo
	void consultarSaldo () {
		System.out.println("Consultar saldo");
		System.out.println("O saldo da conta " + numero +  " �: " + saldo + " reais.");
	}
	
	// M�todo para verificar se h� cheque especial
	void verificarChequeEspecial (Scanner entradas) {
		System.out.println("Verificar se h� cheque especial");
		
		if (status.equals("Sim")) {
			System.out.println("A conta " + numero + " possui cheque especial.");
		} else if (status.equals("N�o")) {
			System.out.println("A conta " + numero + " n�o possui cheque especial.");
		} else {
			while (!status.equals("Sim") && !status.equals("N�o")) {
				System.out.println("Ocorreu um erro. Informe novamente o status da conta. Lembrando que s� � poss�vel digitar <Sim> ou <N�o>: ");
				status = entradas.next();
			}
		}
	}
}

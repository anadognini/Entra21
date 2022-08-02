package ListaNovePOO;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		Conta conta1 = new Conta();
		
		System.out.println("Informe o número da conta:");
		int numero = entradas.nextInt();
		conta1.setNumero(numero);

		System.out.println("Informe o saldo da conta:");
		double saldo = entradas.nextDouble();
		conta1.setSaldo(saldo);
		
		System.out.println("Informe se a conta é especial ou não. Digite apenas <Sim> ou <Não>:");
		String status = entradas.next();
		conta1.setStatus(status);
		
		System.out.println("Informe o limite do cartão de crédito:");
		double limite = entradas.nextDouble();
		conta1.setLimite(limite);
		
		System.out.println("\nEscolha  opção que deseja: \n1 - Realizar saque;"
				+ "\n2 - Despositar dinheiro;"
				+ "\n3 - Consultar saldo;"
				+ "\n4 - Verificar se há cheque especial;"
				+ "\n5 - Sair do sistema." );
		int opcao = entradas.nextInt();
		
		System.out.println("\nVocê escolheu: ");
			
		while (opcao != 5) {
			switch (opcao) {
			case 1: 					
				conta1.realizarSaque(entradas);
				
				System.out.println("\nDeseja realizar outro procedimento? Caso sim, selecione: \n1 - Realizar saque;"
						+ "\n2 - Despositar dinheiro;"
						+ "\n3 - Consultar saldo;"
						+ "\n4 - Verificar se há cheque especial;"
						+ "\nCaso não, digite 5 para sair do sistema." );
				opcao = entradas.nextInt();
				break;
			case 2:					
				conta1.depositarDinheiro(entradas);
				
				System.out.println("\nDeseja realizar outro procedimento? Caso sim, selecione: \n1 - Realizar saque;"
						+ "\n2 - Despositar dinheiro;"
						+ "\n3 - Consultar saldo;"
						+ "\n4 - Verificar se há cheque especial;"
						+ "\nCaso não, digite 5 para sair do sistema." );
				opcao = entradas.nextInt();
				break;
			case 3: 
				conta1.consultarSaldo();
				
				System.out.println("\nDeseja realizar outro procedimento? Caso sim, selecione: \n1 - Realizar saque;"
						+ "\n2 - Despositar dinheiro;"
						+ "\n3 - Consultar saldo;"
						+ "\n4 - Verificar se há cheque especial;"
						+ "\nCaso não, digite 5 para sair do sistema." );
				opcao = entradas.nextInt();
				break;
				
			case 4:
				conta1.verificarChequeEspecial(entradas);
				
				System.out.println("\nDeseja realizar outro procedimento? Caso sim, selecione: \n1 - Realizar saque;"
						+ "\n2 - Despositar dinheiro;"
						+ "\n3 - Consultar saldo;"
						+ "\n4 - Verificar se há cheque especial;"
						+ "\nCaso não, digite 5 para sair do sistema." );
				opcao = entradas.nextInt();
				break;
				
			default:
				System.out.println("\nOcorreu um erro. Esta opção não existe. Tente novamente: \n1 - Realizar saque;"
						+ "\n2 - Despositar dinheiro;"
						+ "\n3 - Consultar saldo;"
						+ "\n4 - Verificar se há cheque especial;"
						+ "\nCaso não, digite 5 para sair do sistema." );
				opcao = entradas.nextInt();
			}
		}
		
		System.out.println("\nSistema finalizado.");
		
		entradas.close();

	}

}

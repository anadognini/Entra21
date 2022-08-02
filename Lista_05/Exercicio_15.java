package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		char tipoDeCarne;
		float quantidade;
		float valorInicial, valorDoDesconto, valorFinal;
		float precoFileDuplo1 = 4.9f;
		float precoFileDuplo2 = 5.8f;
		float precoAlcatra1 = 5.9f;
		float precoAlcatra2 = 6.8f;
		float precoPicanha1 = 6.9f;
		float precoPicanha2 = 7.8f;
		int pagamento;
		float desconto = 0.05f;
		
		System.out.println("Informe o tipo de carne que deseja comprar, com base na tabela:"
				+ "\n   Tipo de Carne    |   Qtd < 5kg   |   Qtd > 5kg"
				+ "\n----------------------------------------------------"
				+ "\nFilé Duplo (F ou f) |     4.9 R$    |     5.8 R$"
				+ "\nAlcatra (A ou a)    |     5.9 R$    |     6.8 R$"
				+ "\nPicanha (P ou p)    |     6.9 R$    |     7.8 R$");
		tipoDeCarne = entradas.next().charAt(0);
		
		System.out.println("Informe a quantidade em kg que deseja comprar: ");
		quantidade = entradas.nextFloat();
		
		// Valor caso a pessoa opte por comprar o filé duplo:
		if (tipoDeCarne == 'F' || tipoDeCarne == 'f') {
			System.out.println("O tipo de carne escolhida foi: Filé duplo. A quantidade a comprar é de " + quantidade + " kg(s).");
			if (quantidade < 5) {
			valorInicial = quantidade * precoFileDuplo1;
			System.out.println("Valor final: " + quantidade + " * " + precoFileDuplo1 + " = " + valorInicial + " R$.");
	
			System.out.println("Informe se o pagamento vai ser no cartão (opção 1) ou em dinheiro (opção 2): ");
			pagamento = entradas.nextInt();
			if (pagamento == 1) {
				System.out.println("Você recebeu um desconto de 5%!");
        		valorDoDesconto = valorInicial * desconto;
        		valorFinal = valorInicial - valorDoDesconto;
        		System.out.println("O valor do seu desconto foi de: " + valorDoDesconto + " e o seu total a pagar é de: " + valorFinal + " R$.");
			} else if (pagamento == 2) {
				valorFinal = valorInicial;
				System.out.println("O seu total a pagar é de: " + valorFinal + " R$.");
			} 
			} else if (quantidade > 5) {
				valorInicial = quantidade * precoFileDuplo2;
				System.out.println("Valor final: " + quantidade + " * " + precoFileDuplo2 + " = " + valorInicial + " R$.");
				
				System.out.println("Informe se o pagamento vai ser no cartão (opção 1) ou em dinheiro (opção 2): ");
				pagamento = entradas.nextInt();
				if (pagamento == 1) {
					System.out.println("Você recebeu um desconto de 5%!");
	        		valorDoDesconto = valorInicial * desconto;
	        		valorFinal = valorInicial - valorDoDesconto;
	        		System.out.println("O valor do seu desconto foi de: " + valorDoDesconto + " e o seu total a pagar é de: " + valorFinal + " R$.");
				} else if (pagamento == 2) {
				valorFinal = valorInicial;
				System.out.println("O seu total a pagar é de: " + valorFinal + " R$.");
			} 
			}
		}
			
		// Valor caso a pessoa opte por comprar a alcatra:	
		if (tipoDeCarne == 'A' || tipoDeCarne == 'a') {
			System.out.println("O tipo de carne escolhida foi: Alcatra. A quantidade a comprar é de " + quantidade + " kg(s).");
			if (quantidade < 5) {
			valorInicial = quantidade * precoAlcatra1;
			System.out.println("Valor final: " + quantidade + " * " + precoAlcatra1 + " = " + valorInicial + " R$.");
	
			System.out.println("Informe se o pagamento vai ser no cartão (opção 1) ou em dinheiro (opção 2): ");
			pagamento = entradas.nextInt();
			if (pagamento == 1) {
				System.out.println("Você recebeu um desconto de 5%!");
        		valorDoDesconto = valorInicial * desconto;
        		valorFinal = valorInicial - valorDoDesconto;
        		System.out.println("O valor do seu desconto foi de: " + valorDoDesconto + " e o seu total a pagar é de: " + valorFinal + " R$.");
			} else if (pagamento == 2) {
				valorFinal = valorInicial;
				System.out.println("O seu total a pagar é de: " + valorFinal + " R$.");
			} 
			} else if (quantidade > 5) {
				valorInicial = quantidade * precoAlcatra2;
				System.out.println("Valor final: " + quantidade + " * " + precoAlcatra2 + " = " + valorInicial + " R$.");
				
				System.out.println("Informe se o pagamento vai ser no cartão (opção 1) ou em dinheiro (opção 2): ");
				pagamento = entradas.nextInt();
				if (pagamento == 1) {
					System.out.println("Você recebeu um desconto de 5%!");
	        		valorDoDesconto = valorInicial * desconto;
	        		valorFinal = valorInicial - valorDoDesconto;
	        		System.out.println("O valor do seu desconto foi de: " + valorDoDesconto + " e o seu total a pagar é de: " + valorFinal + " R$.");
			} else if (pagamento == 2) {
				valorFinal = valorInicial;
				System.out.println("O seu total a pagar é de: " + valorFinal + " R$.");
			} 
			}
		}
		 
		// Valor caso a pessoa opte por comprar a picanha:
				if (tipoDeCarne == 'P' || tipoDeCarne == 'p') {
					System.out.println("O tipo de carne escolhida foi: Picanha. A quantidade a comprar é de " + quantidade + " kg(s).");
					if (quantidade < 5) {
					valorInicial = quantidade * precoPicanha1;
					System.out.println("Valor final: " + quantidade + " * " + precoPicanha1 + " = " + valorInicial + " R$.");
			
					System.out.println("Informe se o pagamento vai ser no cartão (opção 1) ou em dinheiro (opção 2): ");
					pagamento = entradas.nextInt();
					if (pagamento == 1) {
						System.out.println("Você recebeu um desconto de 5%!");
		        		valorDoDesconto = valorInicial * desconto;
		        		valorFinal = valorInicial - valorDoDesconto;
		        		System.out.println("O valor do seu desconto foi de: " + valorDoDesconto + " e o seu total a pagar é de: " + valorFinal + " R$.");
					} else if (pagamento == 2) {
						valorFinal = valorInicial;
						System.out.println("O seu total a pagar é de: " + valorFinal + " R$.");
					} 
					} else if (quantidade > 5) {
						valorInicial = quantidade * precoPicanha2;
						System.out.println("Valor final: " + quantidade + " * " + precoPicanha2 + " = " + valorInicial + " R$.");
						
						System.out.println("Informe se o pagamento vai ser no cartão (opção 1) ou em dinheiro (opção 2): ");
						pagamento = entradas.nextInt();
						if (pagamento == 1) {
							System.out.println("Você recebeu um desconto de 5%!");
			        		valorDoDesconto = valorInicial * desconto;
			        		valorFinal = valorInicial - valorDoDesconto;
			        		System.out.println("O valor do seu desconto foi de: " + valorDoDesconto + " e o seu total a pagar é de: " + valorFinal + " R$.");
						} else if (pagamento == 2) {
						valorFinal = valorInicial;
						System.out.println("O seu total a pagar é de: " + valorFinal + " R$.");
					} 
					}
				}
		
		entradas.close();
	}
}

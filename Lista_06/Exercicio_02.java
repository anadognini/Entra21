package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int maiorNumeroMultas = 0;
		int numeroMultas = 0;
		float totalRecursos = 0;
		float carteiraComMaisMultas = 0;
		
		System.out.println("Informe o número da carteira ou 0 para terminar: ");
		int numeroCarteira = entradas.nextInt();

		while (numeroCarteira != 0) {
			float divida = 0;
			
			System.out.println("Informe o número de multas na carteira: ");
			numeroMultas = entradas.nextInt();
			
				for (int i = 1; i <= numeroMultas; i++) {
					System.out.println("Informe o valor da multa: ");
					float valorMultaIndividual = entradas.nextFloat();
					
					divida += valorMultaIndividual;
				}
			
				if (numeroMultas > maiorNumeroMultas) {
					maiorNumeroMultas = numeroMultas;
					carteiraComMaisMultas = numeroCarteira;
				} 
				
			System.out.println("A dívida do motorista é de: R$ " + divida);
			
			System.out.println("Informe o número da carteira ou 0 para terminar: ");
			numeroCarteira = entradas.nextInt();
			
			totalRecursos += divida;
		}
		
		 if (numeroMultas == maiorNumeroMultas) {
			System.out.println("Os motoristas possuem a mesma quantidade de multas."
					+ "\nO total de recursos arrecadados foi: R$ " + totalRecursos);
		 } else {
			 System.out.println("\nO motorista com o maior número de multas é o motorista de carteira nº: " + carteiraComMaisMultas
						+ "\nO total de recursos arrecadados foi: R$ " + totalRecursos); 
		 }
		
		entradas.close();
	}
}

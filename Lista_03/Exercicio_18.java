package ListaTresAtribuicaoOperadores;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double pagouAcoes, taxa1, vendeuAcoes, taxa2, quantiaFinal, taxaTotal;

		pagouAcoes = 1000 * (32.87);
		taxa1 = pagouAcoes * (0.02);
		vendeuAcoes = 1000 * (33.92);
		taxa2 = vendeuAcoes * (0.02);
		taxaTotal = taxa1 + taxa2;
		quantiaFinal = (vendeuAcoes - pagouAcoes) - (taxaTotal);

		System.out.println("a. A quantia que Jos� pagou pelas a��es: " + pagouAcoes + " reais.");
		System.out.println("b. O valor da comiss�o que Jos� pagou ao seu corretor quando ele comprou as a��es: " + taxa1 + " reais.");
		System.out.println("c. A quantia pela qual Jos� vendeu as a��es: " + vendeuAcoes + " reais.");
		System.out.println("d. A quantia de comiss�o que Jos� pagou ao seu corretor quando ele vendeu as a��es: " + taxa2 + " reais.");
		System.out.println("e. Mostre a quantia que Jos� ganhou ao vender as a��es e pagar o corretor." + quantiaFinal + " reais.");
		
		entradas.close();
	}

}

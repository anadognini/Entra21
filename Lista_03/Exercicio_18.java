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

		System.out.println("a. A quantia que José pagou pelas ações: " + pagouAcoes + " reais.");
		System.out.println("b. O valor da comissão que José pagou ao seu corretor quando ele comprou as ações: " + taxa1 + " reais.");
		System.out.println("c. A quantia pela qual José vendeu as ações: " + vendeuAcoes + " reais.");
		System.out.println("d. A quantia de comissão que José pagou ao seu corretor quando ele vendeu as ações: " + taxa2 + " reais.");
		System.out.println("e. Mostre a quantia que José ganhou ao vender as ações e pagar o corretor." + quantiaFinal + " reais.");
		
		entradas.close();
	}

}

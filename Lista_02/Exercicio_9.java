package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valorCarne, valorCerveja, total;
		
		System.out.println("Informe a quantidade de pessoas que irão no churrasco: ");
		int pessoas = leitor.nextInt();
	
		valorCarne = 0.5 * pessoas * 18;
		valorCerveja = 6 * 1.7 * pessoas;
		
		total = valorCerveja + valorCarne;
		
		System.out.println("O valor gasto com carne será de: " + valorCarne + " reais");
		System.out.println("O valor gasto com cerveja será de: " + valorCerveja + " reais");
		System.out.println("O valor total será de: " + total + " reais");
		
		leitor.close();
	}

}

package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valorCarne, valorCerveja, total;
		
		System.out.println("Informe a quantidade de pessoas que ir�o no churrasco: ");
		int pessoas = leitor.nextInt();
	
		valorCarne = 0.5 * pessoas * 18;
		valorCerveja = 6 * 1.7 * pessoas;
		
		total = valorCerveja + valorCarne;
		
		System.out.println("O valor gasto com carne ser� de: " + valorCarne + " reais");
		System.out.println("O valor gasto com cerveja ser� de: " + valorCerveja + " reais");
		System.out.println("O valor total ser� de: " + total + " reais");
		
		leitor.close();
	}

}

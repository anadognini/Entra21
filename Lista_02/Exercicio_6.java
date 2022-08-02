package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double total;
		
		System.out.println("Informe a quantidade de dias em atraso: ");
		int quantDias = leitor.nextInt();
		
		total = quantDias * (2.5);
		
		System.out.println("O valor a ser pago de multa é de " + total + " reais.");
		
		leitor.close();
	}

}

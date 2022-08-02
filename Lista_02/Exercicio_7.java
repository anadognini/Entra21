package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Digite o peso informado na balança em gramas: ");
		double peso = leitor.nextDouble();
		
		valor = (peso - 230) * 0.02;
		
		System.out.println("o valor da refeição foi de " + valor + " reais.");
		
		leitor.close();

	}

}

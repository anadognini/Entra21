package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double total;
		
		System.out.println("Digite a quantidade de fotos avulsas para revelar: ");
		int fotosAvulsas = leitor.nextInt();
		
		System.out.println("Digite a quantidade de pacotes (100 fotos) para revelar: ");
		int quantPacotes = leitor.nextInt();
		
		total = (quantPacotes * 44) + (fotosAvulsas * 0.70);
		
		System.out.println("O total a pagar é: " + total + " reais.");
		
		leitor.close();

	}

}

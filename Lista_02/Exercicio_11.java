package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		/* tipoScanner nomevari�vel = new Scanner(System.in)
		                 atribui��o = inst�ncia
		 Quando atribu�mos o novo objeto instanciado a uma vari�vel estamos de fato criando ele. */
		
		double total;
		
		System.out.println("Informe a quantidade das rosas: ");
		double quantRosas = leitor.nextDouble();
		
		System.out.println("Informe a quantidade das tulipas: ");
		double quantTulipas = leitor.nextDouble();
		
		total = (quantRosas * 4.2) + (quantTulipas * 2.8);
		
		System.out.println("O valor das flores � de: " + total);
		
		leitor.close();
	}

}

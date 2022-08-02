package ListaCincoEstruturasDeSelecao;
import java.util.Scanner;

public class VidaDeProgramador {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int quantOvos;
		
		System.out.println("Informe se há batatas: ");
		boolean quantBatatas = entradas.nextBoolean();
		
		if (quantBatatas == true) {
			quantOvos = 9;
			System.out.println("Leve " + quantOvos + " ovos.");
		} else {
			quantOvos = 6;
			System.out.println("Leve " + quantOvos + " ovos.");
		}
		
		entradas.close();
	}

}

package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double velocidadeMedia;
		
		System.out.println("Informe o nome do piloto: ");
		String nome = leitor.nextLine();
		
		System.out.println("Informe a distância percorrida: ");
		double distancia = leitor.nextDouble();
		
		System.out.println("Informe o tempo que o piloto demorou para percorrê-la: ");
		double tempo = leitor.nextDouble();
		
		velocidadeMedia = distancia / tempo;
		
		System.out.println("A velocidade média de " + nome + " foi: " + velocidadeMedia);
		
		leitor.close();

	}

}

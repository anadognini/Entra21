package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double grausFahrenheit;
		
		System.out.println("Insira uma temperatura, em Celsius: ");
		double grausCelsius = leitor.nextDouble();
		
		grausFahrenheit = (1.8 * grausCelsius) + 32;
		
		System.out.println("A temperatura atual em Fahrenheit é: " + grausFahrenheit + "º.");
		
		leitor.close();

	}

}

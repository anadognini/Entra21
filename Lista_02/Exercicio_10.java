package ListaDoisEntradaSaida;
import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Informe o nome do funcionário: ");
		String nome = leitor.nextLine();
		
		System.out.println("Informe a quantidade de horas trabalhadas pelo funcionário: ");
		int horas = leitor.nextInt();
		
		System.out.println("Informe o valor da hora do funcionário: ");
		double valorHora = leitor.nextDouble();
		
		System.out.println("Informe a quantidade de filhos do funcionário: ");
		int quantFilhos = leitor.nextInt();
		
		salario = (valorHora * horas) + (quantFilhos * 0.03 * valorHora * horas);
		
		System.out.println("O salário de " + nome + " é de: " + salario + " reais");
		
		leitor.close();
	}

}

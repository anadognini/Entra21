package ListaCincoEstruturasDeSelecao;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double novoSalario;
		
		System.out.println("Informe o sal�rio: ");
		double salario = entradas.nextInt();
		
		if (salario > 1000) {
			novoSalario = salario + (0.10 * salario);
		} else {
			novoSalario = salario + (0.15 * salario);
		}
		
		System.out.println("O sal�rio �: " + novoSalario + " reais.");
		
		entradas.close();
	}

}

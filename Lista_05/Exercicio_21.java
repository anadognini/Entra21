package ListaCincoEstruturasDeSelecao;
import java.util.Scanner;

public class Salario2 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		double novoSalario;
		
		System.out.println("Informe o sal�rio: ");
		double salario = entradas.nextInt();
		
		double bonus = salario * (salario > 1000 ? 0.10 : 0.15);
		
		novoSalario = salario + bonus;
		
		System.out.println("O sal�rio �: " + novoSalario + " reais.");
		
		entradas.close();
	}

}
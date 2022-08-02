package ListaExtra;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		float salarioBruto, INSS, FGTS, totalDesc, salarioLiquido;
		float descontoIR = 0;
		
		System.out.println("Informe o valor da hora trabalhada: ");
		float valorDaHora = entradas.nextFloat();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		int horasTrabalhadas = entradas.nextInt();
		
		// Salário Bruto
		salarioBruto = valorDaHora * horasTrabalhadas;
		System.out.println("Salário bruto: R$ " + salarioBruto);
		
		// Imposto de Renda
		if (salarioBruto <= 900) {
			System.out.println("Isento de Imposto de Renda.");
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			descontoIR = salarioBruto * 0.05f;
			System.out.println("Desconto do Imposto de Renda (5%): R$ " + descontoIR);
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			descontoIR = salarioBruto * 0.10f;
			System.out.println("Desconto do Imposto de Renda (10%): R$ " + descontoIR);
		} else if (salarioBruto > 2500) {
			descontoIR = salarioBruto * 0.20f;
			System.out.println("Desconto do Imposto de Renda (20%): R$ " + descontoIR);
		}
		
		// INSS
		INSS = salarioBruto * 0.10f;
		System.out.println("Desconto do INSS (10%): R$ " + INSS);
		
		// FGTS (pago pela empresa)
		FGTS = salarioBruto * 0.11f;
		System.out.println("Desconto do FGTS (11%), depositado pela empresa: R$ " + FGTS);
		
		// Total de descontos
		totalDesc = descontoIR + INSS;
		System.out.println("Soma dos descontos: R$ " + totalDesc);
		
		// Salário líquido
		salarioLiquido = salarioBruto - totalDesc;
		System.out.println("Salário líquido: R$ " + salarioLiquido);
		
		entradas.close();
	}
}
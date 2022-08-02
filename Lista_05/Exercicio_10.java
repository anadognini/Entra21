package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int valorCompra, valorPagamento, troco, notasCem, notasDez, notasUm;
		
		System.out.println("Insira o valor da compra: ");
		valorCompra = entradas.nextInt();
		
		System.out.println("Insira o valor do pagamento: ");
		valorPagamento = entradas.nextInt();
		
		if (valorPagamento < valorCompra) {
			System.out.println("Pagamento negado");
		} else {
			troco = valorPagamento - valorCompra;
			notasCem = troco / 100;
			troco %= 100; 
			
			notasDez = troco / 10;
			troco %= 10;
			
			notasUm = troco / 1;
			troco %= 1;
			
			System.out.println("Você receberá " + notasCem + " notas de cem reais, " + notasDez + " notas de dez reais e " + notasUm + " notas de um real.");
		}
		
		entradas.close();
	}

}
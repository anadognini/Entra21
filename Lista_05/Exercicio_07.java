package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		float valor, desconto, valorComDesconto;
		char pagamento;
		
		System.out.println("Informe o valor do produto comprado: ");
		valor = entradas.nextFloat();
		
		System.out.println("Informe a forma de pagamento: D ou d para dinheiro | C ou c para cheque");
		pagamento = Character.toLowerCase(entradas.next().charAt(0));
		
		if (valor > 100 && pagamento == 'd') {
			desconto = valor * 0.1f;
			valorComDesconto = valor - desconto;
			System.out.println("Você recebeu um desconto de 10%! Sua compra foi de R$ " + valor + " para R$ " + valorComDesconto + ". Obrigada por ser um cliente fiel!");
		} else {
			System.out.println("O valor total da sua compra é: R$ " + valor + ".");
		}
		
		entradas.close();
	}
}

package ListaCincoEstruturasDeSelecao;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		char fruto;
		float precoUnitario, precoCaixa;
		
		System.out.println("Informe a fruta que deseja comprar:\nL ou l para laranja\nI ou i para limão\nM ou m para morango");
		fruto = Character.toLowerCase(entradas.next().charAt(0));
		
		System.out.println("Informe o preço unitário do fruto: ");
		precoUnitario = entradas.nextFloat();
		
		if (fruto == 'l') {
			precoCaixa = precoUnitario * 60;
			System.out.println("A fruta escolhida foi LARANJA e o preço de uma caixa é: " + precoCaixa + " R$");
		} else if (fruto == 'i') {
			precoCaixa = precoUnitario * 80;
			System.out.println("A fruta escolhida foi LIMÃO e o preço de uma caixa é: " + precoCaixa + " R$");
		} else if (fruto == 'm') {
			precoCaixa = precoUnitario * 20;
			System.out.println("A fruta escolhida foi MORANGO e o preço de uma caixa é: " + precoCaixa + " R$");
		}
		
		entradas.close();
	}
}

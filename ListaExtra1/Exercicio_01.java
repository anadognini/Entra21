package ListaExtra;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Insira o índice de poluição da empresa: ");
		float indice = entradas.nextFloat();
		
		String classificacao;
		
		if (indice >= 0 && indice <= 0.25) {
			classificacao = "Aceitável.";
			System.out.println(classificacao);
		} if (indice >= 0.3 && indice < 0.4) {
			classificacao = "Indústrias do 1º grupo, favor suspenderem as atividades!";
			System.out.println(classificacao);
		} if (indice >= 0.4 && indice < 0.5) {
			classificacao = "Indústrias do 1º e 2º grupo, favor suspenderem as atividades!";
			System.out.println(classificacao);
		} else if (indice >= 0.5){
			classificacao = "Todas as empresas devem suspender suspender as atividades!";
			System.out.println(classificacao);
		}
		
		entradas.close();
	}

}

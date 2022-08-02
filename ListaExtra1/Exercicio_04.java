package ListaExtra;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int pontos = 0;
		String classificacao;

		System.out.println("Responda as seguintes perguntas apenas com Sim ou N�o.");
		System.out.println("Telefonou para a v�tima?");
		String pergunta1 = entradas.next();
		
		if (pergunta1.equalsIgnoreCase("Sim")) {
			pontos = pontos + 1;
		} else if (pergunta1.equalsIgnoreCase("N�o")) {
			pontos = pontos + 0;
		}
		
		System.out.println("Esteve no local do crime?");
		String pergunta2 = entradas.next();
		
		if (pergunta2.equalsIgnoreCase("Sim")) {
			pontos = pontos + 1;
		} else if (pergunta2.equalsIgnoreCase("N�o")) {
			pontos = pontos + 0;
		}
		
		System.out.println("Mora perto da vitima?");
		String pergunta3 = entradas.next();
		
		if (pergunta3.equalsIgnoreCase("Sim")) {
			pontos = pontos + 1;
		} else if (pergunta3.equalsIgnoreCase("N�o")) {
			pontos = pontos + 0;
		}
		
		System.out.println("Devia para vitima?");
		String pergunta4 = entradas.next();
		
		if (pergunta4.equalsIgnoreCase("Sim")) {
			pontos = pontos + 1;
		} else if (pergunta4.equalsIgnoreCase("N�o")) {
			pontos = pontos + 0;
		}
		
		System.out.println("J� trabalhou com a vitima?");
		String pergunta5 = entradas.next();
		
		if (pergunta5.equalsIgnoreCase("Sim")) {
			pontos = pontos + 1;
		} else if (pergunta5.equalsIgnoreCase("N�o")) {
			pontos = pontos + 0;
		}
		
		System.out.println("Voc� fez " + pontos + " pontos.");
		
		if (pontos == 5) {
			classificacao = "Assassino.";
			System.out.println(classificacao);
		} else if (pontos == 3 || pontos == 4) {
			classificacao = "C�mplice.";
			System.out.println(classificacao);
		} else if (pontos == 2) {
			classificacao = "Suspeito.";
			System.out.println(classificacao);
		} else if (pontos < 2) {
			classificacao = "Inocente.";
			System.out.println(classificacao);
		}
		
		entradas.close();
	}

}
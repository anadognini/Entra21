package ListaNovaExercicio1;

import java.util.Scanner;

public class TesteLampada {
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		Lampada lampada1 = new Lampada();
		
		System.out.println("Informe a marca da lâmpada: ");
		lampada1.marca = entradas.next();
		
		System.out.println("Informe o tipo de luz: ");
		lampada1.tipoDeLuz = entradas.next();
		
		System.out.println("Informe o ambiente para o qual a lâmpada é indicado: ");
		lampada1.ambiente = entradas.next();
		
		System.out.println("Informe a potência da lâmpada:");
		lampada1.potencia = entradas.nextInt();
		
		System.out.println("Informe a cor da lâmpada: ");
		lampada1.cor = entradas.next();
		
		System.out.println("Informe a capaci"
				+ ""
				+ "dade: ");
		lampada1.capacidade = entradas.next();
		
		String ligadaOuDesligada = lampada1.verificarEstadoDaLampada(entradas);
		
		String estadoLampada = lampada1.ligarOuDesligarLampada(ligadaOuDesligada, ligadaOuDesligada, entradas);
		
		System.out.println("Marca " + lampada1.marca
				+ "\nTipo de luz " + lampada1.tipoDeLuz
				+ "\nAmbiente " + lampada1.ambiente
				+ "\nPotencia " + lampada1.potencia + " watts"
				+ "\nCor " + lampada1.cor
				+ "\nCapacidade " + lampada1.capacidade
				+ "\nEstado da lâmpada: " + estadoLampada 
				);
		
		entradas.close();
	}

}

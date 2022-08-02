package ListaNovePOO;

import java.util.Scanner;

public class TesteLampada {
	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		Lampada lampada1 = new Lampada ();
		
		System.out.println("Informe a marca da lâmpada: ");
		String marca = entradas.next();
		lampada1.setMarca(marca);
		
		System.out.println("Informe o tipo de luz: ");
		String tipoDeLuz = entradas.next();
		lampada1.setTipoDeLuz(tipoDeLuz);
		
		System.out.println("Informe o tipo de ambiente para o qual a lâmpada é recomendado: ");
		String ambiente = entradas.next();
		lampada1.setAmbiente(ambiente);
		
		System.out.println("Informe a potência da lâmpada, em Watt: ");
		int potencia = entradas.nextInt();
		lampada1.setPotencia(potencia);
		
		System.out.println("Informe a cor da lâmpada: ");
		String cor = entradas.next();
		lampada1.setCor(cor);
		
		System.out.println("Informe a capacidade da lâmpada: ");
		String capacidade = entradas.next();
		lampada1.setCapacidade(capacidade);
		
		String ligadaOuDesligada = lampada1.verificarEstadoDaLampada(entradas);
		
		String estadoLampada = lampada1.ligarOuDesligarLampada(ligadaOuDesligada, ligadaOuDesligada, entradas);
		
		System.out.println("Marca: " + lampada1.getMarca()
				+ "\nTipo de luz: " + lampada1.getTipoDeLuz()
				+ "\nAmbiente: " + lampada1.getAmbiente()
				+ "\nPotencia: " + lampada1.getPotencia()
				+ "\nCor: " + lampada1.getCor()
				+ "\nCapacidade: " + lampada1.getCapacidade()
				+ "\nEstado da lâmpada: " + estadoLampada 
				);
		
		entradas.close();
	}
}

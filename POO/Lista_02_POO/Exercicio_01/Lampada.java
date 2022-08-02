package ListaNovaExercicio1;

import java.util.Scanner;

public class Lampada {
	String marca;
	String tipoDeLuz;
	String ambiente;
	int potencia;
	String cor;
	String capacidade;
	
	String verificarEstadoDaLampada(Scanner entradas) {
		System.out.println("A lâmpada está ligada ou desligada? Digite apenas <Ligada> ou <Desligada>");
		String ligadaOuDesligada = entradas.next();
		
		return ligadaOuDesligada;
	}
	
	String ligarOuDesligarLampada(String ligadaOuDesligada, String ligandoLampada, Scanner entradas) {
		System.out.println("Deseja ligar ou desligar a lâmpada?");
		ligandoLampada = entradas.next();
		
		String estadoLampada = "";
		
		if (ligandoLampada.equals("Ligar") && ligadaOuDesligada.equals("Desligada")) {
			estadoLampada = "A lâmpada foi ligada.";
	} else if (ligandoLampada.equals("Ligar") && ligadaOuDesligada.equals("Ligada")) {
		estadoLampada = "A lâmpada está ligada.";
	} else if (ligandoLampada.equals("Desligar") && ligadaOuDesligada.equals("Ligada")) {
			estadoLampada = "A lâmpada foi desligada.";
	} else if (ligandoLampada.equals("Desligar") && ligadaOuDesligada.equals("Desligada")) {
		estadoLampada = "A lâmpada está desligada.";
	} else {
		estadoLampada = "Comando inválido.";
	}
		
		return estadoLampada;
	}
	
	
	
	
}

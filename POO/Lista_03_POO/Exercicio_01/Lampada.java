package ListaNovePOO;

import java.util.Scanner;

public class Lampada {
	private String marca;
	private String tipoDeLuz;
	private String ambiente;
	private int potencia;
	private String cor;
	private String capacidade;
	
	// Construtor vazio (Boa pr�tica)
	
	Lampada() {}
	
	// Construtor para acessar os atributos
	
	Lampada(String marca, String tipoDeLuz, String ambiente, int potencia, String cor, String capacidade) {
		super();
		this.marca = marca;
		this.tipoDeLuz = tipoDeLuz;
		this.ambiente = ambiente;
		this.potencia = potencia;
		this.cor = cor;
		this.capacidade = capacidade;
	}

	// Getters e setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipoDeLuz() {
		return tipoDeLuz;
	}	

	public void setTipoDeLuz(String tipoDeLuz) {
		this.tipoDeLuz = tipoDeLuz;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	
	// M�todos
	
	String verificarEstadoDaLampada(Scanner entradas) {
		System.out.println("A l�mpada est� ligada ou desligada? Digite apenas <Ligada> ou <Desligada>");
		String ligadaOuDesligada = entradas.next();
		
		return ligadaOuDesligada;
	}
	
	String ligarOuDesligarLampada(String ligadaOuDesligada, String ligandoLampada, Scanner entradas) {
		System.out.println("Deseja ligar ou desligar a l�mpada?");
		ligandoLampada = entradas.next();
		
		String estadoLampada = "";
		
		if (ligandoLampada.equals("Ligar") && ligadaOuDesligada.equals("Desligada")) {
			estadoLampada = "A l�mpada foi ligada.";
		} else if (ligandoLampada.equals("Ligar") && ligadaOuDesligada.equals("Ligada")) {
			estadoLampada = "A l�mpada est� ligada.";
		} else if (ligandoLampada.equals("Desligar") && ligadaOuDesligada.equals("Ligada")) {
			estadoLampada = "A l�mpada foi desligada.";
		} else if (ligandoLampada.equals("Desligar") && ligadaOuDesligada.equals("Desligada")) {
			estadoLampada = "A l�mpada est� desligada.";
		} else {
			estadoLampada = "Comando inv�lido.";
		}
		
		return estadoLampada;
	}
}

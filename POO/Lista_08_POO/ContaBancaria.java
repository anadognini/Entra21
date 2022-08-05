package ContaBancaria;

public class ContaBancaria {
	// Atributos
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	// Construtores
	public ContaBancaria() {}
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	// Getters e setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Métodos
	public void sacar() {}
	
	public double depositar(double valor) {
		this.saldo = this.saldo + valor;

		return saldo;
	}
}
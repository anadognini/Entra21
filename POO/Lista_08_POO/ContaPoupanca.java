package ContaBancaria;

public class ContaPoupanca extends ContaBancaria implements Comparable<ContaPoupanca> {
	// Atributos
	private String diaRendimento;
	private String situacaoDaConta;

	// Construtores
	public ContaPoupanca() {}

	// Getters e setters
	public ContaPoupanca(String diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public String getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(String diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public String getSituacaoDaConta() {
		return situacaoDaConta;
	}

	public void setSituacaoDaConta(String situacaoDaConta) {
		this.situacaoDaConta = situacaoDaConta;
	}

	// Método compareTo para ordenar pelos números das contas

	// @Override
	// public int compareTo(ContaPoupanca outraConta) {
	// 	if (super.getNumConta() < outraConta.getNumConta()) {
	// 		return -1;
	// 	} else if (super.getNumConta() > outraConta.getNumConta()) {
	// 		return 1;
	// 	}

	// 	return 0;
	// }

	// @Override
	// public int compareTo(ContaPoupanca outraConta) {
	// 	return this.getNomeCliente().compareTo(outraConta.getNomeCliente());
	// }

	@Override
	public int compareTo(ContaPoupanca outraConta) {
		if (super.getSaldo() < outraConta.getSaldo()) {
			return -1;
		} else if (super.getSaldo() > outraConta.getSaldo()) {
			return 1;
		}

		return 0;
	}
}
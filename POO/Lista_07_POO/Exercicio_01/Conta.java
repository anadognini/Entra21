public class Conta {
    // Atributos
    private String nomeCliente;
    private String numConta;
    private double saldo;
    private double limite;

    // Getters e setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Método toString
    @Override
    public String toString() {
        return "Nome do cliente: " + nomeCliente
                + "\nNúmero da conta: " + numConta
                + "\nSaldo: " + saldo + " reais";
    }

    // Métodos
    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) throws ContaExcecao {
        if (saldo >= valor) {
            if ((saldo - valor) >= 0) {
                saldo -= valor;

                return true;
            }
        } else {
            throw new ContaExcecao();
        }

        return false;
    }
}

public class Teste {
    public static void main(String[] args) throws Exception {
        // Testando a classe ContaBancaria
        System.out.println("Teste da Conta Bancária:");

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setNomeCliente("João da Silva");
        contaBancaria.setNumConta("300-0");

        contaBancaria.depositar(100);

        realizarSaque(contaBancaria, 50);
        realizarSaque(contaBancaria, 70);

        System.out.println(contaBancaria);

        // Testando a classe ContaPoupanca
        System.out.println("\nTeste da Conta Poupança:");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Fulano de Tal");
        contaPoupanca.setNumConta("556-0");
        contaPoupanca.setDiaRendimento(19);

        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado. Novo saldo é de: " + contaPoupanca.getSaldo() + " reais.");
        } else {
            System.out.println("Hoje não é dia de rendimento. Novo saldo não calculado.");
        }

        System.out.println(contaPoupanca);

        // Testando a classe ContaEspecial
        System.out.println("\nTeste da Conta Especial:");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Maria de Souza");
        contaEspecial.setNumConta("220-0");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    // Método estático criado para poder realizar saque dentro da classe main
    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso. O novo saldo é: " + conta.getSaldo() + " reais.");
        } else {
            System.out.println(
                    "Saldo insuficiente para saque de " + valor + " reais.\nSaldo de: " + conta.getSaldo() + " reais.");
        }
    }
}

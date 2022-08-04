import java.util.Scanner;

public class TesteConta {
  public static void main(String[] args) throws ContaExcecao {
    Scanner entradas = new Scanner(System.in);

    Conta minhaConta = new Conta();

    // Adiciona 100
    minhaConta.depositar(100);

    // Adiciona limite de 100
    minhaConta.setLimite(100);

    System.out.println("Seu saldo é: " + minhaConta.getSaldo() + "\nInforme o valor que você deseja sacar: ");
    double valorSacado = entradas.nextDouble();

    try {
      minhaConta.sacar(valorSacado);
    } catch (ContaExcecao e) {
      System.out
          .println("Houve um erro! O saldo é inferior ao valor sacado! Informe novamente o valor a ser sacado: ");
      valorSacado = entradas.nextDouble();

      minhaConta.sacar(valorSacado);
    }

    entradas.close();
  }
}

public class TesteConta {
  public static void main(String[] args) throws ContaExcecao {

    Conta minhaConta = new Conta();

    minhaConta.depositar(100);
    minhaConta.setLimite(100);
    minhaConta.sacar(1000);
  }
}

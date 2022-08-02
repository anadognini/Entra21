public class ContaExcecao extends Exception {

  @Override
  public String getMessage() {
    return "Houve um erro! O saldo é inferior ao valor sacado!";
  }
}

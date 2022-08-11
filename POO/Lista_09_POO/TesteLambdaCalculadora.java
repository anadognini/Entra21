import java.util.Scanner;

public class TesteLambdaCalculadora {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);

		do {
			double numero1;
			double numero2;
			int opcao;
			boolean flag;

			System.out.println("Digite o primeiro número: ");
			numero1 = entradas.nextDouble();

			System.out.println("Digite o segundo número: ");
			numero2 = entradas.nextDouble();

			System.out.println("Escolha a opção: \n1 - " + OpcoesMenu.SOMAR
					+ "\n2 - " + OpcoesMenu.SUBTRAIR
					+ "\n3 - " + OpcoesMenu.MULTIPLICAR
					+ "\n4 - " + OpcoesMenu.DIVIDIR
					+ "\n0 - " + OpcoesMenu.SAIR);

			opcao = entradas.nextInt();
			flag = FazerOperacao(opcao, numero1, numero2);

			if (flag == false) {
				break;
			}

		} while (true);
		
		entradas.close();
	}

	public static boolean FazerOperacao(int opcao, double numero1, double numero2) {
		boolean t = true;

		switch (opcao) {
			case 1:
				double soma = Calculadora.calcular(numero1, numero2, (x, y) -> x + y);
				System.out.println(soma);
				break;

			case 2:
				double subtrair = Calculadora.calcular(numero1, numero2, (x, y) -> x - y);
				System.out.println(subtrair);
				break;

			case 3:
				double multiplicar = Calculadora.calcular(numero1, numero2, (x, y) -> x * y);
				System.out.println(multiplicar);
				break;

			case 4:
				double dividir = Calculadora.calcular(numero1, numero2, (x, y) -> x / y);
				System.out.println(dividir);
				break;

			case 0:
				t = false;
				
			default:
				System.out.println("A opção digitada não é válida. Digite novamente a opção que deseja.");
		}

		return t;
	}
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteException2 {
    public static void main(String[] args) {

        do {
            try {
                Scanner entradas = new Scanner(System.in);

                System.out.println("Eu sei dividir.");

                System.out.println("Informe o primeiro valor: ");
                int x = entradas.nextInt();

                System.out.println("Informe o segundo valor: ");
                int y = entradas.nextInt();

                double r = (x / y);

                System.out.println("Resultado da divisão: " + r);

            } catch (ArithmeticException e) {
                System.out.println("A divisão não pode ser por 0. Insira novamente os valores.");
            } catch (InputMismatchException e) {
                System.out.println("As variáveis devem ser números inteiros. Insira novamente os valores.");
            }

        } while (true);
    }
}

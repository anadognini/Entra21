import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner (System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Informe dois números inteiros: ");
        int numero1 = entradas.nextInt();
        int numero2 = entradas.nextInt();

        System.out.println(calculadora.somarNumeros(numero1, numero2));
        System.out.println(calculadora.subtrairNumeros(numero1, numero2));
        System.out.println(calculadora.dividirNumeros(numero1, numero2));

        System.out.println("Informe um número para elevar o primeiro número: ");
        int potencia = entradas.nextInt();

        System.out.println(calculadora.elevarNumeros(numero1, potencia));

        entradas.close();
    }
}

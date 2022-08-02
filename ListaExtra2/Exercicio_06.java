package ListaExtra2;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = -1;
		
		while (x <= 0 || x >= 100) {
			System.out.print("Digite um nœmero maior que zero e menor que 100: ");
			x = in.nextInt();
			}
		
		if (x % 2 == 0) {
			x = x + 1;
			}
		
		while (x < 100) {
			System.out.print( x + ", ");
			x = x + 2;
		}

		in.close();
	}
}

/* Peça para o usuário informar um número inteiro entre 0 e 100 e, a partir disso, calcule e imprima todos os números ímpares a partir
 * do número informado até 100. */

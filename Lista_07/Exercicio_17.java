package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		String clientes[] = new String[5];
		int dvds[] = new int[5];
		
		for (int i = 0; i < clientes.length; i++) {
			System.out.println("Informe o primeiro nome do cliente " + (i + 1) + ": ");
			clientes[i] = entradas.next();
			
			System.out.println("Informe a quantidade de DVDs que ele alugou em 2022: ");
			dvds[i] = entradas.nextInt();
		}
		
		
			for (int i = 0; i < dvds.length; i++) {
				if (dvds[i] >= 10) {
					System.out.println("O cliente " + clientes[i] + " tem direito a " + (dvds[i] / 10) + " DVDs de graça.");
				}
			}
				
		
		entradas.close();
	}
}

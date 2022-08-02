package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int vetorA[] = new int[10];
		boolean todosPares = true;
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o elemento " + i);
			vetorA[i] = entradas.nextInt();
		}
		
		for (int i = 0; ((i < vetorA.length) && (todosPares == true)); i++) {
	        if ((vetorA[i] % 2) != 0)
	           todosPares = false; 
	        
	        if (todosPares == true) {
				 System.out.printf("\nTodos os elementos do vetor sao pares.\n");
			 } else {
		    	  System.out.printf("\nNem todos os elementos do vetor sao pares.\n");
		      }
		    }
		
		
		entradas.close();
	}
}

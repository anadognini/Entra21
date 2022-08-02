package ListaSeteVetores;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int palindromos[] = new int[10];
		boolean isPalindromo = true;
		int j = palindromos.length - 1;
		
		for (int i = 0; i < palindromos.length; i++) {
			System.out.println("Informe o elemento " + i);
			palindromos[i] = entradas.nextInt();
		}
		
		for (int i = 0; i < palindromos.length; i++) {
			while ((i < j) && (isPalindromo == true)) {
		        if (palindromos[i] != palindromos[j]) {
		        	isPalindromo = false; 
		        } else {
		          j--;
		          i++;
		        }
		      }	
		}
		
		if (isPalindromo == true) {
			System.out.println("\nO vetor forma um palíndromo.");
		} else if (isPalindromo == false) {
			System.out.println("\nO vetor não forma um palíndromo.");
		}
		
		entradas.close();
	}
}
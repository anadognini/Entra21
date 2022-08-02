package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Informe a população do país A: ");
		int populacaoA = entradas.nextInt();
		
		System.out.println("Informe a população do país B: ");
		int populacaoB = entradas.nextInt();
		
		System.out.println("Informe a taxa de crescimento do país A: ");
		float taxaCrescimentoA = entradas.nextFloat();
		
		System.out.println("Informe a taxa de crescimento do país B: ");
		float taxaCrescimentoB = entradas.nextFloat();
		
		int anos = 0;
		
		
		if (populacaoA > populacaoB && populacaoA != populacaoB) {
			while (populacaoA > populacaoB || populacaoA == populacaoB) {
				System.out.println("Informações inválidas! Informe-as novamente: ");
				
				System.out.println("População do país A: ");
				populacaoA = entradas.nextInt();
				
				System.out.println("População do país B: ");
				populacaoB = entradas.nextInt();
				
				System.out.println("Taxa de crescimento do país B: ");
				taxaCrescimentoB = entradas.nextFloat();	
				
				System.out.println("Taxa de crescimento do país A: ");
				taxaCrescimentoA = entradas.nextFloat();
			}
		} else {
			while (populacaoA < populacaoB && populacaoA != populacaoB) {
				populacaoA += (populacaoA * taxaCrescimentoA);
				populacaoB += (populacaoB * taxaCrescimentoB);
				
				anos++;
			}	
			System.out.println("Serão necessários " + anos + " anos.\nPopulação A: " + populacaoA + "\nPopulação B: " + populacaoB);
		}
	
		entradas.close();
	}

}

package ListaSeisEstruturasDeRepeticao;

public class Exercicio_17 {

	public static void main(String[] args) {
		
		float populacaoA = 80000;
		float populacaoB = 200000;
		float taxaA = 0.03f;
		float taxaB = 0.015f;
		int anos = 0;
		
		while (populacaoA < populacaoB && populacaoA != populacaoB) {
			populacaoA += (populacaoA * taxaA);
			populacaoB += (populacaoB * taxaB);
			
			anos++;
		}
	
		System.out.println("Serão necessários " + anos + " anos.\nPopulação A: " + populacaoA + "\nPopulação B: " + populacaoB);
	}

}

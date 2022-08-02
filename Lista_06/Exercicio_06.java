package ListaSeisEstruturasDeRepeticao;

public class Exercicio_06 {

	public static void main(String[] args) {
		float alturaChico = 150f;
		float alturaJuca = 110f;
		int anos = 0;
		
		while (alturaJuca <= alturaChico) {
			alturaChico += 2;
			alturaJuca += 3;
			
			anos++;
		}
	
		System.out.println("Serão necessários " + anos + " anos para Juca ser maior que Chico");

	}

}

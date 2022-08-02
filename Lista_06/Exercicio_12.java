package ListaSeisEstruturasDeRepeticao;

public class Exercicio_12 {

	public static void main(String[] args) {
		long contadorGraos = 1;
		
		for (int i = 1; i <= 1; i++) {
			System.out.println(i + "ª casa - " + contadorGraos + " grão");
			for (int j = 2; j <= 64; j++) {
				contadorGraos *= 2;
				System.out.println(j + "ª casa - " + contadorGraos + " grãos");
			}
		}
		
		System.out.println("O total de grãos a pagar é: " + contadorGraos);
	}

}

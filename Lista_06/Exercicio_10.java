package ListaSeisEstruturasDeRepeticao;

public class Exercicio_10 {

	public static void main(String[] args) {
		int numero = 1000;
		int contador = 0;
		
		while (contador < 5) {
			if (numero % 11 == 5) {
				contador++;
				
				if (contador == 5) {
					System.out.println("O quinto número maior que 1000, cuja divisão por 11 tenha como resto 5, é: " + numero);
				}
			}
			
			numero++;
		}
		
	

	}
}

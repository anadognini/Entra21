package ListaTresAtribuicaoOperadores;

public class Exercicio_13 {

	public static void main(String[] args) {
		int A, B, C;
		
		A = 10;
		B = 20;
		
		System.out.println("A: " + A + " B: " + B);
		
		C = B;
		B = A;
		A = C;
		
		System.out.println("A: " + A + " B: " + B);
	}

}

import java.awt.List;
import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		// Exemplo 1
		Par<String, Double> par1 = new Par<>("José", 10.9);
		System.out.println("Aluno e nota: " + par1);

		// Exemplo 2
		Par<Integer, String> par2 = new Par<>(196978, "Silva");
		System.out.println("Código e nome do funcionário: " + par2);
		
		// Exemplo 3
		Par<Float, Float> par3 = new Par<>(5.5f, 7.8f);
		System.out.println("Coordenadas x e y: " + par3);
		
		// Exemplo 4
		ArrayList alunos = new ArrayList();
		alunos.add("Ana");
		alunos.add("Eduardo");
		alunos.add("Sérgio");
		
		Par<Boolean, List> par4 = new Par<>(true, alunos);
		System.out.println("Lista de alunos: " + alunos);
	}

}

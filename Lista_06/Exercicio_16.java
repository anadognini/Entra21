package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		String nome = entradas.next();
		
		System.out.println("Validar as informações do usuário.\nInforme a sua idade: ");
		int idade = entradas.nextInt();
		
		Boolean validarIdade = false;
		
		while (!validarIdade) {
			if (idade < 0 || idade > 100) {
				System.out.println("Idade inválida");
				
				System.out.println("Digite novamente a sua idade: ");
				idade = entradas.nextInt();
			} else {
				validarIdade = true;
			}
		}
		
		System.out.println("Informe o seu salário: ");
		float salario = entradas.nextInt();
		
		Boolean validarSalario = false;
		
		while (!validarSalario) {
			if (salario < 0) {
				System.out.println("Salário inválido");
				
				System.out.println("Digite novamente o seu salário: ");
				salario = entradas.nextFloat();
			} else {
				validarSalario = true;
			}
		}
		
		System.out.println("Informe o seu gênero (m para masculino ou f para feminino): ");
		char genero = Character.toLowerCase(entradas.next().charAt(0));

		Boolean validarGenero = false;
		
		while (!validarGenero) {
			if (genero != 'm' && genero != 'f') {
				System.out.println("Gênero inválido");
				
				System.out.println("Digite novamente o seu gênero: ");
				genero = Character.toLowerCase(entradas.next().charAt(0));
			} else {
				validarGenero = true;
			}
		}
		
		System.out.println("Informe o seu estado civil (s para solteiro | c para casado | v para viúvo | d para divorciado: ");
		char estadoCivil = Character.toLowerCase(entradas.next().charAt(0));
		
		Boolean validarEstadoCivil = false;
		
		while (!validarEstadoCivil) {
			if (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
				System.out.println("Estado civil inválido");
				
				System.out.println("Digite novamente a sua idade: ");
				idade = entradas.nextInt();
			} else {
				validarEstadoCivil = true;
			}
		}

		System.out.println("Informações cadastradas com sucesso, " + nome + "!");
		
		entradas.close();
	}

}

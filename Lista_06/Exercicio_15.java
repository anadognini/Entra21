package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Determinar a senha e o código de um usuário.\nInforme a sua senha: ");
		int senha = entradas.nextInt();
		
		System.out.println("Informe o seu código: ");
		int codigo = entradas.nextInt();
		
		while (senha == codigo) {
			System.out.println("Ocorreu um erro. A senha e o código devem ser diferentes! Digite novamente suas informações: ");
			
			System.out.println("Senha: ");
			senha = entradas.nextInt();
			
			System.out.println("Código: ");
			codigo = entradas.nextInt();
		}
		
		System.out.println("Cadastro finalizado com sucesso.");
		
		entradas.close();
	}

}
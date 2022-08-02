package ListaSeisEstruturasDeRepeticao;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		System.out.println("Determinar a senha e o c�digo de um usu�rio.\nInforme a sua senha: ");
		int senha = entradas.nextInt();
		
		System.out.println("Informe o seu c�digo: ");
		int codigo = entradas.nextInt();
		
		while (senha == codigo) {
			System.out.println("Ocorreu um erro. A senha e o c�digo devem ser diferentes! Digite novamente suas informa��es: ");
			
			System.out.println("Senha: ");
			senha = entradas.nextInt();
			
			System.out.println("C�digo: ");
			codigo = entradas.nextInt();
		}
		
		System.out.println("Cadastro finalizado com sucesso.");
		
		entradas.close();
	}

}
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		do { 
			int opcao;
			boolean flag;
			
			System.out.println("Escolha a op��o: \n1 - " + Menu.CADASTRAR_PROJETO
					+ "\n2 - " + Menu.INSERIR_PROF
					+ "\n3 - " + Menu.INSERIR_ALUNOS
					+ "\n4 - " + Menu.BUSCAR_POR_CODIGO
					+ "\n0 - " + Menu.SAIR);
			
			opcao = entradas.nextInt();
			flag = criarMenu(opcao, entradas);
			
			if (flag == false) {
				break;
			}
			
		} while (true);
		
//		entradas.close();

	}

	public static boolean criarMenu(int opcao, Scanner entradas) {
		boolean t = true;

		switch (opcao) {
			case 1:
				ProjetoPesquisa projeto1 = new ProjetoPesquisa (entradas);
				break;

			case 2:
				System.out.println("Oi");
				break;

			case 3:
				System.out.println("Oi");
				break;

			case 4:
				System.out.println("Oi");
				break;

			case 0:
				t = false;
				
			default:
				if (opcao != 0) {					
					System.out.println("A op��o digitada n�o � v�lida. Digite novamente a op��o que deseja.");
				}
		}

		return t;
	}
	
}

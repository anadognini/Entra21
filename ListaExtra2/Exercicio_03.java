package ListaExtra2;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner entradas = new Scanner(System.in);
		
		int capacidadeMax = 100;
		int idade = 0;
		int opiniao = 0;
		
		int qtdadeOtimos = 0;
		int qtdadeBom = 0;
		int qtdadeRegular = 0;
		int qtdadeBomRegular = 0;
		int qtdadeRuim = 0;
		int qtdadePessimo = 0;
		
		int maiorIdadePessimo = 0;
		int maiorIdadeOtimo = 0;
		int maiorIdadeRuim = 0;
		
		float percentBomRegular = 0;
		float mediaIdadeRuim = 0;
		float percentPessimo = 0;
		int difMaiorIdadeOtimoRuim = 0;
		
			for(int i = 1; i <=capacidadeMax; i++ ) {
				
				System.out.println ("Informe sua idade: ");
				idade = entradas.nextInt();
				
				while (idade <= 0 ) {
	            	System.out.println ("Idade inválida. Informe novamente sua idade (deve ser maior que 0): ");
	            	idade = entradas.nextInt();
	            }
				
				System.out.println("Selecione sua opinião!"
						+ "\n5 - ***** Ótimo!"
						+ "\n4 - **** Bom!"
						+ "\n3 - *** Regular!"
						+ "\n2 - ** Ruim!"
						+ "\n1 - * Péssimo!");
	            opiniao = entradas.nextInt();
	            
	            while (opiniao < 1 || opiniao > 5) {
	            	System.out.println("Informe uma opinião válida (apenas maiores que 1 e menores que 5)!"
							+ "\n5 - ***** Ótimo!"
							+ "\n4 - **** Bom!"
							+ "\n3 - *** Regular!"
							+ "\n2 - ** Ruim!"
							+ "\n1 - * Péssimo!");
	            	opiniao = entradas.nextInt();
	            }
	            
	            switch (opiniao) {
		            case 5:
		            	qtdadeOtimos++;
		            	if(idade > maiorIdadeOtimo) {
		            		maiorIdadeOtimo = idade;
		            	}	
		            	
		            	break;
		            case 4:
		            	qtdadeBom++;
		            	qtdadeBomRegular++;
		            	
		            	break;
		            case 3:
		            	qtdadeRegular++;
		            	qtdadeBomRegular++;
		            	
		            	break;
		            case 2:
		            	qtdadeRuim++;
		            	mediaIdadeRuim += idade;
		            	
		            	if(idade > maiorIdadeRuim) {
		            		maiorIdadeRuim = idade;
		            	}	
		            	
		            	break;
		            case 1:
		            	qtdadePessimo++;
		            	
		            	if(idade > maiorIdadePessimo) {
		            		maiorIdadePessimo = idade;
		            	}	
		            	
		            	break;
	            }
			}
			
			 percentBomRegular = qtdadeBomRegular / (qtdadeBom - qtdadeRegular);
			 mediaIdadeRuim /= qtdadeRuim;
			 percentPessimo =  (qtdadePessimo * 100) / capacidadeMax;
			 difMaiorIdadeOtimoRuim = maiorIdadeOtimo - maiorIdadeRuim; 
			 
			 System.out.println ("A quantidade de respostas ótimo" + qtdadeOtimos
					 + "\nA diferença percentual entre respostas bom e regular" + percentBomRegular
					 + "\nA média de idade das pessoas que responderam ruim" + mediaIdadeRuim
					 + "\nA porcentagem de respostas péssimo e a maior idade que utilizou esta opção" + percentPessimo + maiorIdadePessimo 
					 + "\nA diferença de idade entre a maior idade que respondeu ótimo e a maior idade que respondeu ruim" + difMaiorIdadeOtimoRuim);

	         entradas.close();
	}

}

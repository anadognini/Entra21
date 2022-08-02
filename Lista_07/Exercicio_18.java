package ListaSeteVetores;

public class Exercicio_18 {

	public static void main(String[] args) {
		int vetorX[] = new int[10];
		
		int numero = 100;
		int qtdade = 0;
		int cont = 0;
		
	    while (qtdade < 10) {
	    	numero++;
	    	cont = 0;
	    	
	    	for (int i = 1; i <= numero; i++) {
	    		if (numero % i == 0) {
	    			cont++;
	    		}
	    		
	    		if (cont == 3) {
	    			continue;
	    		}
	    	}
	    	
	    	if (cont == 2) {
	    		vetorX[qtdade] = numero;
	    		qtdade++;
	    	}
	    	
	    } 
	    
	    for (int i = 0; i < vetorX.length; i++) {
	    	System.out.println(vetorX[i] + " ");
	    }
	    
	  
	}
}

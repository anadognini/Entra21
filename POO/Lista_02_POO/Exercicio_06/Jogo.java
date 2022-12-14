package ListaNovePOO;

import java.util.Scanner;

public class Jogo {
	char[][] tabuleiro = new char[3][3];
	
	int linha = 0;
	int coluna = 0;
	boolean ganhou = false;
	char sinal;
	int jogada = 1;
	
	public void iniciarJogo() {
		System.out.println("Come?ou o Jogo!! ");
		System.out.println("Player 1: X ");
		System.out.println("Player 2: O ");
	}
	
	public void iniciarJogada() {
		if (jogada % 2 == 1) {
			System.out.println("\nPlayer 1: Sua vez de jogar ");
			sinal = 'X';
		} else {
			System.out.println("\nPlayer 2: Sua vez de jogar ");
			sinal = 'O';
		}
	}
	
	public void verificarLinha(Scanner in) {
		boolean linhavalida = false;
		
		while (!linhavalida) {
			System.out.println("Informe a linha | 1 | ");
			System.out.println("Informe a linha | 2 | ");
			System.out.println("Informe a linha | 3 | ");
			
			linha = in.nextInt();
			
			if (linha >= 1 && linha <= 3) {
				linhavalida = true;
			} else {
				System.out.println("Informa??o inv?lida, informar uma op??o v?lida!!");
			}
		}
	}
		
	public void verificarColuna(Scanner in) {
		boolean colunavalida = false;
		
		while (!colunavalida) {
			System.out.println("Informe a coluna | 1 | 2 | 3 | ");
			coluna = in.nextInt();
			if (coluna >= 1 && coluna <= 3) {
				colunavalida = true;
			} else {
				System.out.println("Informa??o inv?lida, informar uma op??o v?lida!!");
				
			}
		}
	}
	
	public void instanciarTabuleiro(Scanner in) {
		verificarLinha(in);
		verificarColuna(in);
		
		linha--;
		coluna--;
	}
	
	public void imprimirTabuleiro() {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");
			}
			System.out.println();
		}
	}
	
	public void verificarJogada() {
		if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
			System.out.println("\nPosi??o j? informada, por gentileza escolha outra posi?ao!!");
		} else {
			tabuleiro[linha][coluna] = sinal;
			jogada++;
		}
	}
	
	public void imprimirJogada() {
		if ((tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') || // ln 1
				(tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') || // ln 2
				(tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') || // ln 3
				(tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') || // cl 1
				(tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') || // cl 2
				(tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') || // cl 3
				(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') || // diagonal
				(tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X')) { // diagonal
			ganhou = true;
			System.out.println("Parab?ns Player 1 ganhou");
			
		} else if ((tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') || // ln 1
				(tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') || // ln 2
				(tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') || // ln 3
				(tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') || // cl 1
				(tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') || // cl 2
				(tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') || // cl 3
				(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') || // diagonal
				(tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O')) { // diagonal
			ganhou = true;
			System.out.println("Parab?ns Player 2 ganhou");
			
		} else if (jogada > 9) {
			ganhou = true;
			System.out.println("Houve Empate!");
		}
	}

}

package ListaNovePOO;

import java.util.Scanner;

public class JogoDaVelha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Jogo jogo = new Jogo();

		jogo.iniciarJogo();
		jogo.ganhou = false;

		while (!jogo.ganhou) {

			jogo.iniciarJogada();
			jogo.instanciarTabuleiro(in);
			jogo.verificarJogada();
			jogo.imprimirTabuleiro();
			jogo.iniciarJogada();
		}
    
		in.close();
	}
}
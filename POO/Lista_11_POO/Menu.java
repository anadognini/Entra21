public enum Menu {
	CADASTRAR_PROJETO (1), INSERIR_PROF (2), INSERIR_ALUNOS (3), BUSCAR_POR_CODIGO (4), SAIR (5);
	
	private final int opcao;
	
	Menu(int valorOpcao) {
		opcao = valorOpcao;
	}
	
	public int getValor() {
		return opcao;
	}
}
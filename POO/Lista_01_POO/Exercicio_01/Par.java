public class Par <T, U> {
	// Atributos
	private T atributoGenerico1;
	private U atributoGenerico2;
	
	// Construtores
	public Par() {}
	
	public Par(T atributoGenerico1, U atributoGenerico2) {
		this.atributoGenerico1 = atributoGenerico1;
		this.atributoGenerico2 = atributoGenerico2;
	}

	// Getters e setters
	public T getAtributoGenerico1() {
		return atributoGenerico1;
	}

	public void setAtributoGenerico1(T atributoGenerico1) {
		this.atributoGenerico1 = atributoGenerico1;
	}

	public U getAtributoGenerico2() {
		return atributoGenerico2;
	}

	public void setAtributoGenerico2(U atributoGenerico2) {
		this.atributoGenerico2 = atributoGenerico2;
	}

	// ToString
	@Override
	public String toString() {
		return atributoGenerico1 + " e " + atributoGenerico2;
	}
}

public class Professor extends Funcionario implements Pesquisador {
	// Atributos
	private String titulacao;
	private String areaDePesquisa;
	private String[] nomesProfessores;
	

	// Construtor
	public Professor() {
		nomesProfessores = new String[3];
		
		nomesProfessores[0] = "Fernando";
		nomesProfessores[1] =  "Carlos";
		nomesProfessores[2] = "Andrea";
	}
	
	public String[] getNomesProfessores() {
		return nomesProfessores;
	}
	
	public void setNomesProfessores(String[] nomesProfessores) {
		this.nomesProfessores = nomesProfessores;
	}
	
	// Getters e setters
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public String getAreaDePesquisa() {
		return areaDePesquisa;
	}
	
	public void setAreaDePesquisa(String areaDePesquisa) {
		this.areaDePesquisa = areaDePesquisa;
	}
	
	// Métodos implementados
	@Override
	public float calcSalario(float vHora) {
		return 0;
	}
	
	@Override
	public String getTipo() {
		return "Aluno";
	}
}

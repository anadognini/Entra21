import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjetoPesquisa {
	// Atributos
	private String codigo;
	private String titulo;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private String profResponsavel;
	private List<Pesquisador> equipe = new ArrayList<Pesquisador>();
	
	// Construtor
	
	
	// Getters e setters
	public String getCodigo() {
		return codigo;
	}
	
	public ProjetoPesquisa(Scanner entradas) {
		// Setando o c�digo
		System.out.println("Informe o c�digo do projeto: ");
		String codigo = entradas.next();
		
		setCodigo(codigo);
		
		// Setando o t�tulo
		System.out.println("Informe o t�tulo do projeto: ");
		String titulo = entradas.next();
		
		setTitulo(titulo);
		
		// Setando a data de in�cio
		System.out.println("Informe o dia, m�s e ano de in�cio do projeto, nessa ordem."
				+ "\nDia:");
		int diaInicio = entradas.nextInt();
		System.out.println("M�s: ");
		int mesInicio = entradas.nextInt();
		System.out.println("Ano: ");
		int anoInicio = entradas.nextInt();
		
		LocalDate dataInicio = LocalDate.of(anoInicio, mesInicio, diaInicio);
		
		setDataInicio(dataInicio);
		
		// Setando a data de fim
		System.out.println("Informe o dia, m�s e ano de t�rmino do projeto, nessa ordem:");
		int diaFim = entradas.nextInt();
		System.out.println("M�s: ");
		int mesFim = entradas.nextInt();
		System.out.println("Ano: ");
		int anoFim = entradas.nextInt();
		
		LocalDate dataFim = LocalDate.of(anoFim, mesFim, diaFim);
		
		setDataFim(dataFim);
		
		// Setando o professor respons�vel
		System.out.println("Informe o nome do professor respons�vel (� importante que seja um dos professores da lista): ");
		Professor opcaoProfessor = new Professor();
		
		String[] nomesProfessores = opcaoProfessor.getNomesProfessores();
		
		nomesProfessores[0] = "Fernando";
		nomesProfessores[1] =  "Carlos";
		nomesProfessores[2] = "Andrea";
		
		for (int i = 0; i < 3; i++) {
			System.out.println(nomesProfessores[i]);
		}
	
		String profResponsavel = entradas.next();
		
		for (int i = 0; i < 3; i++) {
			if (!profResponsavel.equals(nomesProfessores[i])) {
				System.out.println("O nome informado n�o consta na lista, favor inserir novamente: ");
				profResponsavel = entradas.next();
			} else {
				setProfResponsavel(profResponsavel);				
			}
		}
		
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public LocalDate getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	
	public String getProfResponsavel() {
		return profResponsavel;
	}
	
	public void setProfResponsavel(String profResponsavel) {
		this.profResponsavel = profResponsavel;
	}
	
	public List<Pesquisador> getEquipe() {
		return equipe;
	}
	
	public void setEquipe(List<Pesquisador> equipe) {
		this.equipe = equipe;
	}
}
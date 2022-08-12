public class Aluno implements Pesquisador {
    // Atributos
	private String nome;
    private String matricula;
    private double[] notas;

    // Getters e setters
    public String getMatricula() {
    	return matricula;
    }
    
    public void setMatricula(String matricula) {
    	this.matricula = matricula;
    }
    
    public double[] getNotas() {
    	return notas;
    }
    
    public void setNotas(double[] notas) {
    	this.notas = notas;
    }
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// M�todos
    public String obterInfo() {
		String info =  "Nome Aluno = " + getNome() + ";";
		info +=  "Matr�cula = " + getMatricula() + ";";
		info +=  "Matr�cula = " + getMatricula() + ";";
		info +=  "Notas = ";
		
		int soma = 0;
		double media = soma / 4;
		
		info +=  "\n " + "M�dia = " + media + " - ";
		
		if (media >= 7) {
			info += "Aprovado"; 
		} else {
			info += "Reprovado"; 
		}
		
		return info;			
	}
	
	public double obterMedia() {
		int soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		
		return soma / 4;
	}
	
	// M�todos implementados
	@Override
	public String getTipo() {
		return "Aluno";
	}
}

public abstract class Funcionario {
    // Atributos
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String ctps;
    private double salario;

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString
    @Override
    public String toString() {
        return "CPF: " + cpf
                + "\nCTPS: " + ctps
                + "\nEndereco: " + endereco
                + "\nNome: " + nome
                + "\nSalário: " + salario + " reais"
                + "\nTelefone: " + telefone;
    }

    // Métodos
    public abstract double calcularSalario(double salarioBase, double valorDedicacaoExclusiva, double retribTitulacao,
            double auxTransporte, double auxAlimentacao);
}

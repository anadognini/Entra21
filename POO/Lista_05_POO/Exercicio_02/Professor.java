import java.util.Scanner;

public class Professor extends Funcionario {
    // Atributos
    private String titulacao;
    private String areaDePesquisa;

    // Construtor
    public Professor(Scanner entradas) {
        System.out.println("Informe a titulação: ");
        String titulacaoProfessor = entradas.next();
        this.setTitulacao(titulacaoProfessor);

        System.out.println("Informe a área de pesquisa: ");
        String areaProfessor = entradas.next();
        this.setAreaDePesquisa(areaProfessor);

        System.out.println("Informe o nome: ");
        String nomeProfessor = entradas.next();
        this.setNome(nomeProfessor);

        System.out.println("Informe o endereço: ");
        String enderecoProfessor = entradas.next();
        this.setEndereco(enderecoProfessor);

        System.out.println("Informe o telefone: ");
        String telefoneProfessor = entradas.next();
        this.setTelefone(telefoneProfessor);

        System.out.println("Informe o CPF: ");
        String cpfProfessor = entradas.next();
        this.setCpf(cpfProfessor);

        System.out.println("Informe o número da CTPS: ");
        String cptsProfessor = entradas.next();
        this.setCtps(cptsProfessor);

        System.out.println("Informe o salário base: ");
        double salarioBase = entradas.nextDouble();

        System.out.println("Informe o valor de dedicação exclusiva: ");
        double valorDedicacaoExclusiva = entradas.nextDouble();

        System.out.println("Informe a retribuição da titulação: ");
        double retribTitulacao = entradas.nextDouble();

        this.calcularSalario(salarioBase, valorDedicacaoExclusiva, retribTitulacao, 0, 0);
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

    // Método toString
    @Override
    public String toString() {
        String s = "\nTitulação: " + titulacao
                + "\nÁrea de pesquisa: " + areaDePesquisa
                + "\n" + super.toString();

        return s;
    }

    // Implementando o método calcularSalario da super classe
    public double calcularSalario(double salarioBase, double valorDedicacaoExclusiva, double retribTitulacao,
            double auxTransporte, double auxAlimentacao) {
        this.setSalario(salarioBase + valorDedicacaoExclusiva + retribTitulacao);

        return this.getSalario();
    }
}

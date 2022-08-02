import java.util.Scanner;

public class Tecnico extends Funcionario {
    // Atributos
    private String cargo;
    private String departamento;

    // Construtor
    public Tecnico(Scanner entradas) {
        System.out.println("Insira as informações do técnico administrativo: ");

        System.out.println("Informe o cargo: ");
        String cargoTecnico = entradas.next();
        this.setCargo(cargoTecnico);

        System.out.println("Informe o departamento: ");
        String departamentoTecnico = entradas.next();
        this.setCargo(departamentoTecnico);

        System.out.println("Informe o nome: ");
        String nomeTecnico = entradas.next();
        this.setNome(nomeTecnico);

        System.out.println("Informe o endereço: ");
        String enderecoTecnico = entradas.next();
        this.setEndereco(enderecoTecnico);

        System.out.println("Informe o telefone: ");
        String telefoneTecnico = entradas.next();
        this.setTelefone(telefoneTecnico);

        System.out.println("Informe o CPF: ");
        String cpfTecnico = entradas.next();
        this.setCpf(cpfTecnico);

        System.out.println("Informe o número da CTPS: ");
        String cptsTecnico = entradas.next();
        this.setCtps(cptsTecnico);

        System.out.println("Informe o salário base: ");
        double salarioBase = entradas.nextDouble();

        System.out.println("Informe o valor do auxílio transporte: ");
        double auxTransporte = entradas.nextDouble();

        System.out.println("Informe o valor do auxílio alimentação: ");
        double auxAlimentacao = entradas.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double quantHoras = entradas.nextDouble();

        System.out.println("Informe o valor recebido por hora: ");
        double valorHora = entradas.nextDouble();

        this.calcularSalario(salarioBase, 0, 0, auxTransporte, auxAlimentacao);
        this.calcularSalario(quantHoras, valorHora);
    }

    // Getters e setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Método toString
    @Override
    public String toString() {
        String s = "\nCargo: " + cargo
                + "\nDepartamento: " + departamento
                + "\n" + super.toString();

        return s;
    }

    // Implementando o método calcularSalario da super classe
    public double calcularSalario(double salarioBase, double valorDedicacaoExclusiva, double retribTitulacao,
            double auxTransporte, double auxAlimentacao) {
        this.setSalario(salarioBase + auxTransporte + auxAlimentacao);

        return this.getSalario();
    }

    // Sobrecarregando o método calcularSalario
    public double calcularSalario(double quantHoras, double valorHora) {
        this.setSalario(this.getSalario() + ((quantHoras * valorHora)));

        return this.getSalario();
    }
}

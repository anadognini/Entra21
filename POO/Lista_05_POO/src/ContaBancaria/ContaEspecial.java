public class ContaEspecial extends ContaBancaria {
    // Atributos
    private double limite;

    // Getters e setters
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Método toString
    @Override
    public String toString() {
        String s = "Limite: " + limite
                + "\n" + super.toString();

        return s;
    }

    // Sobrescrevendo o método sacar da super classe
    public boolean sacar(double valor) {
        double saldoComLimite = this.getSaldo() + this.getLimite();

        if ((saldoComLimite - valor) >= 0) {
            this.setSaldo(this.getSaldo() - valor);

            return true;
        }

        return false;
    }
}

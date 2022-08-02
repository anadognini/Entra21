import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
    // Atributos
    private int diaRendimento;

    // Getters e setters
    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    // Método toString
    @Override
    public String toString() {
        String s = "Dia do rendimento: " + diaRendimento
                + "\n" + super.toString();

        return s;
    }

    /*  Método que irá calcular o novo saldo com base na taxa de rendimento.
        A classe Calendar está senod usada para obter a data atual e comparar com a data
    do dia do Rendimento fornecida pelo usuário. */
    
    public boolean calcularNovoSaldo(double taxaDeRendimento) {
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            // saldo += saldo * taxaDeRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaDeRendimento));

            return true;
        }

        return false;
    }
}

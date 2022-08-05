package ContaBancaria;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Random random = new Random();

        ContaPoupanca contaPoupanca1 = new ContaPoupanca();
        contaPoupanca1.depositar(200);
        contaPoupanca1.setNumConta(138718379);
        contaPoupanca1.setNomeCliente("Nicole");
        contaPoupanca1.setSaldo(1000);

        ContaPoupanca contaPoupanca2 = new ContaPoupanca();
        contaPoupanca2.depositar(400);
        contaPoupanca2.setNumConta(146174671);
        contaPoupanca2.setNomeCliente("Emanuel");
        contaPoupanca2.setSaldo(300);

        ContaPoupanca contaPoupanca3 = new ContaPoupanca();
        contaPoupanca3.depositar(100);
        contaPoupanca3.setNumConta(673847538);
        contaPoupanca3.setNomeCliente("Rafael");
        contaPoupanca3.setSaldo(40000);

        ContaPoupanca contaPoupanca4 = new ContaPoupanca();
        contaPoupanca4.depositar(1000);
        contaPoupanca4.setNumConta(187461746);
        contaPoupanca4.setNomeCliente("Eduardo");
        contaPoupanca4.setSaldo(100);

        List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
        contas.add(contaPoupanca1);
        contas.add(contaPoupanca2);
        contas.add(contaPoupanca3);
        contas.add(contaPoupanca4);

        Collections.sort(contas);

        // Ordenando por ordem reversa
        // Collections.reverse(contas);

        ContaPoupanca contaPrincipal;

        // Ordenando pelo número da conta
        // for (int i = 0; i < contas.size(); i++) {
        //     contaPrincipal = contas.get(i);
        //     System.out.println(contaPrincipal.getNumConta() + " ");
        // }

        // Ordenando por ordem alfabética
        // for (int i = 0; i < contas.size(); i++) {
        // contaPrincipal = contas.get(i);
        // System.out.println(contaPrincipal.getNomeCliente() + " ");
        // }

    //     for (int i = 0; i < contas.size(); i++) {
    //         int rdm = contas.get(aleatorio.nextInt();
    //         System.out.println(saldosAleatorios + " ");
    //     }
    }
}

/**
 * Insira novas contas através de um laço atribuindo saldos aleatórioscom um
 * objeto (java.util.Random) altere a ordenação para o saldo.
 * Teste a ordenação.Dica: utilize um array ContaPoupanca[ ] e utilize em random
 * nextDouble * 2000
 */

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

        ContaPoupanca contaPrincipal;

        // Ordenando pelo número da conta
        // for (int i = 0; i < contas.size(); i++) {
        //  contaPrincipal = contas.get(i);
        //  System.out.println(contaPrincipal.getNumConta() + " ");
        // }

        // Ordenando por ordem reversa
        // Collections.reverse(contas);

        // Ordenando por ordem alfabética
        // for (int i = 0; i < contas.size(); i++) {
        //  contaPrincipal = contas.get(i);
        //  System.out.println(contaPrincipal.getNomeCliente() + " ");
        // }

        // Adicionando novas contas aleatórias
        
        ContaPoupanca[] co = new ContaPoupanca[4];

        for (int i = 0; i < co.length; i++) {
            co[i] = new ContaPoupanca();
            co[i].saldo = random.nextDouble() * 2000;
        }

        contas.add(co[0]);
        contas.add(co[1]);
        contas.add(co[2]);
        contas.add(co[3]);

        for (ContaPoupanca cp : contas) {
            System.out.println(cp.saldo + " ");
        }
    }
}

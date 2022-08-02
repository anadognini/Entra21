package Lista08matriz3d;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[][] agenda = new String[24][30];

        System.out.println("Informe a hora do compromisso: ");
        int hora = in.nextInt();

        System.out.println("Informe o dia em que deseja marcar o compromisso: ");
        int dia = in.nextInt();

        System.out.println("Escreva o compromisso que deseja: ");
        agenda[hora][dia] = in.next();

        if (agenda[hora][dia] == null) {
            agenda[hora][dia] = "";
        }

        for (int i = 0; i < agenda.length; i++) {
            for (int j = 0; j < agenda[i].length; j++) {
                System.out.print(" " + agenda[i][j] + "\t");
            }

            System.out.println();
        }

        in.close();
    }
}

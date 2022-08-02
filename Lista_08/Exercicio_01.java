package Lista08matriz3d;

import java.util.Random;

public class Exercicio_01 {
    public static void main(String[] args) {
        Random numeroAleato = new Random();
        int[][] matrizAleato = new int[4][4];

        for (int i = 0; i < matrizAleato.length; i++) {
            for (int j = 0; j < matrizAleato[i].length; j++) {

                matrizAleato[i][j] = numeroAleato.nextInt(100);
            }
        }

        for (int i = 0; i < matrizAleato.length; i++) {
            for (int j = 0; j < matrizAleato[i].length; j++) {
                System.out.print("\n" + matrizAleato[i][j] + "\t");
            }

            System.out.println();
        }
    }
}

public class TesteException {
    public static void main(String[] args) throws Exception {
        System.out.println("Início do Main");
        metodo1();
        System.out.println("Fim do Main");
    }

    // Métodos
    static void metodo1() {
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    static void metodo2() {
        System.out.println("Início do método 2");

        int[] array = new int[10];

        System.out.print("\n");

        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "\nHouve um erro! O array tem menos posições do que os valores a serem iterados pelo array.\nTamanho do array: "
                            + array.length
                            + "\nQuantidade de valores a serem iterados pela estrutura de repetição: " + 15
                            + "\nPara corrigir, devemos mudar o valor 15 para 9:");

            System.out.print("\n");

            for (int i = 0; i < array.length; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }

        System.out.println("\nFim do método 2");
    }
}

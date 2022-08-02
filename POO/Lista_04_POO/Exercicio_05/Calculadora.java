public class Calculadora {
    public Calculadora() {}

    public static int somarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtrairNumeros(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicarNumeros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static int dividirNumeros(int numero1, int numero2) {
        return (int) numero1 / numero2;
    }

    public static int elevarNumeros(int numero1, int potencia) {
        return (int) Math.pow(numero1, potencia);
    }
}

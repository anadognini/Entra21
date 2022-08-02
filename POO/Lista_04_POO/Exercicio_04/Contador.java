public class Contador {
    private static int contador;

    public Contador() {
        this.contador += 1;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }

    public static void zerarContador() {
		contador = 0;
	}
}

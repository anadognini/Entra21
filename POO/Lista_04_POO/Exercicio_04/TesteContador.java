public class TesteContador {
    public static void main(String[] args) {
        // Incrementa uma vez
        Contador contador1 = new Contador();
        System.out.println(contador1.getContador());

        // Incrementa duas vezes
        Contador contador2 = new Contador();
        System.out.println(contador2.getContador());

        // Incrementa três vezes
        Contador contador3 = new Contador();
        System.out.println(contador3.getContador());

        // Zera o contador
        contador3.zerarContador();
        System.out.println(contador3.getContador());

        // Passa a incrementar novamente
        Contador contador4 = new Contador();
        System.out.println(contador4.getContador());
    }
}

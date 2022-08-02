import java.util.Scanner;

public class TesteConversaoDeUnidadesDeTempo {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        ConversaoDeUnidadesDeTempo unidades = new ConversaoDeUnidadesDeTempo();

        System.out.println("Informe um número: ");
        int tempo = entradas.nextInt();

        System.out.println(tempo + " minutos = " + unidades.converterMinutosParaSegundos(tempo) + " segundos");
        System.out.println(tempo + " horas = " + unidades.converterHorasParaMinutos(tempo) + " minutos");
        System.out.println(tempo + " dias = " + unidades.converterDiasParaHoras(tempo) + " horas");
        System.out.println(tempo + " semanas = " + unidades.converterSemanasParaDias(tempo) + " dias");
        System.out.println(tempo + " meses = " + unidades.converterMesParaDias(tempo) + " dias");
        System.out.println(tempo + " anos = " + unidades.converterAnosParaDias(tempo) + " dias");

        entradas.close();
    }
}

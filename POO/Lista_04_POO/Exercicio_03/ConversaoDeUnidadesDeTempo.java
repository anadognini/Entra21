public class ConversaoDeUnidadesDeTempo {
    public ConversaoDeUnidadesDeTempo() {}

    // Minutos para segundos
    public static int converterMinutosParaSegundos (int tempo) {
        return tempo * 60;
    }

    // Horas para minutos
    public static int converterHorasParaMinutos (int tempo) {
        return tempo * 60;
    }

    // Dias para horas
    public static int converterDiasParaHoras (int tempo) {
        return tempo * 24;
    }

    // Semanas para dias
    public static int converterSemanasParaDias (int tempo) {
        return tempo * 7;
    }

    // Mês para dias
    public static int converterMesParaDias (int tempo) {
        return tempo * 30;
    }

    // Ano para dias
    public static float converterAnosParaDias (int tempo) {
        return tempo * 365.25f;
    }
}
public class Contato {
    private static String nome;
    private static String telefone;
    private static String email;

    public Contato() {}

    public String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Contato.nome = nome;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        Contato.telefone = telefone;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Contato.email = email;
    }

    public String obterInfo() {
        return "\nNome: " + this.nome +
                "\nTelefone: " + this.telefone +
                "\nE-mail: " + this.email;
    }
}

// Cada contato possui nome, telefone e email. 
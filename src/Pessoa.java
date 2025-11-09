public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    // Construtor padrão
    public Pessoa() {}

    // Construtor com parâmetros
    public Pessoa(String nome, int idade, String email) {
        setNome(nome);
        setIdade(idade);
        setEmail(email);
    }

    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade inválida.");
        }
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.email = email;
    }

    // Método que será sobrescrito nas subclasses
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Email: " + email);
    }
}

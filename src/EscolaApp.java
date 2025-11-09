public class EscolaApp {
    public static void main(String[] args) {
        // Criando objetos de Aluno e Professor
        Aluno aluno1 = new Aluno("João Silva", 16, "joao@email.com", "A123", 8.7);
        Professor prof1 = new Professor("Maria Souza", 35, "maria@escola.com", "Matemática", 4500.00);

        // Exibindo informações (polimorfismo em ação)
        aluno1.exibirInformacoes();
        prof1.exibirInformacoes();
    }
}

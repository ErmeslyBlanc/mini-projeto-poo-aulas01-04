public class EscolaTest {
    private static int checks = 0;

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 22, "ana@example.com");
        check("Ana".equals(pessoa.getNome()), "Person name");
        check(pessoa.getIdade() == 22, "Person age");
        check("ana@example.com".equals(pessoa.getEmail()), "Person email");

        Aluno aluno = new Aluno("Joao", 16, "joao@example.com", "A123", 8.5);
        check(aluno instanceof Pessoa, "Student inherits Person");
        check("A123".equals(aluno.getMatricula()), "Student registration");
        check(aluno.getNotaMedia() == 8.5, "Student average");

        Professor professor = new Professor("Maria", 35, "maria@example.com", "Matematica", 4500);
        check(professor instanceof Pessoa, "Teacher inherits Person");
        check("Matematica".equals(professor.getDisciplina()), "Teacher subject");
        check(professor.getSalario() == 4500, "Teacher salary");

        expectInvalid(() -> new Pessoa("", 10, "valid@example.com"), "Empty name");
        expectInvalid(() -> new Pessoa("Ana", -1, "valid@example.com"), "Negative age");
        expectInvalid(() -> new Pessoa("Ana", 10, "invalid"), "Invalid email");
        expectInvalid(() -> new Aluno("Ana", 10, "a@example.com", "", 8), "Empty registration");
        expectInvalid(() -> new Aluno("Ana", 10, "a@example.com", "A1", -1), "Grade below zero");
        expectInvalid(() -> new Aluno("Ana", 10, "a@example.com", "A1", 11), "Grade above ten");
        expectInvalid(() -> new Professor("Ana", 30, "a@example.com", "", 2000), "Empty subject");
        expectInvalid(() -> new Professor("Ana", 30, "a@example.com", "History", -1), "Negative salary");

        System.out.println("PASS: " + checks + " checks");
    }

    private static void check(boolean success, String label) {
        if (!success) {
            throw new AssertionError("Failed: " + label);
        }
        checks++;
    }

    private static void expectInvalid(Runnable action, String label) {
        try {
            action.run();
        } catch (IllegalArgumentException expected) {
            checks++;
            return;
        }
        throw new AssertionError("Expected IllegalArgumentException: " + label);
    }
}

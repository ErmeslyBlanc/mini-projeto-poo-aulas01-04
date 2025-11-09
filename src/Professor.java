public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    // Construtor com parâmetros
    public Professor(String nome, int idade, String email, String disciplina, double salario) {
        super(nome, idade, email);
        setDisciplina(disciplina);
        setSalario(salario);
    }

    // Getters e Setters com validação
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina == null || disciplina.isEmpty()) {
            throw new IllegalArgumentException("Disciplina inválida.");
        }
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário inválido.");
        }
        this.salario = salario;
    }

    // Sobrescrita do método
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Professor ===");
        super.exibirInformacoes();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$ " + salario);
        System.out.println();
    }
}


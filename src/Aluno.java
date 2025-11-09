public class Aluno extends Pessoa {
    private String matricula;
    private double notaMedia;

    // Construtor com parâmetros
    public Aluno(String nome, int idade, String email, String matricula, double notaMedia) {
        super(nome, idade, email);
        setMatricula(matricula);
        setNotaMedia(notaMedia);
    }

    // Getters e Setters com validação
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()) {
            throw new IllegalArgumentException("Matrícula inválida.");
        }
        this.matricula = matricula;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        if (notaMedia < 0 || notaMedia > 10) {
            throw new IllegalArgumentException("Nota média deve estar entre 0 e 10.");
        }
        this.notaMedia = notaMedia;
    }

    // Sobrescrita de método (polimorfismo)
    @Override
    public void exibirInformacoes() {
        System.out.println("=== Aluno ===");
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota média: " + notaMedia);
        System.out.println();
    }
}

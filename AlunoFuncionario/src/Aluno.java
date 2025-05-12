public class Aluno {
    public int ra;
    public String nome;
    public String login;
    public String senha;

    public void matricular() {
        System.out.println("Matriculando o aluno " + nome);
        System.out.println("Seu RA é: " + ra);
    }

    public void cancelarMatricula() {
        System.out.println("Cancelando a matrícula do aluno " + nome);
    }
}
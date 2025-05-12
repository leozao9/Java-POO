public class Funcionario {
    public static void main(String[] args) throws Exception {
        Aluno aluno1, aluno2;
        // Criando uma instância de aluno
        aluno1 = new Aluno();
        // Atribuiu valores a essa instância
        aluno1.ra = 123;
        aluno1.nome = "João";
        aluno1.login = "joao";
        aluno1.senha = "123";
        // Invocar (chamar) o método matricular
        aluno1.matricular();
        // Criando uma nova instância de aluno
        aluno2 = new Aluno();
        // Atribuiu valores a essa instância
        aluno2.ra = 124;
        aluno2.nome = "Tereza";
        aluno2.login = "tereza";
        aluno2.senha = "456";
        // Invocar (chamar) o método matricular
        aluno2.matricular();
        // Invocar (chamar) o método cancelarMatricula
        aluno1.cancelarMatricula();
    }
}
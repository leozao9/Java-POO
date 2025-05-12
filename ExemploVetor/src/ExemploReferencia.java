public class ExemploReferencia {
    public static void alterarDados(Pessoa p) {
        p.nome = "Jose";
        p.idade = 40;
        System.out.println(p.nome);
        System.out.println(p.idade);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Oscar";
        p.idade = 45;
        alterarDados(p);
        System.out.println(p.nome);
        System.out.println(p.idade);
    }
}
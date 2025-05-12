public class ExemploValor {
    public void alterarDados(int valor) {
        valor++;
        System.out.println(valor);
    }

    public static void main(String[] args) {
        int valor = 10;
        ExemploValor exemplo = new ExemploValor();
        exemplo.alterarDados(valor);
        System.out.println(valor);
    }
}
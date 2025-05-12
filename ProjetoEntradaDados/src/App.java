import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int a, b, soma;
        System.out.println("Digite valor de a: ");
        a = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite um valor de b:");
        b = Integer.parseInt(entrada.nextLine());
        soma = a + b;
        System.out.println("Soma: " + soma);
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            int a, b;
            System.out.println("Digite um valor inteiro: ");
            a = scanner.nextInt();
            System.out.println("Digite outro valor inteiro: ");
            b = scanner.nextInt();
            int resultado = a / b;

            System.out.println("Resultado da divisao inteira: " + resultado);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Valor inválido. Digite apenas números inteiros.");
            System.out.println("Digite apenas números inteiros.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Não é possível dividir por zero.");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Ocorreu um erro inesperado.");
        } finally {

            System.out.println("Executou o bloco independente de erro.");
            System.out.println("Fim do programa.");
        }

    }
}


import java.util.Scanner;
import model.Conta;

public class GerenciarCaixa {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        try {
            // depositar valores na conta1. Sacar da conta1. mostrar o saldo da conta1
            conta1.depositar(1000.0);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor a ser depositado na conta1: ");
            double valor = scanner.nextDouble();
            conta1.depositar(valor);
            conta1.sacar(50);
            System.out.println("Saldo conta1: " + conta1.getSaldo());

            // sacar da conta2. mostrar o saldo da conta2
            conta2.sacar(1000);
            System.out.println("Saldo conta2: " + conta2.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

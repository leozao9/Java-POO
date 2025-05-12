public class ContaTeste {
    public static void main(String[] args) {
        // Teremos duas contas.
        // A primeira conta, o saque será processado
        // A segunda conta, o saque não será processado (pois não há saldo suficiente)
        Conta conta1 = new Conta();
        conta1.conta = 123;
        conta1.agencia = 786;
        conta1.nome = "João";
        conta1.efetuarDeposito(1500);

        Conta conta2 = new Conta();
        conta2.conta = 457;
        conta1.agencia = 786;
        conta2.nome = "Maria";
        conta2.efetuarDeposito(1000);

        // Saque de 200 da conta1
        boolean sacou = conta1.efetarSaque(200);
        if (sacou) {
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");

        }
        // Saque de 3000 da conta2
        sacou = conta2.efetarSaque(3000);
        if (sacou) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");

        }

        // apresentar o saldo da conta1
        System.out.println("Saldo da conta 1: " + conta1.saldo);

    }
}
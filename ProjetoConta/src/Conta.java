public class Conta {
    public int conta;
    public int agencia;
    public double saldo;
    public String nome;
    public static double cpmf = 0.0038;

    public void efetuarDeposito(double valor) {
        saldo += valor;
    }

    public boolean efetarSaque(double valor) {
        // verifica se o saldo é suficiente
        if (valor <= saldo) {
            saldo -= valor + (valor * cpmf);
            return true;
        }
        return false;
    }

}
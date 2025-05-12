package model;

public class Corrente extends Conta {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // metodos sacar e imprimir
    @Override
    public boolean sacar(double valor) {
        if (valor <= (getSaldo() + limite)) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite: " + limite);
    }

    @Override
    public double calcularTaxaDeManutencao() {
        return 22.0; // Exemplo de taxa de manutenção para conta corrente
    }
}
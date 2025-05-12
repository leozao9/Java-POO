package model;

public class Poupanca extends Conta {
    private double taxaJuros;

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Taxa Juros: " + taxaJuros);
    }

    @Override
    public double calcularTaxaDeManutencao() {
        return 0.0; // Poupança não tem taxa de manutenção
    }
}
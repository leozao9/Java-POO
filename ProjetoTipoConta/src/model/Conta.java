package model;

public abstract class Conta {
    private int numConta;
    private String nomeCliente;
    private double saldo;

    abstract double calcularTaxaDeManutencao();

    // métodos getters and setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // métodos da regra de negócio
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void imprimir() {
        System.out.println("Num. Conta: " + numConta);
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
}
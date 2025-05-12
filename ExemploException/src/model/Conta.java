package model;

import exception.ContaException;

public class Conta {

    private double saldo;

    public Conta() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) throws ContaException {
        if (valor <= 0) {
            throw new ContaException("RF01EX01");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws ContaException {
        if (valor > saldo) {
            throw new ContaException("RF01EX02");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
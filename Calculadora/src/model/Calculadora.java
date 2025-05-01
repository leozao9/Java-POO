package model;

public class Calculadora {
    private double vlr1;
    private double vlr2;
    private double result;

    public void setV1(double vlr1) {
        this.vlr1 = vlr1;
    }

    public void setV2(double vlr2) {
        this.vlr1 = vlr2;
    }

    public double somar(double vlr1, double vlr2) {
        result = vlr1 + vlr2;
        return result;
    }

    public double subtrair(double vlr1, double vlr2) {
        result = vlr1 - vlr2;
        return result;
    }

    public double multiplicar(double vlr1, double vlr2) {
        result = vlr1 * vlr2;
        return result;
    }

    public double dividir(double vlr1, double vlr2) {
        if (vlr2 != 0) {
            result = vlr1 / vlr2;
            return result;
        } else {
            throw new ArithmeticException("Divisão por zero!");
        }
    }

    public double getResult() {
        return result;
    }
}
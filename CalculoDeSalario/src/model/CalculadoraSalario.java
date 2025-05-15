package model;

public class CalculadoraSalario {

    public double calcularAcrescimo(double salarioBase, boolean grupoCritico, boolean grupoEspecial) {
        if (grupoCritico) {
            return salarioBase * 0.10;
        } else if (grupoEspecial) {
            return salarioBase * 0.13;
        }
        return 0;
    }

    public double calcularSalarioFinal(double salarioBase, double acrescimo) {
        return salarioBase + acrescimo;
    }
}
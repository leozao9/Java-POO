package model;

public class Funcionario {

    private String matricula;
    private String nome;
    private double salarioBase;
    private String tipoContrato; //Horista ou Mensalista
    private String grupoTrabalho; //Grupo Crítico ou Grupo Especial

    public Funcionario(String matricula, String nome, double salarioBase, String tipoContrato, String grupoTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.tipoContrato = tipoContrato;
        this.grupoTrabalho = grupoTrabalho;
    }

    // Getters e Setters
    public double calcularAumento() {
        if (grupoTrabalho.equals("Grupo Crítico")) {
            return salarioBase * 0.10;
        } else {
            return salarioBase * 0.13;
        }
    }

    public double calcularSalarioFinal() {
        return salarioBase + calcularAumento();
    }
}
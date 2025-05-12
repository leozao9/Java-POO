package model;

public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private int anoFab;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public void imprimir() {
        System.out.println("Dados do Carro");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Placa: " + placa);
        System.out.println("Ano de Fabricação: " + anoFab);
        System.out.println("------------------------------------");
    }
}
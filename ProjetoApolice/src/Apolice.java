public class Apolice {
    // 1. Atributos
    private String nomeSegurado;
    private int idade;
    private float valorPremio;

    // 2. Métodos
    public void imprimir() {
        System.out.println("Nome do segurado: " + nomeSegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do prêmio R$: " + valorPremio);
    }

    // 3. Getters e Setters
    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

}
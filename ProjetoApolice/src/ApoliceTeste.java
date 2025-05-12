public class ApoliceTeste {

    public static void main(String[] args) {
        Apolice apolice = new Apolice(); // Construir o objeto apolice
        // Atribuir valores aos atributos da classe
        apolice.setNomeSegurado("Maria da Silva");
        apolice.setIdade(23);
        apolice.setValorPremio(1500);

        // Invocar o método para imprimir o objeto
        apolice.imprimir();
    }

}
public class ComputadorTeste {
    public static void main(String[] args) throws Exception {
        Computador computador1 = new Computador();
        computador1.setMarca("HP");
        computador1.setModelo("Modelo novo");
        computador1.setCor("Prata");
        computador1.setNumeroSerie(1234);
        computador1.setPreco(5000);
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.setMarca("IBM");
        computador2.setModelo("Modelo velho");
        computador2.setCor("Razor");
        computador2.setNumeroSerie(345);
        computador2.setPreco(5000);
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        if (computador2.alterarValor(-5000)) {
            System.out.println("Valor alterado com sucesso!");
        } else {
            System.out.println("Valor não pode ser alterado!");
        }
        System.out.println("VAlor atual: " + computador2.getPreco());
    }
}
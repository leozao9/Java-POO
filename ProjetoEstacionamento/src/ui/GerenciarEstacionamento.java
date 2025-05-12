package ui;

import model.Carro;
import model.Cliente;

public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Cliente leonardo = new Cliente();
        leonardo.setNome("Leonardo Prado Mestrinel");
        leonardo.setEmail("leonardo@gmail.com");
        leonardo.setTelefone("11 9999-9999");
        leonardo.imprimir();
        System.out.println();
        Carro pulse = new Carro();
        pulse.setModelo("Pulse");
        pulse.setMarca("Fiat");
        pulse.setPlaca("ABC-1234");
        pulse.setAnoFab(2023);

        Carro santafe = new Carro();
        santafe.setModelo("Santa Fé");
        santafe.setMarca("Hyundai");
        santafe.setPlaca("DEF-5678");
        santafe.setAnoFab(2018);

        leonardo.adicionarCarro(pulse);
        leonardo.adicionarCarro(santafe);
        leonardo.imprimir();

        leonardo.removerCarro(pulse);
        System.out.println();
        leonardo.imprimir();
    }
}
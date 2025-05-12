import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Tabuleiro tabu = new Tabuleiro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o palpite 1");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Dgiite o palpite dois: ");
        int y = Integer.parseInt(sc.nextLine());

        double premio = tabu.jogar(x, y);
        if (premio > 0) {
            System.out.println("Parabéns. Seu premio eh R$ " + premio);
        } else {
            System.out.println("Dancou. Deu banca");
        }
    }
}
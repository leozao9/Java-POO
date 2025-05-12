import java.util.Random;

public class Tabuleiro {
    private int matriz[][] = new int[10][10];
    private int palpites[] = new int[2];

    public Tabuleiro() {
        Random aleatorio = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = aleatorio.nextInt(101);
            }
        }
    }

    public double jogar(int p1, int p2) {
        palpites[0] = p1;
        palpites[1] = p2;
        int acertos = verificarAcertos();
        mostrarTabuleiro();
        if (acertos >= 3) {
            return acertos * 1000;
        } else {
            return 0;
        }
    }

    private int verificarAcertos() {
        int total = 0; // total de acertos
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == palpites[0] || matriz[i][j] == palpites[1]) {
                    total++;
                }
            }

        }
        return total;
    }

    private void mostrarTabuleiro() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == palpites[0] || matriz[i][j] == palpites[1]) {
                    System.out.printf("[%3d]**  ", matriz[i][j]);
                } else {
                    System.out.printf("[%3d]    ", matriz[i][j]);
                }
            }
            System.out.println();

        }
    }
}
import java.util.Arrays;

public class Exemplo3 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        // percorrer um vetor para preencher
        // for(int i=0; i<10; i++){
        // vetor[i] = 20;
        // }
        Arrays.fill(vetor, 20);
        // percorrer um vetor
        for (int x : vetor) {
            System.out.println(x);
        }
    }
}
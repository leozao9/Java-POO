public class Exemplo1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        // percorrer um vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        // alternativa
        for (int x : vetor) {
            System.out.println(x);
        }
    }
}
import java.util.Arrays;

public class Exemplo2 {
    public static void main(String[] args) {
        int[] v = { 33, 11, 1, 5, 7, 2, 12 };
        Arrays.sort(v);
        for (int x : v) {
            System.out.println(x);
        }
    }
}
public class Exemplo4 {
    public static void main(String[] args) {
        int[] v1 = { 3, 7, 9, 2, 4, 6, 1, 7, 9, 1 };
        int[] v2 = new int[10];
        System.arraycopy(v1, 3, v2, 6, 4);
        for (int x : v2) {
            System.out.println(x);
        }
    }
}
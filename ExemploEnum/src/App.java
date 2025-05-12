public class App {
    public static void main(String[] args) throws Exception {
        DiasSemana dia = DiasSemana.quinta;
        System.out.println(dia);

        for (DiasSemana x : DiasSemana.values()) {
            System.out.println(x);
        }
    }
}
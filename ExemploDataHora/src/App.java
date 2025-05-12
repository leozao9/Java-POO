import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
       LocalDate dataHoje = LocalDate.now();
       System.out.println(dataHoje);
       LocalTime horaAgora = LocalTime.now();
       System.out.println(horaAgora);

       LocalDate dataOntem = LocalDate.of(2024, 04, 9);
       System.out.println(dataOntem);

    }
}
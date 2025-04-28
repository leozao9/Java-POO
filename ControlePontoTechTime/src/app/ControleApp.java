package app;

import model.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ControleApp {
    public static void main(String[] args) throws InterruptedException {
        List<Funcionario> funcionarios = new ArrayList<>();
        List<RegistroPonto> registros = new ArrayList<>();

        Gerente g1 = new Gerente();
        g1.setNome("João Silva");
        funcionarios.add(g1);

        Secretaria s1 = new Secretaria();
        s1.setNome("Maria Santos");
        funcionarios.add(s1);

        Operador o1 = new Operador();
        o1.setNome("Paulo Andrade");
        o1.setValorHora(new BigDecimal("40.00"));
        funcionarios.add(o1);

        for (Funcionario f : funcionarios) {
            RegistroPonto rp = new RegistroPonto();
            rp.setFunc(f);
            rp.setDataRegistro(LocalDate.now());
            rp.setHoraEntrada(LocalDateTime.of(LocalDate.now(), LocalTime.of(11, 0, 0)));
            rp.setHoraSaida(LocalDateTime.now());
            registros.add(rp);
        }

        for (RegistroPonto rp : registros) {
            rp.apresentarRegistroPonto();
        }
    }
}
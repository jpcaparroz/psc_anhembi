package exercicio02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppRelogio {
    public static void main(String[] args) {
        
        Relogio relogio = new Relogio();

        String horasNow = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH"));
        String minutosNow = LocalDateTime.now().format(DateTimeFormatter.ofPattern("mm"));
        String segundosNow = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ss"));

        relogio.hora = horasNow;
        relogio.minuto = minutosNow;
        relogio.segundo = segundosNow;
        
        System.out.println("Horário:");
        relogio.horario();

    }
    
}
